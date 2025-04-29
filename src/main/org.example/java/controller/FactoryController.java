package controller;

import model.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.FactoryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FactoryController {
    @Autowired
    private FactoryService factoryService;

    @GetMapping
    public List<Factory> getAllFactories() {
        return factoryService.getAllFactories();
    }

    @GetMapping("/{id}")
    public Optional<Factory> getFactoryById(@PathVariable Long id) {
        return factoryService.getFactoryById(id);
    }

    @PostMapping("/factory")
    public Factory addFactory(@RequestBody Factory factory) {
        return factoryService.saveFactory(factory);
    }

    @DeleteMapping("/{id}")
    public void deleteFactory(@PathVariable Long id) {
        factoryService.deleteFactory(id);
    }
}
