package wolox.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import wolox.training.models.User;

import java.util.List;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUsername(String username);
}
