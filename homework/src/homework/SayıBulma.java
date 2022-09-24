package homework;

public class SayıBulma {

	public static void main(String[] args) {
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
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}

	}
	
	
	
}
