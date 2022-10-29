package sınıfıgeçmedurumu;
import java.util.Scanner;
import java.math.*;
public class SınıfıGeçmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,say=0;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        if(mat>=0 && mat<=100){
            say+=1; 
        }
        else{
            mat=0;
        }
        
        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){
            say+=1;
        }
        else{
            fizik=0;
        }
        
        System.out.println("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        if(turkce>=0 && turkce<=100){
            say+=1;  
        }
        else{
            turkce=0;
        }
        
        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){
            say+=1;  
        }
        else{
            kimya=0;
        }
        
        System.out.println("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if(muzik>=0 && muzik<=100){
            say+=1;

        }
        else{
            muzik=0;
        }
        
        double ort=(mat+fizik+kimya+turkce+muzik)/say;
        
        if(ort<55){
            System.out.println(ort+"Dersi geçemediniz");
        }
        else{
            System.out.println(ort+"Tebrikler, geçtiniz!");
        }
        
        
    }
    
}
