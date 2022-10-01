package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValue() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// toString method from the Object class being rewritten
	public String toString() {
		return name + ", R$" + String.format("%.2f", price) + ", " + quantity + " unitis, total: R$" + String.format("%.2f", totalValue());
	}
}
