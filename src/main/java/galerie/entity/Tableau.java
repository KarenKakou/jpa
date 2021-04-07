package galerie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
public class Tableau {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column
    @NonNull
    private String titre;
    
    @Column
    @NonNull
    private String support;
    
    @Column
    @NonNull
    private int largeur;
    
    @Column
    @NonNull
    private int hauteur;
    
    @Column
    @NonNull
    private Exposition accrochage;
    
    @ManyToMany
    private Exposition exposition;
    
    @OneToOne
    private Artiste artiste;
    
    @ManyToOne
    private Client client;
    
	
}
