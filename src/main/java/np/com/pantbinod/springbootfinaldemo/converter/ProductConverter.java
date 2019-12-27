package np.com.pantbinod.springbootfinaldemo.converter;

import np.com.pantbinod.springbootfinaldemo.common.BaseConverter;
import np.com.pantbinod.springbootfinaldemo.model.dto.ProductDto;
import np.com.pantbinod.springbootfinaldemo.model.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductConverter extends BaseConverter<Product, ProductDto> {
    @Override
    public ProductDto convertEntityToDto(Product entity) {
        if(entity == null) return null;
        return copyConvertEntityToDto(entity);
    }

    @Override
    public Product convertDtoToEntity(ProductDto dto) {
        if(dto == null) return null;
        return copyConvertDtoToEntity(dto);

    }

    @Override
    public Product copyConvertDtoToEntity(ProductDto dto) {
        Product product= new Product()
                .setCategory(dto.getCategory())
                .setName(dto.getName())
                .setPrice(dto.getPrice())
                .setStock(dto.getStock());
        product.setId(dto.getId());
        return product;
    }

    @Override
    public ProductDto copyConvertEntityToDto(Product entity) {

        return new ProductDto()
                .setId(entity.getId())
                .setName(entity.getName())
                .setPrice(entity.getPrice())
                .setCategory(entity.getCategory())
                .setStatus(entity.getStatus())
                .setStock(entity.getStock());


    }
}
