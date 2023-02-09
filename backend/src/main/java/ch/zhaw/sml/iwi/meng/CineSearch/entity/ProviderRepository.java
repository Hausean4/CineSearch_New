package ch.zhaw.sml.iwi.meng.CineSearch.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Long> {
    public List<Provider> findAllByProviderName(String provider);
    
}