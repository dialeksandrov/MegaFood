package kg.aleksandrov.megafood.dao;

import kg.aleksandrov.megafood.models.entity.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinRepo extends JpaRepository<Pin, String> {

    boolean existsByPin(String pin);
}
