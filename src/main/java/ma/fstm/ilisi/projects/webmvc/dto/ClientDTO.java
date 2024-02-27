package ma.fstm.ilisi.projects.webmvc.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fstm.ilisi.projects.webmvc.bo.Client;
import ma.fstm.ilisi.projects.webmvc.bo.Commande;


	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	
	public class ClientDTO {
	
	private int id;
	private String nom;
	private double capital;
	
	private List<Commande> commandes;
}
