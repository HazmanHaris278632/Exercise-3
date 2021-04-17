import java.util.Scanner;
public class Food {
	
	String name;
	String taste;
	int quantity;
	double price;
	double totalprice;
	
	Scanner s = new Scanner(System.in);
	
	Food() {
		System.out.println("Enter food name : ");
		this.name = s.nextLine();
		
		System.out.println("Taste that you want : ");
		this.taste = s.nextLine();
		
		System.out.println("Food quantity : ");
		this.quantity = s.nextInt();
		
		System.out.println("Enter food price : ");
		this.price = s.nextDouble();
		
		this.totalprice = this.price*this.quantity;
		System.out.println("Total price : RM" + this.totalprice);
		System.out.println();
	}
	
	Food(String name, String taste, int quantity, double price, double amount ) {
		
		this.name = name;
		this.taste = taste;
		this.quantity = quantity;
		this.price = price;
		this.totalprice = amount;
	}
	
	

}
