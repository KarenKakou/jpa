package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import galerie.entity.Galerie;

public interface TableauRepository extends JpaRepository<Galerie, Integer> {

}
