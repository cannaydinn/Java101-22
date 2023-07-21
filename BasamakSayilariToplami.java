import java.util.Scanner;

public class BasamakSayilariToplami{
    public static void main(String[] args) {
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Scanner sc = new Scanner(System.in);
        int sayi, birler, onlar, yuzler, binler;

        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
        sayi = sc.nextInt();

        birler = sayi % 10;
        onlar = (sayi/10)%10;
        yuzler=(sayi/100)%10;
        binler=sayi/1000;

        int basamakToplami = birler + onlar + yuzler + binler;
        System.out.println(sayi+" sayısının basamakları toplamı: "+basamakToplami);
    }
}