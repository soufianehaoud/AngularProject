package management.repositories;


import management.entities.Department;
import management.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select employee from Employee employee where employee.salaryEmployee >?1")
    List<Employee> findAllEmployeesBySalary(double salaryEmployee);

    @Query("select employee from Employee employee where employee.nameEmployee like %:nameEmployee and employee.salaryEmployee >:salaryEmployee")
    List<Employee> findAllEmployeesByNameSalary(@Param("nameEmployee") String nameEmployee , @Param("salaryEmployee") double salaryEmployee);

    @Query("select employee from Employee employee where employee.department =?1")
    List<Employee> findAllEmployeesByDepartment(Department department);

    @Query("select employee from Employee employee order by employee.nameEmployee")
    List<Employee> findAllEmployeesByNameSort();

    List<Employee> findByDepartmentIdDepartment(Long idDepartment);

}
