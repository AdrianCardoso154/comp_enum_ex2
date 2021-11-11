package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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
		Client cl = new Client();
		
		System.out.println("---------------------------------------------");
		System.out.println("Entre com os dados do pedido: ");
		System.out.println("Quantos itens tem o pedido: ");
		int aux = sc.nextInt();
		
		
		sc.close();
	}
}
