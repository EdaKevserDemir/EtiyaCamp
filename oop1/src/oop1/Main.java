package oop1;

public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("meyve");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("yemek");
		
		Product product=new Product();
		product.setId(1);
		product.setName("Elma");
		product.setUnitPrice(50);
		product.setCategory(category1);
		
		System.out.println(product.getName());
		System.out.println(product.getUnitPrice());
		System.out.println(product.getDiscountedPrice());
		System.out.println(product.getCategory().getName());

		
	}

}
