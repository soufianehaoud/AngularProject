package management.repositories;

import management.entities.Department;
import management.entities.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface TraineeRepository extends JpaRepository<Trainee,Long> {
    @Query("select trainee from Trainee trainee where trainee.salaryTrainee >?1")
    List<Trainee> findAllTraineesBySalary(double salaryTrainee);

    @Query("select trainee from Trainee trainee where trainee.nameTrainee like %:nameTrainee and trainee.salaryTrainee >:salaryTrainee")
    List<Trainee> findAllTraineesByNameSalary(@Param("nameTrainee") String nameTrainee , @Param("salaryTrainee") double salaryTrainee);

    @Query("select trainee from Trainee trainee where trainee.department =?1")
    List<Trainee> findAllTraineesByDepartment(Department department);

    @Query("select trainee from Trainee trainee order by trainee.nameTrainee")
    List<Trainee> findAllTraineesByNameSort();

    List<Trainee> findByDepartmentIdDepartment(Long idDepartment);
    List<Trainee> findBySupervisorIdSupervisor(Long idSupervisor);
}
