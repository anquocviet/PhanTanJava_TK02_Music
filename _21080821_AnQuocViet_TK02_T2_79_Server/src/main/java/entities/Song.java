package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Table(name = "songs")
public class Song implements Serializable {
   @Serial
   private static final long serialVersionUID = 1L;

   @Id
   @Column(name = "song_id")
   private String id;

   private String name;

   private String runtime;

   private String lyric;

   @Column(name = "file_link")
   private String fileLink;

   @ManyToMany(mappedBy = "songs")
   @ToString.Exclude
   private List<Album> albums;

   public Song(String id, String name, String runtime, String lyric, String fileLink) {
      this.id = id;
      this.name = name;
      this.runtime = runtime;
      this.lyric = lyric;
      this.fileLink = fileLink;
   }
}