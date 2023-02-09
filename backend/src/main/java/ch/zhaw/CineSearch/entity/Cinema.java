package ch.zhaw.CineSearch.entity;

import javax.persistence.Column;
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
    private String cinemaAddress;
    private String cinemaPhone;
    
    @Column(columnDefinition="LONGTEXT")
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
    public String getCinemaAddress() {
        return cinemaAddress;
    }
    public void setCinemaAddress(String cinemAddress) {
        this.cinemaAddress = cinemAddress;
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
