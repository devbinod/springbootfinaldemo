package np.com.pantbinod.springbootfinaldemo.repository;

import np.com.pantbinod.springbootfinaldemo.model.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
