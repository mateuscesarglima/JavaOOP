package entity;

public class Product {
	
	public String name;
	
	public double price;
	
	public int quantity;
	
	public Product() {
	
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return this.quantity * this.price;
	}
	
	public void addPRoducts(int quantity) {
		
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
		
	}
	
}
