package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import galerie.entity.Galerie;

public interface ArtisteRepository  extends JpaRepository<Galerie, Integer> {

}
