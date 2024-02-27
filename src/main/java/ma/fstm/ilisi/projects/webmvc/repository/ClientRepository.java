package ma.fstm.ilisi.projects.webmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fstm.ilisi.projects.webmvc.bo.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
