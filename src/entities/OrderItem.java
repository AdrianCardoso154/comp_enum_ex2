package entities;

public class OrderItem {
	private int qtd;
	private double price;
	private Product prod;

	public OrderItem(int qtd, double price, Product prod) {
		super();
		this.qtd = qtd;
		this.price = price;
		this.prod = prod;
	}

	public OrderItem() {
		super();
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public double subtotal() {
		return this.getPrice()*this.getQtd();
	}
}
