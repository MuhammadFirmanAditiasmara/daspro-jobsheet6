
import java.util.Scanner;

public class Pemilihan2Percobaan318 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukan Kategori = ");
        kategori = input.nextLine();
        System.out.print("Masukan Besarnya Penghasilan = ");
        penghasilan = input.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih = " + gajiBersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih = " + gajiBersih);

        } else {
            System.out.println("Kategori Salah");
        }

    }
}
