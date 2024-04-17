package dao.imp;

import entities.Album;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImpTest {
   private AlbumImp albumImp = new AlbumImp();

   AlbumImpTest() throws RemoteException {
   }

   @Test
   void updatePriceOfAlbum() {
   }

   @SneakyThrows
   @Test
   void listAlbumByGenre() {
      List<Album> albums =  albumImp.listAlbumByGenre("Pop", 2021);
      albums.forEach(System.out::println);
      assertEquals(1, albums.size());

   }

   @SneakyThrows
   @Test
   void getNumberOfAlbumsByGenre() {
      albumImp.getNumberOfAlbumsByGenre().forEach((k, v) -> System.out.println(k + " : " + v));
   }

   @BeforeEach
   void setUp() {
   }

   @AfterEach
   void tearDown() {
   }

   @Test
   void testUpdatePriceOfAlbum() {
   }

   @Test
   void testListAlbumByGenre() {
   }

   @Test
   void testGetNumberOfAlbumsByGenre() {
   }
}