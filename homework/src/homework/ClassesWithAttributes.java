package homework;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		//Product product = new Product( 1,  "Laptop", "Lenovo Laptop",  5500, 3, "A1085");
		Product product = new Product();
		product.setName("Laptop");
		product.id=1;
		product.description="Lenovo Laptop";
		product.price=5500;
		product.stockAmount=3;
		product.kod="A1085";
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		
		

	}

}
