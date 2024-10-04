
import java.util.Scanner;

public class Pemilihan2percobaan218 {

    public static void main(String[] args) {

        Scanner input18 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        float diskon, harga = 0, totalBayar = 0;

        // tampilan menu
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("1. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yabng dipilih = ");
        pilihan_menu = input18.nextInt();
        input18.nextLine();
        System.out.print("Apakah Punya member (y/n) ? = ");
        member = input18.nextLine();
        System.out.println("--------------------------------------");

        // Jika punya member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10f;
            System.out.println("Besar diskon = 10% ");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Ricebowl " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar ");
                return;
            }
            totalBayar = harga - (harga * diskon);
            System.out.println("Total Harga setelah diskon = " + totalBayar);
        } // Tanpa member
        else if (member.equalsIgnoreCase("n")) {

            System.out.println("Besar diskon = 0% ");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Ricebowl " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar ");
                return;
            }
            totalBayar = harga;
            System.out.println(" Total Harga = " + totalBayar);
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");

        input18.close();
    }
}
