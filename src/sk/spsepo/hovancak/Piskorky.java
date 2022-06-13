package sk.spsepo.hovancak;

import java.util.Scanner;

class vypis {
     vypis(String[] bunka) {
        System.out.println("\tA \tB \tC");
        for (int i = 0; i < 9; i = i + 3) {
            System.out.print((i / 3 + 1) + "\t");
            for (int j = i; j < i + 3; j++) {
                System.out.print(bunka[j]);
            }
            System.out.println();
        }
    }
}


public class Piskorky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>>>>PISKORKY 3x3<<<<<\n");
        String[] bunka = new String[9];
        boolean win=false;
        String xo = "x", suradnice="";
        int a , pkol=0;

        for (int i = 0; i < bunka.length; i++) {
            bunka[i] = "-\t";
        }

        while (!win&&pkol!=9){

            new vypis(bunka);


            boolean tr=true;
            while (tr){
                System.out.println("Na rade je hrac s " + xo+"\nZadaj suradnice (cislo od 1 do 3 a znak a, b alebo c)");
                suradnice = sc.nextLine().trim().toLowerCase().replaceAll("( )+","");
                if (suradnice.length()==2){
                    tr=false;
                }
            }
            int index = -97;

            for (int i = 0; i < suradnice.length(); i++) {
                a =  suradnice.charAt(i);
                if (Character.isDigit(a))
                    a = (a - 49) * 3;
                index += a;
            }

            boolean fail=true;

            if (index>-1&&index<9) {
                if (bunka[index].equals("-\t"))
                    bunka[index] = xo + "\t";
                else {
                    System.out.println("\tToto miesto je uz vyplnene\n");
                    fail = false;
                }
            }
            else {
                System.out.println("\tZle si zadal suradnice\n");
                fail = false;
            }

            if (bunka[0].equals(xo+"\t")&&bunka[1].equals(xo+"\t")&&bunka[2].equals(xo+"\t")||bunka[3].equals(xo+"\t")&&bunka[4].equals(xo+"\t")&&bunka[5].equals(xo+"\t")||bunka[6].equals(xo+"\t")&&bunka[7].equals(xo+"\t")&&bunka[8].equals(xo+"\t")||bunka[0].equals(xo+"\t")&&bunka[3].equals(xo+"\t")&&bunka[6].equals(xo+"\t")||bunka[1].equals(xo+"\t")&&bunka[4].equals(xo+"\t")&&bunka[7].equals(xo+"\t")||bunka[2].equals(xo+"\t")&&bunka[5].equals(xo+"\t")&&bunka[8].equals(xo+"\t")||bunka[0].equals(xo+"\t")&&bunka[4].equals(xo+"\t")&&bunka[8].equals(xo+"\t")||bunka[2].equals(xo+"\t")&&bunka[4].equals(xo+"\t")&&bunka[6].equals(xo+"\t")){
                win=true;
                fail=false;
            }
            if (fail){
                pkol++;
                if (xo.equals("x"))
                    xo="o";
                else

                    xo="x";
            }
        }
        new vypis(bunka);
        if (pkol==9)
            System.out.println("\n>>>>>>REMIZA<<<<<\n");
        else
            System.out.println("\n>>>>>VYHRAL HRAC s "+xo+"<<<<<\n");
    }
}
