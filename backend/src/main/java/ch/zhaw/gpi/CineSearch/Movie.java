package ch.zhaw.gpi.CineSearch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String movieName;
    private String movieGenre;

    @ManyToMany
    private Provider provider;
    
    public Long getMovieId() {
        return movieId;
    }
    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
