package ch.zhaw.CineSearch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cinema {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cinemaId;
    private String cinemaName;
    private String cinemAddress;
    private String cinemaPhone;
    private String cinemaLink;
    
    public Long getCinemaId() {
        return cinemaId;
    }
    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }
    public String getCinemaName() {
        return cinemaName;
    }
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public String getCinemAddress() {
        return cinemAddress;
    }
    public void setCinemAddress(String cinemAddress) {
        this.cinemAddress = cinemAddress;
    }
    public String getCinemaPhone() {
        return cinemaPhone;
    }
    public void setCinemaPhone(String cinemaPhone) {
        this.cinemaPhone = cinemaPhone;
    }
    public String getCinemaLink() {
        return cinemaLink;
    }
    public void setCinemaLink(String cinemaLink) {
        this.cinemaLink = cinemaLink;
    }

    
}
