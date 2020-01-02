package np.com.pantbinod.springbootfinaldemo.repository;

import np.com.pantbinod.springbootfinaldemo.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
