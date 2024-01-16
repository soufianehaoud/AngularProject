package management.services;


import management.entities.Department;
import management.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService
{
    Employee saveEmployee(Employee Employee);
    Employee updateEmployee(Employee Employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    void deleteEmployeeById(Long id);
    void deleteAllEmployees();

    List<Employee> findAllEmployeesByPrice(double priceEmployee);
    List<Employee> findAllEmployeesByNamePrice(@Param("nameEmployee") String nameEmployee , @Param("priceEmployee") double priceEmployee);
    List<Employee> findAllEmployeesByDepartment(Department Department);

    List<Employee> findAllEmployeesByIdDepartment(Long idDepartment);
    List<Employee> findAllEmployeesByNameSort();


    Page<Employee> getAllEmployeesByPage(int page, int size);

}
