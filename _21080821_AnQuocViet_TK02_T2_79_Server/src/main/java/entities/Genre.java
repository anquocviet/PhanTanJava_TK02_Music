package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name = "genres")
public class Genre implements Serializable {
   @Serial
   private static final long serialVersionUID = 1L;

   @Id
   @Column(name = "genre_id")
   private String id;

   private String name;

   private String description;

   @OneToMany(mappedBy = "genre")
   @ToString.Exclude
   private List<Album> albums;

   public Genre(String id, String name, String description) {
      this.id = id;
      this.name = name;
      this.description = description;
   }
}