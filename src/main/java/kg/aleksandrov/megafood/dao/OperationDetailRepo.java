package kg.aleksandrov.megafood.dao;

import kg.aleksandrov.megafood.models.entity.OperationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationDetailRepo extends JpaRepository<OperationDetail, Long> {
}
