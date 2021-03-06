package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enun.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client cl;
	
	private List<OrderItem> li = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client cl) {
		super();
		this.moment = moment;
		this.status = status;
		this.cl = cl;
	}

	public Order() {
		super();
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}

	public List<OrderItem> getLi() {
		return li;
	}
	
	public void addOrder_it(OrderItem o_i) {
		li.add(o_i);
	}
	public void removeOrder_it(OrderItem o_i) {
		li.remove(o_i);
	}
	public double total() {
		double sum = 0;
		for(OrderItem h: this.li) {
			sum += h.subtotal();
		}
		return sum;
	}
	
@Override

	public String toString(){
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	 return  "------------------------SUMARIO DO PEDIDO------------------------"+"\n"+"Momento do pedido: "+ sdf1.format(this.getMoment())+"\n" 
	+"Status do pedido: " +this.getStatus() +"\n"+"Cliente: "
	+this.getCl().getName()+" "+"("+sdf2.format(this.getCl().getBirdDay())+")"+" "+this.getCl().getEmail();
	
}
	
	
}
