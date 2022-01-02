package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;

	private OrderStatus status;

	private List<OrderItem> itens = new ArrayList<>();

	private Client client;

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	public void addItem(OrderItem item) {
		itens.add(item);
	}

	public void removeItem(OrderItem item) {
		itens.remove(item);
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem or: itens) {
			sum += or.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append(client.toString() + "\n");
		sb.append("Order Items: " + "\n");
		for (OrderItem or : itens) {
			sb.append(or + "\n");
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}

}
