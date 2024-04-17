package dao;

import entities.Album;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @description
 * @author: vie
 * @date: 17/4/24
 */
public interface AlbumService extends Remote {
   public boolean updatePriceOfAlbum(String albumId, double newPrice) throws RemoteException;
   public List<Album> listAlbumByGenre(String genreName, int yearOfRelease) throws RemoteException;
   public Map<String, Long> getNumberOfAlbumsByGenre() throws RemoteException;

}
