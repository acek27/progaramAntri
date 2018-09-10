
package program_antri;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int jumlah;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah antrian : ");
        jumlah = in.nextInt();
        
    antrian a1 = new antrian (jumlah);
        
    }
}
