import java.util.Scanner;

public class Kereta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mengisi
        System.out.println("|====================================================|");
        System.out.println("|       JURUSAN        |         HARGA TIKET         |");
        System.out.println("|====================================================|");
        System.out.println("|                      |   Business   |  Executive   |");
        System.out.println("|1. Surabaya-Jogja     | Rp. 310.000  | Rp. 435.000  |");
        System.out.println("|2. Jombang-Solo       | Rp. 230.000  | Rp. 270.000  |");
        System.out.println("|3. Sidoarjo-Kertosono | Rp. 230.000  | Rp. 295.000  |");
        System.out.println("|====================================================|");
        System.out.println("                                             ");
        System.out.println("                                             ");
        System.out.print("Masukkan Jurusan (gunakan angka 1-3): ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan Tipe Tiket: ");
        String tipe = scanner.nextLine();

        scanner.close();

        //penghitung harga tiket
        int hargatiket = 0;
        if (jurusan.equals("1")) {
            if (tipe.equals("Business")) {
                hargatiket = 3100000;
            } else if (tipe.equals("Executive")) {
                    hargatiket = 435000;
            }
        } else if (jurusan.equals("2")) {
            if (tipe.equals("Business")) {
                    hargatiket = 230000;
            } else if (tipe.equals("Executive")) {
                    hargatiket = 270000;
            }
        } else if (jurusan.equals("3")) {
            if (tipe.equals("Business")) {
                    hargatiket = 230000;
            } else if (tipe.equals("Executive")) {
                hargatiket = 295000;    
            }   
        }       

        
        //Hasil
        System.out.println("                                             ");
        System.out.println("                                             ");
        System.out.println("|=====================================|");
        System.out.println("|          TIKET YANG DIPESAN         |");
        System.out.println("|=====================================|");
        System.out.println("|Jurusan : " + jurusan);
        System.out.println("|Tipe Tiket : " + tipe);
        System.out.println("|Harga Tiket : " + hargatiket);
        System.out.println("|=====================================|");
        System.out.println("|     TERIMA KASIH TELAH MEMESAN      |");
        System.out.println("|=====================================|");
        System.out.println("                                             ");
        System.out.println("                                             ");
    }
}