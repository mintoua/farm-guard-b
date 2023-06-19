package tn.esprit.pfe.node;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "node")
public class Node implements Serializable {

    private static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "localisation")
    private String localisation;

    @Column(name = "date")
    private String date;

    @Column(name = "tension_batterie")
    private float tension;
}
