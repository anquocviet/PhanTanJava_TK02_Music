
INSERT INTO genres (genre_id, name, description) VALUES ('genres1', 'Rock', 'Rock music description');

INSERT INTO artists (artist_id, name, birth_date, url) VALUES ('artists1', 'John Doe', '1990-01-01', 'http://johndoe.com');

INSERT INTO songs (song_id, name, runtime, lyric, file_link) VALUES ('songs1', 'Rock songs', '3:30', 'Rock songs lyrics', 'http://songslink.com');

INSERT INTO albums (album_id, title, price, year_of_release, download_link, genre_id) VALUES ('albums1', 'Rock albums', 10.0, 2020, 'http://albumslink.com', 'genres1');

INSERT INTO albums_artists (album_id, artist_id) VALUES ('albums1', 'artists1');

INSERT INTO albums_songs (album_id, song_id) VALUES ('albums1', 'songs1');


INSERT INTO genres (genre_id, name, description) VALUES ('genres2', 'Pop', 'Pop music description');

INSERT INTO artists (artist_id, name, birth_date, url) VALUES ('artists2', 'Jane Doe', '1992-02-02', 'http://janedoe.com');

INSERT INTO songs (song_id, name, runtime, lyric, file_link) VALUES ('songs2', 'Pop songs', '4:00', 'Pop songs lyrics', 'http://popsongslink.com');

INSERT INTO albums (album_id, title, price, year_of_release, download_link, genre_id) VALUES ('albums2', 'Pop albums', 15.0, 2021, 'http://popalbumslink.com', 'genres2');

INSERT INTO albums_artists (album_id, artist_id) VALUES ('albums2', 'artists2');

INSERT INTO albums_songs (album_id, song_id) VALUES ('albums2', 'songs2');

-- Thêm thể loại nhạc Rock
INSERT INTO genres (genre_id, name, description) VALUES ('genres3', 'Rock', 'Rock music description');

-- Thêm nghệ sĩ nhạc Rock
INSERT INTO artists (artist_id, name, birth_date, url) VALUES ('artists3', 'John Smith', '1985-05-15', 'http://johnsmith.com');

-- Thêm bài hát nhạc Rock
INSERT INTO songs (song_id, name, runtime, lyric, file_link) VALUES ('songs3', 'Rock songs', '3:45', 'Rock songs lyrics', 'http://rocksongslink.com');

-- Thêm albums nhạc Rock
INSERT INTO albums (album_id, title, price, year_of_release, download_link, genre_id) VALUES ('albums3', 'Rock albums', 20.0, 2020, 'http://rockalbumslink.com', 'genres3');

-- Liên kết nghệ sĩ với albums
INSERT INTO albums_artists (album_id, artist_id) VALUES ('albums3', 'artists3');

-- Liên kết bài hát với albums
INSERT INTO albums_songs (album_id, song_id) VALUES ('albums3', 'songs3');

-- Thêm thể loại nhạc Jazz
INSERT INTO genres (genre_id, name, description) VALUES ('genres4', 'Jazz', 'Jazz music description');

-- Thêm nghệ sĩ nhạc Jazz
INSERT INTO artists (artist_id, name, birth_date, url) VALUES ('artists4', 'Emily Brown', '1990-11-20', 'http://emilybrown.com');

-- Thêm bài hát nhạc Jazz
INSERT INTO songs (song_id, name, runtime, lyric, file_link) VALUES ('songs4', 'Jazz songs', '5:30', 'Jazz songs lyrics', 'http://jazzsongslink.com');

-- Thêm albums nhạc Jazz
INSERT INTO albums (album_id, title, price, year_of_release, download_link, genre_id) VALUES ('albums4', 'Jazz albums', 18.0, 2019, 'http://jazzalbumslink.com', 'genres4');

-- Liên kết nghệ sĩ với albums
INSERT INTO albums_artists (album_id, artist_id) VALUES ('albums4', 'artists4');

-- Liên kết bài hát với albums
INSERT INTO albums_songs (album_id, song_id) VALUES ('albums4', 'songs4');

-- Thêm thể loại nhạc EDM
INSERT INTO genres (genre_id, name, description) VALUES ('genres5', 'EDM', 'Electronic Dance Music description');

-- Thêm nghệ sĩ nhạc EDM
INSERT INTO artists (artist_id, name, birth_date, url) VALUES ('artists5', 'David Johnson', '1988-07-10', 'http://davidjohnson.com');

-- Thêm bài hát nhạc EDM
INSERT INTO songs (song_id, name, runtime, lyric, file_link) VALUES ('songs5', 'EDM songs', '3:15', 'EDM songs lyrics', 'http://edmsongslink.com');

-- Thêm albums nhạc EDM
INSERT INTO albums (album_id, title, price, year_of_release, download_link, genre_id) VALUES ('albums5', 'EDM albums', 12.0, 2023, 'http://edmalbumslink.com', 'genres5');

-- Liên kết nghệ sĩ với albums
INSERT INTO albums_artists (album_id, artist_id) VALUES ('albums5', 'artists5');

-- Liên kết bài hát với albums
INSERT INTO albums_songs (album_id, song_id) VALUES ('albums5', 'songs5');

-- Thêm thể loại nhạc Country
INSERT INTO genres (genre_id, name, description) VALUES ('genres6', 'Country', 'Country music description');

-- Thêm nghệ sĩ nhạc Country
INSERT INTO artists (artist_id, name, birth_date, url) VALUES ('artists6', 'Sarah White', '1995-03-25', 'http://sarahwhite.com');

-- Thêm bài hát nhạc Country
INSERT INTO songs (song_id, name, runtime, lyric, file_link) VALUES ('songs6', 'Country songs', '4:20', 'Country songs lyrics', 'http://countrysongslink.com');

-- Thêm albums nhạc Country
INSERT INTO albums (album_id, title, price, year_of_release, download_link, genre_id) VALUES ('albums6', 'Country albums', 17.0, 2022, 'http://countryalbumslink.com', 'genres6');

-- Liên kết nghệ sĩ với albums
INSERT INTO albums_artists (album_id, artist_id) VALUES ('albums6', 'artists6');

-- Liên kết bài hát với albums
INSERT INTO albums_songs (album_id, song_id) VALUES ('albums6', 'songs6');


