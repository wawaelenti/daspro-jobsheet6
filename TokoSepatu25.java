import java.util.Scanner;

public class TokoSepatu25 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner (System.in);

        System.out.println("Masukkan kode sepatu (1-3): ");
        int kodeSepatu = input25.nextInt();

        if (kodeSepatu == 1) {
            System.out.println("Merk: Converse");
            System.out.println("Slip on (36-40) Harga: 800.000");
            System.out.println("High top (40-44) Harg: 1.200.000");
        }else {
            if (kodeSepatu == 2) {
                System.out.println("Merk: Sketcher");
                System.out.println("Woman (36-41) harga: 1.000.000");
                System.out.println("Man (41-44) harga: 1.800.000");
            }else {
                if (kodeSepatu == 3) {
                    System.out.println("Merk: Nike");
                    System.out.println("Kids (36-40) harga: 750.000");
                    System.out.println("Adult (40-44) Harga: 1.500.000");

                }
            }
        }
        input25.close();
    }
}
