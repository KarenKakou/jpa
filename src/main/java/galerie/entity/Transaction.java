package galerie.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity 
public class Transaction {
	
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    

    @NonNull
    @ManyToOne
    private Personne client;
   
    @NonNull
    @OneToOne
    private Tableau oeuvre;
    
    @NonNull
    @ManyToOne
    private Exposition lieuDeVente;
    
    @NonNull
    private Float prixVente;
    
    private LocalDate venduLe = LocalDate.now();
    
    
    public float getPrixVente() {
    	return this.prixVente;
    }


	public LocalDate getVenduLe() {
		return this.venduLe;
	}
}
