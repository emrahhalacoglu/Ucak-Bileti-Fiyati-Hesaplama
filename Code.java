import java.util.Scanner;
public class Code{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double mesafe,yolcuYasi,yolculukTipi,indirimYuzdesi,ucakBiletiUcreti;

            System.out.print("Yolculuk mesafesini giriniz : ");
            mesafe=input.nextDouble();
            System.out.print("Yolcunun yasini giriniz : ");
            yolcuYasi=input.nextDouble();
            System.out.print("Yolculuk tipini giriniz (1 - Tek Yon / 2 - Gidis Donus) : ");
            yolculukTipi=input.nextDouble();

            if((mesafe>0)&&(yolcuYasi>0)&&(yolculukTipi>=1&&yolculukTipi<=2)){
                if(yolcuYasi<12){
                    if (yolculukTipi==1){
                        indirimYuzdesi=0.5;System.out.println("50% indirime hak kazandiniz.");ucakBiletiUcreti=mesafe*0.1*(1-indirimYuzdesi);System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}
                    else{
                        indirimYuzdesi=0.5;System.out.println("50% indirime ek 20% indirim hakki kazandiniz.");ucakBiletiUcreti=mesafe*2*0.1*(1-indirimYuzdesi)*0.8;System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}}
                else if(yolcuYasi>=12&&yolcuYasi<=24){
                    if(yolculukTipi==1){
                        indirimYuzdesi=0.1;System.out.println("10% indirime hak kazandiniz.");ucakBiletiUcreti=mesafe*0.1*(1-indirimYuzdesi);System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}
                    else{
                        indirimYuzdesi=0.1;System.out.println("10% indirime ek 20% indirim hakki kazandiniz.");ucakBiletiUcreti=mesafe*2*0.1*(1-indirimYuzdesi)*0.8;System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}}
                else if(yolcuYasi>=65){
                    if(yolculukTipi==1){
                        indirimYuzdesi=0.3;System.out.println("30% indirime hak kazandiniz.");ucakBiletiUcreti=mesafe*0.1*(1-indirimYuzdesi);System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}
                    else{
                        indirimYuzdesi=0.3;System.out.println("30% indirime ek 20% indirim hakki kazandiniz.");ucakBiletiUcreti=mesafe*2*0.1*(1-indirimYuzdesi)*0.8;System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}}
                else if(yolcuYasi>24&&yolcuYasi<65){
                    if(yolculukTipi==1){
                        indirimYuzdesi=0;ucakBiletiUcreti=mesafe*0.1*(1-indirimYuzdesi);System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}
                    else{
                        indirimYuzdesi=0.2;System.out.println("20% indirime hak kazandiniz.");ucakBiletiUcreti=mesafe*2*0.1*(1-indirimYuzdesi);System.out.println("Ucak Bileti Bedeli = "+ucakBiletiUcreti+" TL");}
                }
            }
            else{
                System.out.println("Hatali Veri Girdiniz!");

            }
        }
        

    }
}


