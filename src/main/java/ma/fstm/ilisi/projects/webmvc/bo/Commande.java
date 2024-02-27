package ma.fstm.ilisi.projects.webmvc.bo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Commande implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idcmd;
private Date datecmd;
@ManyToOne
@JoinColumn(name="id")
private Client client;
}
