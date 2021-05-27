package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import galerie.entity.Galerie;

public interface ExpositionRepository extends JpaRepository<Galerie, Integer> {

	@Query("SELECT SUM(t.prixVente) FROM Transaction t WHERE t.lieuDeVente.id = :id")
	Float chiffreAffairePour(Integer id);
	
	@Query("SELECT SUM(t.prixVente) FROM Transaction t WHERE t.lieuDeVente.intitule = :intitule")
    Float chiffreAffairePour(String intitule);
	
}
