package ch.zhaw.CineSearch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Times {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showtimeId;
    private String showtimesDate;
    private String showtimesTime;

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Movie movie;

    public Long getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(Long showtimeId) {
        this.showtimeId = showtimeId;
    }

    public String getShowtimesDate() {
        return showtimesDate;
    }

    public void setShowtimesDate(String showtimesDate) {
        this.showtimesDate = showtimesDate;
    }

    public String getShowtimesTime() {
        return showtimesTime;
    }

    public void setShowtimesTime(String showtimesTime) {
        this.showtimesTime = showtimesTime;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
