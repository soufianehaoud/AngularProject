package management.restcontrollers;


import management.entities.Employee;
import management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmployeeRestController {
    @Autowired
    EmployeeService EmployeeService;

    @GetMapping("/employees")
    List<Employee> getAllEmployees(){
        return EmployeeService.getAllEmployees();
    }

    @GetMapping("/employees/{idEmployee}")
    public Employee getEmployeeById(@PathVariable("idEmployee") Long idEmployee){
        return EmployeeService.getEmployeeById(idEmployee);
    }
    @GetMapping("/employees/Department/{idDepartment}")
    public List<Employee> getAllEmployeesByDepartment(@PathVariable("idDepartment") Long idDepartment){
        return EmployeeService.findAllEmployeesByIdDepartment(idDepartment);
    }
    @PostMapping("/employees/save")
    public Employee createEmployee(@RequestBody Employee Employee){
        return EmployeeService.saveEmployee(Employee);
    }
    @PutMapping("/employees/update")
    public Employee updateEmployee(@RequestBody Employee Employee){
        return EmployeeService.updateEmployee(Employee);
    }
    @DeleteMapping("/employees/{idEmployee}")
    public void deleteEmployeeById(@PathVariable("idEmployee") Long idEmployee){
        EmployeeService.deleteEmployeeById(idEmployee);
    }



}
