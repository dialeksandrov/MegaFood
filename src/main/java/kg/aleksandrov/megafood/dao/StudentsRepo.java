package kg.aleksandrov.megafood.dao;

import kg.aleksandrov.megafood.models.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long> {
}
