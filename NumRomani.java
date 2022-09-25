import javax.swing.*;

public class NumRomani {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserire numero decimale (1-399)"));

        //from 1 to 399

        //PARTE CENTINAIA

        int C = n;

        if (C >= 400 || C < 1){

                System.out.print("Ho detto tra 1 e 399!!!!!!!");

        }



        if (C >= 100 && C <= 399){
            C = C/100;
            int c = 0;
            do {
                C--;
                c++;
            }while(C != 0);
            for (int j = 0; j < c; j++) {
                System.out.print("C");
            }
        }


        //PARTE DECINE
        int D = n%100;

        if (D >= 40 && D <50){
            D = D/10;
            int d = 0;
            do {
                D--;
                d++;
                if (d == 4){
                    System.out.print("XL");
                    d = 0;
                }
            }while(D != 0);
            for (int j = 0; j < d; j++) {
                System.out.print("X");
            }
        }


        if ((D >= 10 && D < 40) || (D >= 50 && D <= 89)){
            D = D/10;
            int d = 0;
            do {
                D--;
                d++;
                if (d == 5){
                    System.out.print("L");
                    d = 0;
                }
            }while(D != 0);
            for (int j = 0; j < d; j++) {
                System.out.print("X");
            }
        }


        if (D>89 && D <= 99){
            System.out.print("X");
            System.out.print("C");

        }


        //PARTE UNITA'
        int U = n % 10;
        int i = 0;
        if (U % 10 == 1) {
            System.out.print("I");
        }
        if (U % 10 == 2) {
            System.out.print("II");
        }
        if (U % 10 == 3) {
            System.out.print("III");
        }
        if (U == 4) {
            System.out.println("IV");
        }
        if (U == 5) {
            System.out.println("V");
        }
        if (U > 5 && U <= 8) {
            do {
                U--;
                i++;
            } while (U != 5);
            System.out.print("V");
            for (int j = 0; j < i; j++) {
                System.out.print("I");
            }
        }
        if (U == 9) {
            System.out.println("IX");
        }

    }
}
