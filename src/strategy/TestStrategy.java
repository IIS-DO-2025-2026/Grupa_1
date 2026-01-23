package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 200;
		
		System.out.println("Regularna cena je: " + amount);
		
		System.out.println("Cena za studente je: " + studentCart.calculateTotal(amount));
		
		System.out.println("Cena za penzionere je: " + pensionersCart.calculateTotal(amount));
		
		//BuffredWriter - klasa u jeziku Java koja omogućava upis podataka u tok podataka (stream) - upis u tekstualnu datoteku (.txt)
		//BuffredReader
		
		//ObjectOutputStream - klasa u jeziku Java koja omogućava upis objekata u tok podataka (stream) - kreiranje crteža (.bin)
		//ObjectInputStream
	}

}
