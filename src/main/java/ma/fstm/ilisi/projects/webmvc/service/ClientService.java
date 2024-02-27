package ma.fstm.ilisi.projects.webmvc.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstm.ilisi.projects.webmvc.bo.Client;
import ma.fstm.ilisi.projects.webmvc.dto.ClientDTO;
import ma.fstm.ilisi.projects.webmvc.repository.ClientRepository;
@Service
public class ClientService implements ClientServiveInterface{
@Autowired
private ClientRepository clientrepository;
	@Override
	public List<ClientDTO> getAllClients() {
		return clientrepository.findAll().stream().map(this::fromClient).collect(Collectors.toList());
		
				
	}

	@Override
	public void saveClientDTO(ClientDTO dto) {
		clientrepository.save(this.toClient(dto));
		
	}

	@Override
	public void deleteClientDTO(ClientDTO dto) {
		clientrepository.delete(this.toClient(dto));
		
	}

	@Override
	public ClientDTO getClientDTO(int id) {
	Optional<Client> client= clientrepository.findById(id);
		 if(client.isPresent()) {
			 ClientDTO dto=this.fromClient(client.get());
		 return dto;
		 }
		 else
			 throw new RuntimeException("Aucun client existe avec cet id: "+id);
	}
private ClientDTO fromClient(Client C) {
	return ClientDTO.builder()
	.id(C.getId())
	.nom(C.getNom())
	.capital(C.getCapital())
	.build();
	
}
private Client toClient(ClientDTO dto) {
	return Client.builder()
	.id(dto.getId())
	.nom(dto.getNom())
	.capital(dto.getCapital())
	.build();
	
}
}
