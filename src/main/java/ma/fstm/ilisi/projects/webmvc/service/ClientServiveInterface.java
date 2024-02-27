package ma.fstm.ilisi.projects.webmvc.service;

import java.util.List;

import ma.fstm.ilisi.projects.webmvc.dto.ClientDTO;

public interface ClientServiveInterface {
public List<ClientDTO> getAllClients();
public void saveClientDTO(ClientDTO dto);
public void deleteClientDTO(ClientDTO dto);
public ClientDTO getClientDTO(int id);
}
