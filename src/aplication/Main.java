package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enun.OrderStatus;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cleinte");
		System.out.println("---------------------------------------------");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento (dd/MM/yyyy)");
		String dt_c_i = sc.next();
		Date dt_c = sdf2.parse(dt_c_i);
		Client cl = new Client(name, email, dt_c);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Status: ");
		String ord_s = sc.next();
		OrderStatus o_s = OrderStatus.valueOf(ord_s);
		Date dt_o = new Date();
		
		Order od = new Order(dt_o, o_s,cl);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.println("Quantos itens tem o pedido: ");
		int aux = sc.nextInt();
		for (int i=0;i<aux;i++) {
			System.out.println("===entre com os dados===");
			System.out.println("Nome do produto: ");
			String p_name = sc.next();
			sc.nextLine();
			System.out.println("Preço do produto: ");
			double p_price = sc.nextDouble();
			System.out.println("Quantidade: ");
			int p_qtd = sc.nextInt();
			
			Product pt = new Product(p_name, p_price);
			OrderItem o_i = new OrderItem(p_qtd, p_price, pt);
			od.addOrder_it(o_i);
		}
		System.out.println(od.toString());
		System.out.println("Itens do pedido: ");
		for(OrderItem hc: od.getLi()){
			
			System.out.println("Nome: "+ hc.getProd().getName());
			System.out.println("Quantidade :"+hc.getQtd());
			System.out.println("subtotal: "+hc.getProd().getPrice());
		}
		System.out.println("\nTotal: "+od.total());
	
		
		sc.close();
	}
}
