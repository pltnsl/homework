package homework;

public class Metods {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,3,6,7,9,0};
		int aranacak = 7;
		boolean varMi=false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
				
				
			}
			
		}
		if(varMi) {
			mesajVer("Sayı mevcuttur : " +aranacak);
		}else {
			mesajVer("Sayı mevcuttur değildir : " +aranacak);
		}	
		}
		
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
	
	}

}
