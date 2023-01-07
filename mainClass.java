package CoffeeShop;
import java.util.Scanner;
public class mainClass {


	public static void main(String[] args) {
		
		Coffee c1 = new Coffee();
    	 
     
		while(true) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("**********Select the Coffee**********"); 
		System.out.println("1 - Cappuccino 1495 Rs "); 
		System.out.println("2 -Robusta 825 Rs "); 
		System.out.println("3 - Frappe 608 Rs"); 
		System.out.println("4 - Excelsa 725 Rs ");
		System.out.println("5 - To exit ");

		
		
		int choice = input.nextInt();
		
		if (choice == 1){
			System.out.println("How much Cappuccino you want?");
			int quantity = input.nextInt();
			int choice2 = c1.Cappuccino(quantity);
			
		}
		else if (choice == 2){
			System.out.println("How much Robusta you want?");
			int quantity = input.nextInt();
			int choice2 = c1.Robusta(quantity);
			
		}
		else if (choice == 3){
			System.out.println("How much Frappe you want?");
			int quantity = input.nextInt();
			int choice2 = c1.Frappe(quantity);
			
		}
		else if (choice == 4){
			System.out.println("How much Excelsa you want?");
			int quantity = input.nextInt();
			int choice2 = c1.Excelsa(quantity);
			
		}
		else if (choice == 5){
			System.out.println("*****Thanks for your order*****");
			break;
		}
		else {
			System.out.println("Invalid Entry");
			
		}
		
				
		
		System.out.println("**********Anything else you need?**********"); 
		System.out.println("1 - Cappuccino 1495 Rs "); 
		System.out.println("2 -Robusta 825 Rs "); 
		System.out.println("3 - Frappe 608 Rs"); 
		System.out.println("4 - Excelsa 725 Rs ");
		System.out.println("5 - To exit ");

		
		int choice3 = input.nextInt();
		
		if (choice3 == 1){
			System.out.println("How much Cappuccino you want?");
			int quantity = input.nextInt();
			int choice4 = c1.Cappuccino(quantity);
			
		}
		else if (choice3 == 2){
			System.out.println("How much Robusta you want?");
			int quantity = input.nextInt();
			int choice4 = c1.Robusta(quantity);
			
		}
		else if (choice3 == 3){
			System.out.println("How much Frappe you want?");
			int quantity = input.nextInt();
			int choice4 = c1.Frappe(quantity);
			
		}
		else if (choice3 == 4){
			System.out.println("How much Excelsa you want?");
			int quantity = input.nextInt();
			int choice4 = c1.Excelsa(quantity);
			
		}
		else if (choice3 == 5){
			System.out.println("*****Thanks for your order*****");
			break;
		}

		else {
			System.out.println("Invalid Entry");
			
		}
		System.out.println("**********Anything else you need?**********"); 
		System.out.println("1 - Cappuccino 1495 Rs "); 
		System.out.println("2 -Robusta 825 Rs "); 
		System.out.println("3 - Frappe 608 Rs"); 
		System.out.println("4 - Excelsa 725 Rs ");
		System.out.println("5 - To exit ");

		
		int choice5 = input.nextInt();
		
		if (choice5 == 1){
			System.out.println("How much Cappuccino you want?");
			int quantity = input.nextInt();
			int choice6 = c1.Cappuccino(quantity);
			
		}
		else if (choice5 == 2){
			System.out.println("How much Robusta you want?");
			int quantity = input.nextInt();
			int choice6 = c1.Robusta(quantity);
			
		}
		else if (choice5 == 3){
			System.out.println("How much Frappe you want?");
			int quantity = input.nextInt();
			int choice6 = c1.Frappe(quantity);
			
		}
		else if (choice5 == 4){
			System.out.println("How much Excelsa you want?");
			int quantity = input.nextInt();
			int choice6 = c1.Excelsa(quantity);
			
		}
		else if (choice5 == 5){
			System.out.println("*****Thanks for your order*****");
			break;
		}

		else {
			System.out.println("Invalid Entry");
			
		}
		System.out.println("**********Anything else you need?**********"); 
		System.out.println("1 - Cappuccino 1495 Rs "); 
		System.out.println("2 -Robusta 895 Rs "); 
		System.out.println("3 - Frappe 608 Rs"); 
		System.out.println("4 - Excelsa 725 Rs ");
		System.out.println("5 - To exit ");

		int choice7 = input.nextInt();
		
		if (choice7 == 1){
			System.out.println("How much Cappuccino you want?");
			int quantity = input.nextInt();
			int choice8 = c1.Cappuccino(quantity);
			
		}
		else if (choice7 == 2){
			System.out.println("How much Robusta you want?");
			int quantity = input.nextInt();
			int choice8 = c1.Robusta(quantity);
			
		}
		else if (choice7 == 3){
			System.out.println("How much Frappe you want?");
			int quantity = input.nextInt();
			int choice8 = c1.Frappe(quantity);
			
		}
		else if (choice7 == 4){
			System.out.println("How much Excelsa you want?");
			int quantity = input.nextInt();
			int choice8 = c1.Excelsa(quantity);
			
		}
		else if (choice7 == 5){
			System.out.println("*****Thanks for your order*****");
			break;
		}

		else {
			System.out.println("Invalid Entry");
			
		}
		
		}
			
		
		System.out.println("Your total bill is : " + c1.totalPrice() + "Rs");
		System.out.println("Thanks for coming <3");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		


		
		}
			                   
}
