package np.com.pantbinod.springbootfinaldemo.repository;

import np.com.pantbinod.springbootfinaldemo.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
