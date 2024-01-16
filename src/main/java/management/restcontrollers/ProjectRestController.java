package management.restcontrollers;

import management.entities.Project;
import management.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProjectRestController {
    @Autowired
    ProjectService projectService;
    @GetMapping("/projects")
    List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @GetMapping("/projects/{idProject}")
    public Project getProjectById(@PathVariable("idProject") Long idProject){
        return projectService.getProjectById(idProject);
    }
    @GetMapping("/projects/Department/{idDepartment}")
    public List<Project> getAllProjectsByDepartment(@PathVariable("idDepartment") Long idDepartment){
        return projectService.findAllProjectsByIdDepartment(idDepartment);
    }
    @GetMapping("/projects/Client/{idClient}")
    public List<Project> getAllProjectsByClient(@PathVariable("idClient") Long idClient){
        return projectService.findAllProjectsByIdClient(idClient);
    }
    @PostMapping("/projects/save")
    public Project createProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }
    @PutMapping("/projects/update")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }
    @DeleteMapping("/projects/{idProject}")
    public void deleteProjectById(@PathVariable("idProject") Long idProject){
        projectService.deleteProjectById(idProject);
    }

}
