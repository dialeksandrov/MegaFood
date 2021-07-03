package kg.aleksandrov.megafood.dao;

import kg.aleksandrov.megafood.models.entity.Buffet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuffetRepo extends JpaRepository<Buffet, Long> {
}
