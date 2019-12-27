package np.com.pantbinod.springbootfinaldemo.model.dto;

public class ProductDto {

    private Long id;
    private String name;
    private int price;
    private String stock;
    private String category;
    private String status;

    public Long getId() {
        return id;
    }

    public ProductDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public ProductDto setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getStock() {
        return stock;
    }

    public ProductDto setStock(String stock) {
        this.stock = stock;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public ProductDto setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProductDto setStatus(String status) {
        this.status = status;
        return this;
    }
}
