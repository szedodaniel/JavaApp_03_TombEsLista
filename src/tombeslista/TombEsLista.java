
package tombeslista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TombEsLista {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.feladat
     /*   int[] tomb = veletlenEgeszTomb(25, -10, 250);
        for (int item : tomb) {
           // System.out.println(item);
        }
        
        for (int i = 0; i < tomb.length; i+=2) {
           
            tomb[i] = (int)Math.pow(tomb[i],2);
           
           //System.out.println(tomb[i]);
        }
          //2.feladat
       int[] tomb2 = new int[5];
        System.out.println("Adjon meg öt számot!");
        tomb2[0] = sc.nextInt();
        tomb2[1] = sc.nextInt();
        tomb2[2] = sc.nextInt();
        tomb2[3] = sc.nextInt();
        tomb2[4] = sc.nextInt();
        
        System.out.println("Adjon meg egy indexet egy és öt között!");
        int ind = 0;
         ind = sc.nextInt();
        
        System.out.println("osszes");
        for(int item2 : tomb2) {
            
            System.out.println(item2);
        }
        System.out.println("vissza");
        for (int i = tomb2.length-1; i >=0; i--) {
            System.out.println(tomb2[i]);
        }
       
        System.out.println("második");
        for (int i = 0; i < tomb2.length; i+=2) {
           
            System.out.println(tomb2[i]);
        }
        System.out.println("A "+ind+". elem az a "+tomb2[ind-1]);
       */

        //4.Feladat
        
        List<Integer> szamok = new ArrayList<>();
        int bekert;
        char index ;
        do
        {
            System.out.println("Nyomja meg az e-t, ha a lista  elejére, v-t ha lista végére kívánja adni a számot");
            index = sc.next().charAt(0);
            
            if(index == 'e'){
                System.out.println("Adjon meg egy számot!");
                bekert = sc.nextInt();
                if(!szamok.equals(bekert)){
                    szamok.add(0,bekert);

                }
                else{
                    
                    
                    String.format("Ez a szám már szerepel a listában! A %d. helyen",szamok.indexOf(bekert));
                }
            } 
            else if(index == 'v') {
                System.out.println("Adjon meg egy számot!");
                bekert = sc.nextInt();
                if(!szamok.equals(bekert)){
                    szamok.add(bekert);

                }else{
                   String.format("Ez a szám már szerepel a listában! A %d. helyen",szamok.indexOf(bekert));
                }
            }else
            {
               
                index = '0';
            }
            
            
        }while(index != '0');
        
        for(int szam: szamok){
            System.out.println(szam);
        }
    }
    public static int[] veletlenEgeszTomb(int db, int min, int max){
    Random rnd = new Random();
        int[] t = new int[db];
            for (int i = 0; i < db; i++) {
                    t[i] = (int)(rnd.nextDouble()*(max-min)+min);
// t[i] = (int)(Math.random()*(max-min)+min);
            }
        return t;
    }
    
}
