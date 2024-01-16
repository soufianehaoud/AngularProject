package management.services;

import management.entities.Department;
import management.entities.Project;
import management.entities.Project;
import management.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public void deleteAllProjects() {
        projectRepository.deleteAll();
    }

    @Override
    public List<Project> findAllProjectsByBudget(double budgetProject) {
        return projectRepository.findAllProjectsByBudget(1000.00);
    }

    @Override
    public List<Project> findAllProjectsByNameBudget(String nameProject, double budgetProject) {
        return projectRepository.findAllProjectsBybudgetProject("TV", 3000.00);
    }

    @Override
    public List<Project> findAllProjectsByDepartment(Department department) {
        return projectRepository.findAllProjectsByDepartment(department);
    }
    public List<Project> findAllProjectsByIdClient(Long idClient){
        return projectRepository.findByClientIdClient(idClient);
    }
    @Override
    public List<Project> findAllProjectsByIdDepartment(Long idDepartment) {
        return projectRepository.findByDepartmentIdDepartment(idDepartment);
    }

    @Override
    public List<Project> findAllProjectsByNameSort() {
        return projectRepository.findAllProjectsByNameSort();
    }
    @Override
    public List<Project> findByClientIdClient(Long idClient){
        return projectRepository.findByClientIdClient(idClient);
    }

    @Override
    public Page<Project> getAllProjectsByPage(int page, int size) {
        return projectRepository.findAll(PageRequest.of(page, size));
    }
}
