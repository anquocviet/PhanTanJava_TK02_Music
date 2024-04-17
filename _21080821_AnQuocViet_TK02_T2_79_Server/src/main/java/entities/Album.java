package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
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
@Table(name = "albums")
@NamedQueries({
   @NamedQuery(name = "Album.listAlbumByGenre",
      query = "SELECT a FROM Album a WHERE a.genre.name LIKE :genreName AND a.yearOfRelease = :yearOfRelease"),
@NamedQuery(name = "Album.getNumberOfAlbumsByGenre",
      query = "SELECT a.genre.name, COUNT(a) FROM Album a GROUP BY a.genre.name ORDER BY a.genre.name ASC")
})
public class Album implements Serializable {
   @Serial
   private static final long serialVersionUID = 1L;

   @Id
   @Column(name = "album_id")
   private String id;

   private String title;

   private double price;

   @Column(name = "year_of_release")
   private int yearOfRelease;

   @Column(name = "download_link")
   String downloadLink;

   @ManyToOne
   @JoinColumn(name = "genre_id")
   private Genre genre;

   @ManyToMany
   @JoinTable(name = "albums_artists",
      joinColumns = @JoinColumn(name = "album_id"),
      inverseJoinColumns = @JoinColumn(name = "artist_id"))
   @ToString.Exclude
   private List<Artist> artists;


   @ManyToMany
   @JoinTable(name = "albums_songs",
         joinColumns = @JoinColumn(name = "album_id"),
         inverseJoinColumns = @JoinColumn(name = "song_id"))
   @ToString.Exclude
   private List<Song> songs;

   public Album(String id, String title, double price, int yearOfRelease, String downloadLink) {
      this.id = id;
      this.title = title;
      this.price = price;
      this.yearOfRelease = yearOfRelease;
      this.downloadLink = downloadLink;
   }
}