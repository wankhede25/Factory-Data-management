package controller;

import model.ProductionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProductionRecordService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/path")
public class ProductionRecordController {
    @Autowired
    private ProductionRecordService productionRecordService;

    // Get all production records
    @GetMapping
    public List<ProductionRecord> getAllProductionRecords() {
        return productionRecordService.getAllProductionRecords();
    }

    // Get production record by ID
    @GetMapping("/{id}")
    public Optional<ProductionRecord> getProductionRecordById(@PathVariable Long id) {
        return productionRecordService.getProductionRecordById(id);
    }

    // Add a new production record
    @PostMapping("/production")
    public ProductionRecord addProductionRecord(@RequestBody ProductionRecord productionRecord) {
        return productionRecordService.saveProductionRecord(productionRecord);
    }

    // Update an existing production record
    @PutMapping("/{id}")
    public ProductionRecord updateProductionRecord(@PathVariable Long id, @RequestBody ProductionRecord productionRecord) {
        productionRecord.setId(id);
        return productionRecordService.saveProductionRecord(productionRecord);
    }

    // Delete a production record
    @DeleteMapping("/{id}")
    public void deleteProductionRecord(@PathVariable Long id) {
        productionRecordService.deleteProductionRecord(id);
    }
}
