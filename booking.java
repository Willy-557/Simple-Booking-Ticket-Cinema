import java.util.Scanner;

public class booking {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        String[] kursi = new String[10];
        
        while (true){
            System.out.println("\n=== Bioskop ===");
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
                    System.out.println("\nKursi yang sudah di-booking: ");
                    for (int i = 0; i < kursi.length; i++) {
                        if (kursi[i] == null) {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "❌");
                        }
                        else {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "✅️");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nKursi yang tersedia di bioskop: ");
                    for (int i = 0; i < kursi.length; i++) {
                        if (kursi[i] == null) {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "❌");
                        }
                        else {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "✅️");
                        }
                    }

                    System.out.print("Kursi mana yang anda ingin booking? : ");
                    int pilihanKursi = scanner.nextInt();
                    int pilihanKursiFixed = pilihanKursi - 1;
                    if (kursi[pilihanKursiFixed] == null) {
                        System.out.println("Anda sudah sukses membooking kursi no " + pilihanKursi + ".");
                        kursi[pilihanKursiFixed] = "✅️";
                        break;
                    }
                    else {
                        System.out.println("Kursi yang anda pilih telah dibooking oleh orang lain!");
                        continue;
                    }

                default:
                    break;
            }
            }

            
        }
    }
}
