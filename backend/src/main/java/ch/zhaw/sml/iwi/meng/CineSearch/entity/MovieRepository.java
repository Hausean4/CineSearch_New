package ch.zhaw.sml.iwi.meng.CineSearch.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>
{
    public List<Movie> findByMovieName(String movie);
}