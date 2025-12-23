import java.util.Scanner;

public class booking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] kursi = new String[10];
        
        while (true){
            System.out.println("=== Bioskop ===");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Booking kursi");
            System.out.println("3. Keluar");
            System.out.print(">> ");
            int opsi = scanner.nextInt();

            if (opsi == 3){
                System.out.println("Terimakasih!");
                break;
            }
            else {
                switch (opsi) {
                case 1:
                    for (int i = 0; i < kursi.length; i++) {
                        if (kursi[i] == null) {
                            System.out.println("[   ]");
                        }
                        else {
                            System.out.println("[ X ]");
                        }
                    }
                    break;
                
                


                default:
                    break;
            }
            }

            
        }
    }
}
