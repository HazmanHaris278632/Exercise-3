
public class Main {

	public static void main(String[] args) {
		Food food1 = new Food();
		
		System.out.println("Food name : " + food1.name);
		System.out.println("Food taste : " + food1.taste);
		System.out.println("Quantity : " + food1.quantity);
		System.out.printf("Food price : RM%.2f",food1.price);
		System.out.printf("\nTotal food price : RM%.2f",food1.totalprice);
		
		System.out.println();
		
		Food food2 = new Food();
		
		System.out.println("Food name : " + food2.name);
		System.out.println("Food taste : " + food2.taste);
		System.out.println("Quantity : " + food2.quantity);
		System.out.printf("Food price : RM%.2f",food2.price);
		System.out.printf("\nTotal food price : RM%.2f",food2.totalprice);

	}

}
