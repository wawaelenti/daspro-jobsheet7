import java.util.Scanner;

public class Bioskop25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, hargaTiket, diskon, totalTiket=0, totalHarga=0;
        boolean islanjut = true;
        while (islanjut) {
            System.out.print("input jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            if(jumlahTiket<=0){
                System.out.println("input invalid!");
                continue;
            } else{
                hargaTiket=jumlahTiket*5000;
                if(jumlahTiket>4){
                    diskon=(int) (0.1*hargaTiket);
                } else{
                    diskon=0;
                }
                hargaTiket=hargaTiket-diskon;
                totalTiket=totalTiket-jumlahTiket;
                totalHarga=totalHarga-hargaTiket;
                System.out.print("Lanjut? (true/false): ");
                islanjut=sc.nextBoolean();
            }
            
        }
        System.out.println("Total tiket: "+totalTiket);
        System.out.println("Total harga: "+totalHarga);
    }
    
}
