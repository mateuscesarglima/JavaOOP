package entities;

public class Product {

    public String name;

    public double price;

    public int quantity;

    

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int addProducts(int qtd) {

        return this.quantity += qtd;

    }

    public int removeProducts(int qtd) {

        return this.quantity -= qtd;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
