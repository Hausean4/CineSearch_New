package ch.zhaw.CineSearch.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesRepository extends JpaRepository<Cinema, Long> {
    
}
