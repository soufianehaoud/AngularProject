package management.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;
    @NotNull
    //@Size(min = 3, max = 20)
    private String nameProject;
    //@Min(5)
    //@Max(10000)
    private Double budgetProject;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@PastOrPresent
    private Date dateCreation;

    @ManyToOne
    private Department department;
    @ManyToOne
    private Client client;

    @Override
    public String toString() {
        return "Project{" +
                "nameProject='" + nameProject + '\'' +
                ", budgetProject=" + budgetProject +
                ", dateCreation=" + dateCreation +
                '}';
    }

    public Project(String nameProject, Double budgetProject, Date dateCreation) {
        this.nameProject = nameProject;
        this.budgetProject = budgetProject;
        this.dateCreation = dateCreation;
    }

    public Project() {super();}

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public void setBudgetProject(Double budgetProject) {
        this.budgetProject = budgetProject;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
