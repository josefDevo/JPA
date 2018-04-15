package service;

/**
 * Created by josef on 8/23/2017.
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.Movie;

import java.util.Scanner;

public class Delete {
    public static void main( String[ ] args ) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Scanner scanner = new Scanner (System.in);
        int movieId;

        System.out.println("<*---->><<---->><<----*>");
        System.out.println("Enter movieId of the movie we will stop selling:");
        movieId=scanner.nextInt(); //Läser in siffran som skrivs
        scanner.nextLine();


        Movie movie = entitymanager.find( Movie.class, movieId);
        entitymanager.remove(movie);
        entitymanager.getTransaction( ).commit( );
        entitymanager.close( );
        emfactory.close( );
    }
}