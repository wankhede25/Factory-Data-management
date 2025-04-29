package controller;

import lombok.AllArgsConstructor;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class EmployeeController {

    //    @Autowired
    private EmployeeService employeeService;

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    // Add a new employee
    @PostMapping("/data")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Update an existing employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.saveEmployee(employee);
    }

    // Delete an employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }
}

