import java.util.Scanner;

public class booking {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String[] kursi = new String[10];
        
        while (true){
            System.out.println("\n=== Bioskop ===");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Booking kursi");
            System.out.println("3. Keluar");
            System.out.print(">> ");
            int opsi = input.nextInt();

            if (opsi == 3){
                System.out.println("Terimakasih!");
                break;
            }
            else {
                switch (opsi) {
                case 1:
                    System.out.println("\nKursi yang sudah di-booking: ");
                    System.out.println("'O' = Sudah diisi");
                    System.out.println("'X' = Belum diisi\n");

                    System.out.println("\nPilihan kursi: ");
                    for (int i = 0; i < kursi.length; i++) {
                        if (kursi[i] == null) {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "[X]");
                        }
                        else {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "[O]");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nKursi yang tersedia di bioskop: ");
                    System.out.println("'O' = Sudah diisi");
                    System.out.println("'X' = Belum diisi\n");

                    System.out.println("\nPilihan kursi: ");
                    for (int i = 0; i < kursi.length; i++) {
                        if (kursi[i] == null) {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "[X]");
                        }
                        else {
                            int angka = i+1;
                            System.out.println("Kursi ke-" + angka + ". : " + "[O]");
                        }
                    }

                    System.out.print("Kursi mana yang anda ingin booking? : ");
                    int pilihanKursi = input.nextInt();
                    if (pilihanKursi > kursi.length || pilihanKursi < 1) {
                        System.out.println("\nInput tidak valid!");
                    }
                    else {
                        int pilihanKursiFixed = pilihanKursi - 1;
                        if (kursi[pilihanKursiFixed] == null) {
                            System.out.println("\nAnda sudah sukses membooking kursi no " + pilihanKursi + ".");
                            kursi[pilihanKursiFixed] = "O";
                            break;
                        }
                        else {
                            System.out.println("\nKursi yang anda pilih telah dibooking oleh orang lain!");
                            continue;
                        }
                    }
                }
            }

            
        }
    }
}
