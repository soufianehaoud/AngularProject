package management.restcontrollers;

import management.entities.Department;
import management.entities.Supervisor;
import management.repositories.DepartmentRepository;
import management.repositories.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")//spécifier l url du front vers back
public class SupervisorRestController {
    @Autowired
   SupervisorRepository supervisorRepository;

    @GetMapping("/supervisors")
    public List<Supervisor> getAllSupervisor(){
        return supervisorRepository.findAll();
    }
    @GetMapping(value = "/supervisors/{id}")
    public Supervisor getSupervisorById(@PathVariable("id") Long id){
        return supervisorRepository.findById(id).get();
    }
    
}
