package controller;

import model.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MachineService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class MachineController {
    @Autowired
    private MachineService machineService;

    // Get all machines
    @GetMapping
    public List<Machine> getAllMachines() {
        return machineService.getAllMachines();
    }

    // Get machine by ID
    @GetMapping("/{id}")
    public Optional<Machine> getMachineById(@PathVariable Long id) {
        return machineService.getMachineById(id);
    }

    // Add a new machine
    @PostMapping("/machine")
    public Machine addMachine(@RequestBody Machine machine) {
        return machineService.saveMachine(machine);
    }

    // Update an existing machine
    @PutMapping("/{id}")
    public Machine updateMachine(@PathVariable Long id, @RequestBody Machine machine) {
        machine.setId(id);
        return machineService.saveMachine(machine);
    }

    // Delete a machine
    @DeleteMapping("/{id}")
    public void deleteMachine(@PathVariable Long id) {
        machineService.deleteMachine(id);
    }
}

