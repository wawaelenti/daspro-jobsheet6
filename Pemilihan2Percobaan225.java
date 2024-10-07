import java.util.Scanner;

public class Pemilihan2Percobaan225 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        int pemilihan_menu;
        String member;
        double diskon, harga, total_bayar;
        double potongan_qris = 1000;
        

        //print daftar menu 
        System.out.println("------------------------");
        System.out.println("===== MENU KAFE JTI ====");
        System.out.println("------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");
    
        pemilihan_menu = input25.nextInt();
        input25.nextLine();
        System.out.print("Apakah punya member (y/n) ? =");
        member = input25.nextLine();
        System.out.println("Jenis pembayaran? (1 = QRIS, 2 = lainnya): ");
        int pembayaran = input25.nextInt();
        System.out.println("---------------------------------------");
        

        if (member.equals("Y")) {//Menggunakan equalsIgnoreCase untuk membandingkan String}
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pemilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);  

            } else if (pemilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =" + harga);

            } else if (pemilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih
            }

            //menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
    } 

            
            else if (member.equals ("N")) {//Menggunakan equalsIgnoreCase untuk membandingkan string}
                if (pemilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);

                } else if (pemilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);

                } else if (pemilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);

                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return; //Menghentikan eksekusi lebih lanjut jika pilihan salah

                }

                //Menghitung total bayar
                total_bayar = harga;
                System.out.println("Total bayar = " + total_bayar);

            } else {
                System.out.println("Member tidak valid");
                return;
            } 
            
            //Potongan harga jika pakai QRIS
            if (pembayaran == 1) {
                total_bayar -= potongan_qris;
                System.out.println("Pembayaran melalui QRIS, potongan Rp.1.000");
            }

            System.out.println("Total bayar setelah potongan QRIS= " + total_bayar);
            System.out.println("--------------------------------------------");
        
}
}