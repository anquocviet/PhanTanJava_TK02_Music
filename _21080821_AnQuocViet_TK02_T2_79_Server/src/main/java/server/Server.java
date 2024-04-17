package server;

import dao.AlbumService;
import dao.imp.AlbumImp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @description
 * @author: vie
 * @date: 18/4/24
 */

public class Server {
   private static final String URL = "rmi://VIE:8080/MusicService/";

   public static void main(String[] args) {
      try {
         AlbumService albumService = new AlbumImp();

         Context context = new InitialContext();
         LocateRegistry.createRegistry(8080);
         context.bind(URL + "AlbumService", albumService);

         System.out.println("Server is running...");
      } catch (RemoteException | NamingException e) {
         throw new RuntimeException(e);
      }
   }
}
