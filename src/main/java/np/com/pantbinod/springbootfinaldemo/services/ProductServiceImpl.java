package np.com.pantbinod.springbootfinaldemo.services;

import np.com.pantbinod.springbootfinaldemo.common.enumlist.StatusList;
import np.com.pantbinod.springbootfinaldemo.converter.ProductConverter;
import np.com.pantbinod.springbootfinaldemo.model.dto.ProductDto;
import np.com.pantbinod.springbootfinaldemo.model.entities.Product;
import np.com.pantbinod.springbootfinaldemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService<ProductDto> {

    @Autowired
    private ProductRepository productRepository;


    @Autowired
    private ProductConverter productConverter;

    @Override
    public void save(ProductDto productDto) {

    productRepository.saveAndFlush(productConverter.convertDtoToEntity(productDto).setStatus(StatusList.DRAFTR.toString()));
    }

    @Override
    public void update(ProductDto productDto) {
        Product product =productConverter.convertDtoToEntity(productDto).setStatus(productDto.getStatus());
        product.setVersion(productRepository.findById(product.getId()).get().getVersion());
        productRepository.saveAndFlush(product);

    }

    @Override
    public void delete(Long id) {
    productRepository.deleteById(id);
    }

    @Override
    public ProductDto findById(Long id) {

       return productConverter.convertEntityToDto(productRepository.findById(id).get());

    }

    @Override
    public List<ProductDto> findAll() {
        return productConverter.convertListEntityToDtoList(productRepository.findAll());
    }
}
