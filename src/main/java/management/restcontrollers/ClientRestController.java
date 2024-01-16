package management.restcontrollers;

import management.entities.Client;
import management.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")//spécifier l url du front vers back
public class ClientRestController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }
    @GetMapping(value = "/clients/{id}")
    public Client getClientById(@PathVariable("id") Long id){
        return clientRepository.findById(id).get();
    }
}
