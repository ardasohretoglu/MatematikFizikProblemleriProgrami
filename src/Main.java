
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik problemleri programına hoş geldiniz ");
        
        String islemler = "İşlemler...\n"
                + "1. Daire alanı hesapla\n"
                + "2. Üçgen çevresi hesapla\n"
                + "3. 2 vektörün iç çarpımlarını hesapla...\n"
                + "Çıkış için q ya basın";
        
        while (true) {
            
            System.out.println(islemler);
            
            System.out.print("İşlemi seçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }else if (islem.equals("1")) {
                
                System.out.print("Dairenin Yarıçapını girin : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.daireAlan(yaricap);
                
            }else if (islem.equals("2")) {
                
                System.out.println("Üçgenin kenarlarını giriniz ...");
                System.out.print("1. Kenar");
                int kenar1 = scanner.nextInt();
                
                
                System.out.print("2. Kenar");
                int kenar2 = scanner.nextInt();
                
                
                System.out.print("3. Kenar");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
                
            }else if(islem.equals("3")){
                
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
                
                Problem.Fizik.icCarpim(vec1, vec2);
                
            }else{
                System.out.println("Geçersiz işlem");
            }
            
            
        }
        
    }
    
}
