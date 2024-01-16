package management.services;


import management.entities.Department;
import management.entities.Employee;
import management.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository EmployeeRepository;
    @Override
    public Employee saveEmployee(Employee Employee) {
        return EmployeeRepository.save(Employee);
    }

    @Override
    public Employee updateEmployee(Employee Employee) {
        return EmployeeRepository.save(Employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return EmployeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return EmployeeRepository.findAll();
    }

    @Override
    public void deleteEmployeeById(Long id) {
        EmployeeRepository.deleteById(id);
    }

    @Override
    public void deleteAllEmployees() {
        EmployeeRepository.deleteAll();
    }

    @Override
    public List<Employee> findAllEmployeesByPrice(double priceEmployee) {
        return EmployeeRepository.findAllEmployeesBySalary(1000.00);
    }

    @Override
    public List<Employee> findAllEmployeesByNamePrice(String nameEmployee, double priceEmployee) {
        return EmployeeRepository.findAllEmployeesByNameSalary("TV", 3000.00);
    }

    @Override
    public List<Employee> findAllEmployeesByDepartment(Department Department) {
        return EmployeeRepository.findAllEmployeesByDepartment(Department);
    }

    @Override
    public List<Employee> findAllEmployeesByIdDepartment(Long idDepartment) {
        return EmployeeRepository.findByDepartmentIdDepartment(idDepartment);
    }

    @Override
    public List<Employee> findAllEmployeesByNameSort() {
        return EmployeeRepository.findAllEmployeesByNameSort();
    }

    @Override
    public Page<Employee> getAllEmployeesByPage(int page, int size) {
        return EmployeeRepository.findAll(PageRequest.of(page, size));
    }
}
