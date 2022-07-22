package day2;

public class Main {

	public static void main(String[] args) {
//		findNumber();
//		int total = totalNum(5, 15);
//		System.out.println(total);
//		int total2=total2(1,2,3,4,5,6,7,8,9);
//		System.out.println(total2);
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		
		DortIslem dortIslem=new DortIslem();
		int sonuc=dortIslem.topla(150, 120);
		System.out.println(sonuc);
		
		
		Product product=new Product();
		product.setName("Laptop");
		product.setDescription("Asus");
		product.setPrice(25000);
		product.setStockAmount(15);
		
		
		System.out.println(product.getName());
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 6, 7, 9, 0 };
		int search = 6;
		boolean isThere = false;
		for (int number : numbers) {
			if (number == search) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			getMessage("number found : " + search);
		} else {
			getMessage("number not found : " + search);
		}
	}

	public static void getMessage(String message) {
		System.out.println(message);
	}
	public static int totalNum(int number1, int number2) {
		return number1 + number2;
	}

	//variable arguments
	public static int total2(int... numbers) {
		int total2=0;
		for (int number : numbers) {
			total2=total2+number;
		}
		return total2;
	}
}
