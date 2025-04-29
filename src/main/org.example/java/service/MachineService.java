package service;

import lombok.AllArgsConstructor;
import model.Machine;
import org.springframework.stereotype.Service;
import dao.MachineRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class MachineService {


    private MachineRepository machineRepository;

    public List<Machine> getAllMachines() {
        return machineRepository.findAll();
    }

    public Optional<Machine> getMachineById(Long id) {
        return machineRepository.findById(id);
    }

    public Machine saveMachine(Machine machine) {
        return machineRepository.save(machine);
    }

    public void deleteMachine(Long id) {
        machineRepository.deleteById(id);
    }
}
