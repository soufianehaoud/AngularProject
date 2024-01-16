package management.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTrainee;
    @NotNull
    //@Size(min = 3, max = 20)
    private String nameTrainee;
    //@Min(5)
    //@Max(10000)
    private Double salaryTrainee;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@PastOrPresent
    private Date dateRecrut;
    @ManyToOne
    private Supervisor supervisor;
    @ManyToOne
    private Department department;

    public Trainee(String nameTrainee, Double salaryTrainee, Date dateRecrut) {
        this.nameTrainee = nameTrainee;
        this.salaryTrainee = salaryTrainee;
        this.dateRecrut = dateRecrut;
    }
    public Trainee(){super();}

    @Override
    public String toString() {
        return "Trainee{" +
                "idTrainee=" + idTrainee +
                ", nameTrainee='" + nameTrainee + '\'' +
                ", salaryTrainee=" + salaryTrainee +
                ", dateRecrut=" + dateRecrut +
                '}';
    }

    public void setIdTrainee(Long idTrainee) {
        this.idTrainee = idTrainee;
    }

    public void setNameTrainee(String nameTrainee) {
        this.nameTrainee = nameTrainee;
    }

    public void setSalaryTrainee(Double salaryTrainee) {
        this.salaryTrainee = salaryTrainee;
    }

    public void setDateRecrut(Date dateRecrut) {
        this.dateRecrut = dateRecrut;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
