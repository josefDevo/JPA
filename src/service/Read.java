package service;

/**
 * Created by josef on 8/23/2017.
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.Movie;

import java.util.Iterator;
import java.util.List;


public class Read {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createQuery("Select b from Movie b ");
        List<Movie> list = query.getResultList();
        Iterator var6 = list.iterator();

        while(var6.hasNext()) {
            Movie b = (Movie) var6.next();
            System.out.println("<*---->><<---->><<----*>");
            System.out.print("Movie Id :" + b.getMovieId());
            System.out.println("\t Movie name :" + b.getMovieTitle());
        }

    }
}
