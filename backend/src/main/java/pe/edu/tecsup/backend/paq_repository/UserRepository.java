package pe.edu.tecsup.backend.paq_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.backend.paq_entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
