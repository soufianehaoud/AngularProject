package management.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    @NotNull
    //@Size(min = 3, max = 20)
    private String nameEmployee;
    //@Min(5)
    //@Max(10000)
    private Double salaryEmployee;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //@PastOrPresent
    private Date dateRecrut;

    @ManyToOne
    private Department department;
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", salaryEmployee=" + salaryEmployee +
                ", dateRecrut=" + dateRecrut +
                '}';
    }

    public Employee(String nameEmployee, Double salaryEmployee, Date dateRecrut) {
        super();
        this.nameEmployee = nameEmployee;
        this.salaryEmployee = salaryEmployee;
        this.dateRecrut = dateRecrut;
    }
    public Employee() {
        super();
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(Double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public Date getDateRecrut() {
        return dateRecrut;
    }

    public void setDateRecrut(Date dateRecrut) {
        this.dateRecrut = dateRecrut;
    }
}
