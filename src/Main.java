import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //int mont = inp.nextInt();
        System.out.print("Hangi Gunde Dogdunuz : ");
        int gun = inp.nextInt();
        System.out.print("Kacinci Ayda Dogdunuz : ");
        int ay = inp.nextInt();

        if (ay == 1) {
            if (gun <= 21) {
                System.out.println("Burcunuz Oglak.");
            } else {
                System.out.println("Burcunuz Kova");
            }
        } else if (ay == 2) {
            if (gun <= 19) {
                System.out.println("Burcunuz Kova.");
            } else {
                System.out.println("Burcunuz Balik");
            }
        } else if (ay == 3) {
            if (gun <= 20) {
                System.out.println("Burcunuz Balik.");
            } else {
                System.out.println("Burcunuz Koc");
            }
        } else if (ay == 4) {
            if (gun <= 20) {
                System.out.println("Burcunuz Koc");
            } else {
                System.out.println("Burcunuz Boga");
            }
        } else if (ay == 5) {
            if (gun <= 21) {
                System.out.println("Burcunuz Boga.");
            } else {
                System.out.println("Burcunuz Ikizler");
            }
        } else if (ay == 6) {
            if (gun <= 22) {
                System.out.println("Burcunuz Ikizler");
            } else {
                System.out.println("Burcunuz Yengec");
            }
        } else if (ay == 7) {
            if (gun <= 22) {
                System.out.println("Burcunuz Yengec");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        } else if (ay == 8) {
            if (gun <= 22) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Basak");
            }
        } else if (ay == 9) {
            if (gun <= 22) {
                System.out.println("Burcunuz Basak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        } else if (ay == 10) {
            if (gun <= 22) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        } else if (ay == 11) {
            if (gun <= 21) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Burcunuz Yay");
            }
        } else{
            if (gun <= 21) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oglak");
            }
        }
    }
}