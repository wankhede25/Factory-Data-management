package service;

import lombok.AllArgsConstructor;
import model.Factory;
import org.springframework.stereotype.Service;
import dao.FactoryRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class FactoryService {

    private FactoryRepository factoryRepository;

    public List<Factory> getAllFactories() {
        return factoryRepository.findAll();
    }

    public Optional<Factory> getFactoryById(Long id) {
        return factoryRepository.findById(id);
    }

    public Factory saveFactory(Factory factory) {
        return factoryRepository.save(factory);
    }

    public void deleteFactory(Long id) {
        factoryRepository.deleteById(id);
    }
}
