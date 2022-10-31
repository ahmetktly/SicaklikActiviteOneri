package Sicaklik;

import java.util.Scanner;

public class Sicaklik{

public static void main(String[] args) {

    Scanner tar=new Scanner(System.in);

    System.out.println("Hava Kaç Derece?");

    int s=tar.nextInt();
    
    if(s<5){

        System.out.println("Tam Kayaklık Hava");

    }
    else if(s>5 && s<=15){

        System.out.println("Hadi Sinemaya Gitmeyelimmi?");    
    }

    else if(s>15 && s<=25){

        System.out.println("Piknik Havası Var");
    }

    else if(s>25){

        System.out.println("Deniz Şimdi Ne Güzeldir");
    }
}
}