package ma.fstm.ilisi.projects.webmvc.bo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nom;
private double capital;
@OneToMany(mappedBy = "client")
private List<Commande> commandes;
}
