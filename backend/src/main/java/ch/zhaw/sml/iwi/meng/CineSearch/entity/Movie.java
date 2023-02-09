package ch.zhaw.sml.iwi.meng.CineSearch.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MovieId;
    private String movieName;
    private String movieGenre;

    @OneToMany
    private List<Provider> provider = new ArrayList<>();

}