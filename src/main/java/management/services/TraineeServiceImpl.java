package management.services;

import management.entities.Department;
import management.entities.Trainee;
import management.repositories.TraineeRepository;
import management.repositories.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements TraineeService {
    @Autowired
    TraineeRepository traineeRepository;
    @Override
    public Trainee saveTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    @Override
    public Trainee updateTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }

    @Override
    public Trainee getTraineeById(Long id) {
        return traineeRepository.findById(id).get();
    }

    @Override
    public List<Trainee> getAllTrainees() {
        return traineeRepository.findAll();
    }

    @Override
    public void deleteTraineeById(Long id) {
        traineeRepository.deleteById(id);
    }

    @Override
    public void deleteAllTrainees() {
        traineeRepository.deleteAll();
    }

    @Override
    public List<Trainee> findAllTraineesByPrice(double priceTrainee) {
        return traineeRepository.findAllTraineesBySalary(1000.00);
    }

    @Override
    public List<Trainee> findAllTraineesByNamePrice(String nameTrainee, double priceTrainee) {
        return traineeRepository.findAllTraineesByNameSalary("TV", 3000.00);
    }

    @Override
    public List<Trainee> findAllTraineesByDepartment(Department Department) {
        return traineeRepository.findAllTraineesByDepartment(Department);
    }
    public List<Trainee> findAllTraineesByIdSupervisor(Long idSupervisor){
        return traineeRepository.findBySupervisorIdSupervisor(idSupervisor);
    }
    @Override
    public List<Trainee> findAllTraineesByIdDepartment(Long idDepartment) {
        return traineeRepository.findByDepartmentIdDepartment(idDepartment);
    }

    @Override
    public List<Trainee> findAllTraineesByNameSort() {
        return traineeRepository.findAllTraineesByNameSort();
    }
    @Override
    public List<Trainee> findBySupervisorIdSupervisor(Long idSupervisor){
        return traineeRepository.findBySupervisorIdSupervisor(idSupervisor);
    }

    @Override
    public Page<Trainee> getAllTraineesByPage(int page, int size) {
        return traineeRepository.findAll(PageRequest.of(page, size));
    }

}
