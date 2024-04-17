package dao.imp;

import dao.AlbumService;
import entities.Album;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description
 * @author: vie
 * @date: 17/4/24
 */
public class AlbumImp extends UnicastRemoteObject implements AlbumService {
   EntityManager em = null;
   private final String PERSISTENCE_UNIT_NAME = "MariaDB Music";

   public AlbumImp() throws RemoteException {
      em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
   }

   @Override
   public boolean updatePriceOfAlbum(String albumId, double newPrice) throws RemoteException {
      EntityTransaction transaction = em.getTransaction();

      try {
         transaction.begin();
         Album album = em.find(Album.class, albumId);
         album.setPrice(newPrice);
         em.persist(album);
         transaction.commit();
         return true;
      } catch (Exception e) {
         e.printStackTrace();
         transaction.rollback();
         return false;
      }
   }

   @Override
   public List<Album> listAlbumByGenre(String genreName, int yearOfRelease) throws RemoteException {
      return em.createNamedQuery("Album.listAlbumByGenre", Album.class)
                   .setParameter("genreName", "%" + genreName + "%")
                   .setParameter("yearOfRelease", yearOfRelease)
                   .getResultList();
   }

   @Override
   public Map<String, Long> getNumberOfAlbumsByGenre() throws RemoteException {
      return em.createNamedQuery("Album.getNumberOfAlbumsByGenre", Object[].class)
                   .getResultList()
                   .stream()
                   .collect(Collectors.toMap(
                         e -> (String) e[0],
                         e -> (Long) e[1],
                         (a, b) -> a,
                         LinkedHashMap::new
                   ));
   }
}
