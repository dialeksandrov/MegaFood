package kg.aleksandrov.megafood.dao;

import kg.aleksandrov.megafood.models.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepo extends JpaRepository<Operation, Long> {
}
