package management.services;

import management.entities.Department;
import management.entities.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectService {
    Project saveProject(Project Project);
    Project updateProject(Project Project);
    Project getProjectById(Long id);
    List<Project> getAllProjects();
    void deleteProjectById(Long id);
    void deleteAllProjects();

    List<Project> findAllProjectsByBudget(double budgetProject);
    List<Project> findAllProjectsByNameBudget(@Param("nameProject") String nameProject , @Param("budgetProject") double budgetProject);
    List<Project> findAllProjectsByDepartment(Department Department);

    List<Project> findAllProjectsByIdDepartment(Long idDepartment);
    List<Project> findAllProjectsByIdClient(Long idClient);
    List<Project> findAllProjectsByNameSort();

    Page<Project> getAllProjectsByPage(int page, int size);
    List<Project> findByClientIdClient(Long idSupervisor);
}
