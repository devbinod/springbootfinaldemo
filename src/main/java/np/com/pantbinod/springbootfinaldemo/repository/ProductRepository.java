package np.com.pantbinod.springbootfinaldemo.repository;

import np.com.pantbinod.springbootfinaldemo.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
