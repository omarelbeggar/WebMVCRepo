package ma.fstm.ilisi.projects.webmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.fstm.ilisi.projects.webmvc.dto.ClientDTO;
import ma.fstm.ilisi.projects.webmvc.service.ClientService;

@Controller

public class ClientController {
	@Autowired
	private ClientService clientservice;
	@GetMapping("/")
public String getClients(Model model) {
	model.addAttribute("clients", clientservice.getAllClients());
	return "index";
}
	@GetMapping("/clients/new")
	public String NouveauClient(Model model) {
		model.addAttribute("clientdto",new ClientDTO());
		return "new_client";
	}
	@PostMapping("/clients/save")
	public String addClient(@ModelAttribute ClientDTO dto) {
		clientservice.saveClientDTO(dto);
		return "redirect:/";
	}
	@GetMapping("/clients/edit/{id}")
	public String updateClient(@PathVariable(value = "") int id, Model model) {
		model.addAttribute("clientdto",clientservice.getClientDTO(id));
		return "update_client";
	}
	@GetMapping("/clients/delete/{id}")
	public String deleteClient(@PathVariable(value = "") int id) {
		ClientDTO dto=clientservice.getClientDTO(id);
		clientservice.deleteClientDTO(dto);
		return "redirect:/";
	}
}
