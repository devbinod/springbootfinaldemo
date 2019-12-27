package np.com.pantbinod.springbootfinaldemo.controller;

import np.com.pantbinod.springbootfinaldemo.model.dto.ProductDto;
import np.com.pantbinod.springbootfinaldemo.services.ProductService;
import np.com.pantbinod.springbootfinaldemo.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;


    @GetMapping("/products")
    public List<ProductDto> getAllProduct(){
        return productServiceImpl.findAll();
    }

    @GetMapping("/products/{id}")
    public ProductDto getSingleProduct(@PathVariable Long id){
        return productServiceImpl.findById(id);
    }

    @PostMapping("/products")
    public void saveProduct(@RequestBody ProductDto productDto){
    productServiceImpl.save(productDto);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody ProductDto productDto,@PathVariable Long id){
            productDto.setId(id);
         productServiceImpl.update(productDto);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
         productServiceImpl.delete(id);
    }


}
