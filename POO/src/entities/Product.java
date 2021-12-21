package entities;

public class Product {

    public String name;

    public double price;

    public int quantity;



    public double totalProductsInStock(){

        return (this.price * this.quantity);

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

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    

}
