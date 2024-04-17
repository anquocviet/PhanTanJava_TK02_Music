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
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Table(name = "artists")
public class Artist implements Serializable {
   @Serial
   private static final long serialVersionUID = 1L;

   @Id
   @Column(name = "artist_id")
   private String id;

   private String name;

   @Column(name = "birth_date")
   private LocalDate birthDate;

   private String url;

   @ManyToMany(mappedBy = "artists")
   @ToString.Exclude
   private List<Album> albums;

   public Artist(String id, String name, LocalDate birthDate, String url) {
      this.id = id;
      this.name = name;
      this.birthDate = birthDate;
      this.url = url;
   }
}