package homework;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String kod) {
		System.out.println("Yapıcı blok çalıştı.");
		
	}
	
	
	public Product() {//overloading
		
	}
	//attribute veya field
	 int id;
	 String name;
	 String description;
	 double price;
	 int stockAmount;
	 String kod;
	
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	
	

}
