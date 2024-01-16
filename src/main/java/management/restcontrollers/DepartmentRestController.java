package management.restcontrollers;

import management.entities.Department;
import management.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")//spécifier l url du front vers back
public class DepartmentRestController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    @GetMapping(value = "/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentRepository.findById(id).get();
    }
}
