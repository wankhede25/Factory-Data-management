package service;

import lombok.AllArgsConstructor;
import model.Employee;
import org.springframework.stereotype.Service;
import dao.EmployeeRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class EmployeeService {

//    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll().ge;
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
