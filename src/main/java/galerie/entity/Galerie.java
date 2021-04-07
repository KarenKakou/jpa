package galerie.entity;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.persistence.*;

import antlr.collections.List;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Galerie {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    
    @OneToMany(mappedBy = "galerie")
    private LinkedList<Exposition> expositions = new LinkedList<>();
}
