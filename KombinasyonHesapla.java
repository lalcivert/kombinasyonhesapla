package day01;

import java.util.Scanner;

public class KombinasyonHesapla {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Kümenin eleman sayısını giriniz: ");
        int N;
        N=input.nextInt();

        System.out.println("kombinasyonun kaçlı olacağını giriniz: ");
        int r;
        r=input.nextInt();

        int Nfaktoriyel=1;

        for(int i=1;i<=N;i++){
            Nfaktoriyel=Nfaktoriyel*i;
        }

        int rFaktoriyel=1;

        for(int i=1;i<=r;i++){
            rFaktoriyel=rFaktoriyel*i;
        }

        int farkFakt=1;

        for(int i=1;i<=(N-r);i++){
            farkFakt=farkFakt*i;
        }

        int kombinasyon=Nfaktoriyel/(rFaktoriyel*farkFakt);

        System.out.println("kombinasyon: " + kombinasyon);
    }
}
