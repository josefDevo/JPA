
package service;

/*

JPA
In this project, I am using Java Persistence API to access and manage data between Java and the MYSQL database. This is a command-line application.

 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.Movie;
import main.Director;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Create {


    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);
        double price;
        String choosenDirector, movieTitle, genre;

        System.out.println("<*---->><<---->><<----*>");

        //Create Movie Entity.

        System.out.println("Enter the name of the new movie:");
        movieTitle = scanner.nextLine();

        //Anger namn för employee, skriver in id, anger department name
        System.out.println("Which genre?");
        genre = scanner.nextLine();

        System.out.println("Enter price of the product:");
        price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the name of the director?");
        choosenDirector = scanner.nextLine();

        Movie theMovie = new Movie();
        theMovie.setMovieTitle(movieTitle);
        theMovie.setPrice(price);
        theMovie.setGenre(genre);

        //Store movies
        entitymanager.persist(theMovie);

        //Create movie list.
        List<Movie> theMovieList = new ArrayList<>();
        theMovieList.add(theMovie);

        //Create Director Entity

        Director director = new Director();
        director.setAssignedDirector(choosenDirector);
        director.setListOfMovies(theMovieList);

        //Store director

        entitymanager.persist(director);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
