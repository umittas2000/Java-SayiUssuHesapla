import java.util.Scanner;

public class UsluSayiHesapla {
    public static void main(String[] args) {
        /*
            Kural1: 0^0 tanimsizdir
            Kural2: Herhangi bir sayinin 0. kuvveti = 1 dir
            Kural3: 0 sayisinin ussu ne olursa olsun 0 dir
            Kural4: negatif sayilarin ussu pozitif ve tekse sonuc negatif, ciftse sonuc pozitiftir.
            Kural5: Negatif usler boler
            Kural6: Pozitif usler carpar
        */

        Scanner input = new Scanner(System.in);
        double n, k,hesapla,hesaplanegatif=-1; // n kullanicidan alinan sayi, k kullanicidan alinan us degeri
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n = input.nextInt();

        System.out.print("Hesaplanmasini istediginiz sayi ussu giriniz: ");
        k = input.nextInt();

        //Kural2: Eger us 0 ise n = 1, yoksa girilen sayidir.
        if(k==0) {
            hesapla = 1;
        } else {
            hesapla = n;
        }

        //Kural1: Eger sayi ve ussu ikiside 0 ise , sonuc tanimsizdir.
        if(n==0 && k==0){
            System.out.println(n+"^"+k+"= Tanimsizdir");
        }else {

            if(k>=0) {
                for (int i = 1; i < k; i++) {
                    hesapla *= n;
                }
            }else{
                for (int i = -1; i > k; i--) {
                    hesapla *= n;
                }
                hesapla=1/hesapla; //Negatif us oldugunda 1/ hesapla gerekli.
            }

            System.out.println("" + n + "^" + k + " = " + hesapla);
        }
    }
}
