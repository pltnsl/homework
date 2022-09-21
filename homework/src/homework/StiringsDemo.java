package homework;

public class StiringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("9. eleman sayısı: " + mesaj.charAt(8));
		System.out.println(mesaj.concat("Tam gezmelik.Ne dersin?"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("?"));
		
		char [] karakterler = new char [5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
	}

}
