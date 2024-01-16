package management.repositories;

import management.entities.Department;
import management.entities.Project;
import management.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface ProjectRepository extends JpaRepository<Project,Long> {
    @Query("select project from Project project where project.budgetProject >?1")
    List<Project> findAllProjectsByBudget(double budgetProject);

    @Query("select project from Project project where project.nameProject like %:nameProject and project.budgetProject >:budgetProject")
    List<Project> findAllProjectsBybudgetProject(@Param("nameProject") String nameProject , @Param("budgetProject") double budgetProject);

    @Query("select project from Project project where project.department =?1")
    List<Project> findAllProjectsByDepartment(Department department);

    @Query("select project from Project project order by project.nameProject")
    List<Project> findAllProjectsByNameSort();

    List<Project> findByDepartmentIdDepartment(Long idDepartment);
    List<Project> findByClientIdClient(Long idClient);
}
