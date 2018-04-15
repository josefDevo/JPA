package service;

/**
 * Created by josef on 9/3/2017.
 */


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.Movie;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);
        int movieId;
        double price;
        String movieTitle;

        System.out.println("<*---->><<---->><<----*>");

        //För att välja produkt att uppdatera priset på!
        System.out.println("Enter the id of the movie");
        movieId = scanner.nextInt();
        scanner.nextLine();

        Movie movie = entitymanager.find(Movie.class, movieId);


        //För att uppdatera pris på produkt:
        System.out.println("Set the new price: ");
        price = scanner.nextInt();
        scanner.nextLine();

        movie.setPrice(price);
        entitymanager.getTransaction().commit();

        //after update
        System.out.println(movie);
        entitymanager.close();
        emfactory.close();
    }
}