import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Character {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int type = rand.nextInt(100) + 1;
        int end = rand.nextInt(100) + 1;
        int str = rand.nextInt(100) + 1;
        int ag = rand.nextInt(100) + 1;
        int acc = rand.nextInt(100) + 1;
        int in = rand.nextInt(100) + 1 ;
        int per = rand.nextInt(100) + 1;
        int will = rand.nextInt(100) + 1;
        int app = rand.nextInt(100) + 1;
        int nineRolls = rand.nextInt(100) + 1;
        int caste = rand.nextInt(100) + 1;

        System.out.println(type);
        System.out.println(end);
        System.out.println(str);
        System.out.println(ag);
        System.out.println(acc);
        System.out.println(in);
        System.out.println(per);
        System.out.println(will);
        System.out.println(app);
        System.out.println("Ninth Bonus Roll (Ninerolls)" + nineRolls);
        System.out.println("Caste: " + caste);
    }
}
