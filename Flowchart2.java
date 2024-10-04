
import java.util.Scanner;

public class Flowchart2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float diskon;
        String jenisBuku;
        int jmlBuku;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jmlBuku = input.nextInt();

        if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.10f;
            if (jmlBuku > 2) {
                diskon = 0.10f + 0.02f;
            }
            System.out.println("Total Diskon = " + diskon);

        } else if (jenisBuku.equalsIgnoreCase("Komik")) {
            diskon = 0.07f;
            if (jmlBuku > 3) {
                diskon = 0.07f + 0.02f;
            } else if (jmlBuku < 3 || jmlBuku == 3) {
                diskon = 0.07f + 0.01f;
            }
            System.out.println("Total Diskon = " + diskon);

        } else if (jmlBuku > 3) {
            diskon = 0.05f;
            System.out.println("Total Diskon = " + diskon);
        } else {
            diskon = 0f;
            System.out.println("Total Diskon = " + diskon);
            input.close();
        }
    }
}
