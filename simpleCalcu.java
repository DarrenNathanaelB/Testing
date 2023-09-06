import java.util.Scanner;

public class simpleCalcu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan isi variabel a:");
        float a = input.nextFloat();
        System.out.print("Masukkan isi variabel b:");
        float b = input.nextFloat();

        float penjumlahan = a + b;
        float pengurangan = a - b;
        System.out.println("Hasil Penjumlahan Variable a dan b = " + penjumlahan);
        System.out.println("Hasil Pengurangan Variable a dan b = " + pengurangan);
    }
}
