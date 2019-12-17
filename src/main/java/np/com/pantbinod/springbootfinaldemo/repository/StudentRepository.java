package np.com.pantbinod.springbootfinaldemo.repository;

import np.com.pantbinod.springbootfinaldemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends
        JpaRepository<Student, Integer> {

    List<Student> findByFirstName( String firstName);
    List<Student> findByLastName(String lastName);

}
