package np.com.pantbinod.springbootfinaldemo.services;

import java.util.List;

public interface ProductService<T> {

    void save(T t);
    void update(T t);
    void delete(Long id);
    T findById(Long id);
    List<T> findAll();

}
