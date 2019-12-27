package np.com.pantbinod.springbootfinaldemo.model.entities;

import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Product extends AbstractEntity {


    private String name;
    private int price;
    private String stock;
    private String category;
    private String status;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getStock() {
        return stock;
    }

    public Product setStock(String stock) {
        this.stock = stock;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Product setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Product setStatus(String status) {
        this.status = status;
        return this;
    }
}
