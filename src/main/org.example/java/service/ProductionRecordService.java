package service;

import lombok.AllArgsConstructor;
import model.ProductionRecord;
import org.springframework.stereotype.Service;
import dao.ProductionRecordRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class ProductionRecordService {


    private ProductionRecordRepository productionRecordRepository;

    public List<ProductionRecord> getAllProductionRecords() {
        return productionRecordRepository.findAll();
    }

    public Optional<ProductionRecord> getProductionRecordById(Long id) {
        return productionRecordRepository.findById(id);
    }

    public ProductionRecord saveProductionRecord(ProductionRecord productionRecord) {
        return productionRecordRepository.save(productionRecord);
    }

    public void deleteProductionRecord(Long id) {
        productionRecordRepository.deleteById(id);
    }
}
