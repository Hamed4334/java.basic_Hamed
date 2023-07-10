package om.gov.taxoman.entity;

public class Product {
    private int id;
    private String name;
    private String description;
    private String[] categories = new String[5];
    private double price;

    public Product(){


    }

    public Product(int id, String name, String description, String[] categories, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getCategories() {
        return categories;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
