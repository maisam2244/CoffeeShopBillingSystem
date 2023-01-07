package CoffeeShop;

public class Coffee {
	
	int total1;
	int total2;
	int total3;
	int total4;
	int total5;
	
	public int Cappuccino(int q) {
		
		total1 = 1495 * q;
		return total1;
	}
    public int Robusta(int q) {
		
		total2 = 825 * q;
		return total2;
	}
    public int Frappe(int q) {
		
		total3 = 608 * q;
		return total3;
	}
    public int Excelsa(int q) {
		
		total4 = 725 * q;
		return total4;
	}
    
    public int totalPrice()
    {
    	total5 = total1 + total2 + total3 + total4;
    	return total5;
    }

}
	


