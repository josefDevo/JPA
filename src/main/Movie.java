package main;
/**
 * Created by josef on 8/23/2017.
 */
        import javax.persistence.*;

@Entity
@Table

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int movieId;
    private String movieTitle;
    private double price;
    private String genre;


    public Movie(int movieId, String movieTitle, double price, String genre) {
        super();
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.price = price;
        this.genre = genre;
    }

    public Movie() {
        super();
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

