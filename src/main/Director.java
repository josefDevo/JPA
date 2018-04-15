package main;

/**
 * Created by josef on 8/31/2017.
 */

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Director {

    @Id
    @GeneratedValue( strategy=GenerationType.AUTO)

    private int directorId;
    private String assignedDirector;

    @OneToMany( targetEntity= Movie.class )
    private List listOfMovies;

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getAssignedDirector() {
        return assignedDirector;
    }

    public void setAssignedDirector(String assignedDirector) {
        this.assignedDirector = assignedDirector;
    }
    public List getListOfMovies() {
        return listOfMovies;
    }

    public void setListOfMovies(List listOfMovies) {
        this.listOfMovies = listOfMovies;
    }
}




