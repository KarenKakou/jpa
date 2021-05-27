package galerie.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity 
public class Artiste extends Personne{

	@OneToMany(mappedBy="auteur")
    @ToString.Exclude
    private List<Tableau> oeuvres = new LinkedList<>();
    
}
