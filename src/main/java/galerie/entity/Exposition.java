package galerie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity 
public class Exposition {
	
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column
    @NonNull
    private LocalDate date;
    
    @Column
    @NonNull
    private String intitule;
    
    @Column
    @NonNull
    private int duree;
    
    private ArrayList<Transaction> ventes;
    
    
    
    private int CA() {
    	return 0;
    }
    
}
