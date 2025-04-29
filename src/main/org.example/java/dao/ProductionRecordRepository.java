package dao;

import model.ProductionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRecordRepository extends JpaRepository<ProductionRecord,Long> {
}
