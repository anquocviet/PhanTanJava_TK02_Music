package fit.se;

import dao.AlbumService;
import lombok.SneakyThrows;

import java.rmi.Naming;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   private static final String URL = "rmi://VIE:8080/MusicService/";

   @SneakyThrows
   public static void main(String[] args) {

      AlbumService albumService = (AlbumService) Naming.lookup(URL + "AlbumService");
      albumService.getNumberOfAlbumsByGenre().forEach((k, v) -> System.out.println(k + " : " + v));

      albumService.listAlbumByGenre("Rock", 2020).forEach(System.out::println);

      albumService.updatePriceOfAlbum("albums1", 2020);

   }
}