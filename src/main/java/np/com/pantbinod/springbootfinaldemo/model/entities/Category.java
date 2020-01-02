package np.com.pantbinod.springbootfinaldemo.model.entities;

import np.com.pantbinod.springbootfinaldemo.model.common.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Category extends AbstractEntity {
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }

    private String name;
    private String categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
