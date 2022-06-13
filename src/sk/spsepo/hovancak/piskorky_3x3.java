package sk.spsepo.hovancak;

import java.util.Scanner;

public class piskorky_3x3 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        char hrac1, hrac2;
        char c = 32, d = 32, e = 32, f = 32, g = 32, h = 32, i = 32, j = 32, k = 32;
        int x, y, z = 0, n, m,o, v, t;
        int q=0;
        System.out.println("Piskôrky 3x3");
        System.out.println("Prvy hrac vyber si s cim chces hrat x alebo o");
        for (; ; ) {
            hrac1 = w.nextLine().charAt(0);
            if (hrac1 == 'x') {
                System.out.println("Hrac1 ma " + hrac1 + " Hrac2 ma o");
                hrac2 = 'o';
                break;
            }
            if (hrac1 == 'o') {
                System.out.println("Hrac1 ma " + hrac1 + " Hrac2 ma x");
                hrac2 = 'x';
                break;
            } else {
                System.out.println("mozes mat iba x alebo o");
            }
        }

        for (x = 0; x <= 9; x++) {
            System.out.println("      1    2    3");
            System.out.println("  -------------------");
            System.out.println("a |  " + c + "  |  " + d + "  |  " + e + "  |");
            System.out.println("  -------------------");
            System.out.println("b |  " + f + "  |  " + g + "  |  " + h + "  |");
            System.out.println("  -------------------");
            System.out.println("c |  " + i + "  |  " + j + "  |  " + k + "  |");
            System.out.println("  -------------------");
            System.out.println("Hrac 1 ");
            System.out.println("zadaj suradnice najprv rad a potom stlpec");
            t = w.nextInt();
            v = w.nextInt();

            for (y = 0; y <= 4; y++) {
                switch (t) {
                    case 1:
                        switch (v) {
                            case 1:
                                c = hrac1;
                                break;
                            case 2:
                                d = hrac1;
                                break;
                            case 3:
                                e = hrac1;
                        }
                        break;
                    case 2:
                        switch (v) {
                            case 1:
                                f = hrac1;
                                break;
                            case 2:
                                g = hrac1;
                                break;
                            case 3:
                                h = hrac1;
                        }
                        break;
                    case 3:
                        switch (v) {
                            case 1:
                                i = hrac1;
                                break;
                            case 2:
                                j = hrac1;
                                break;
                            case 3:
                                k = hrac1;
                        }
                        break;
                    default:
                        System.out.println("zle si zadal rad");
                }
                break;
            }
            for (m = 0; m <= 9; m++) {
                if (hrac1 == 'x' || hrac1 == 'o') {
                    if (c == hrac1 && f == hrac1 && i == hrac1 || d == hrac1 && g == hrac1 && j == hrac1 || e == hrac1 && h == hrac1 && k == hrac1 || c == hrac1 && d == hrac1 && e == hrac1 || f == hrac1 && g == hrac1 && h == hrac1 || i == hrac1 && j == hrac1 && k == hrac1 || i == hrac1 && g == hrac1 && e == hrac1 || k == hrac1 && g == hrac1 && c == hrac1) {
                        x=10;
                        n=10;
                        q=1;
                        System.out.println("Vyhral Hrac1");
                    }
                }
                break;
            }

            System.out.println("      1    2    3");
            System.out.println("  -------------------");
            System.out.println("a |  " + c + "  |  " + d + "  |  " + e + "  |");
            System.out.println("  -------------------");
            System.out.println("b |  " + f + "  |  " + g + "  |  " + h + "  |");
            System.out.println("  -------------------");
            System.out.println("c |  " + i + "  |  " + j + "  |  " + k + "  |");
            System.out.println("  -------------------");
            if (q==0){
                System.out.println(" Hrac 2 ");
                System.out.println("zadaj suradnice najprv rad a potom stlpec");
                t = w.nextInt();
                v = w.nextInt();
            }
            for (z = 0; z <= 3; z++) {
                switch (t) {
                    case 1:
                        switch (v) {
                            case 1:
                                c = hrac2;
                                break;
                            case 2:
                                d = hrac2;
                                break;
                            case 3:
                                e = hrac2;
                        }
                        break;
                    case 2:
                        switch (v) {
                            case 1:
                                f = hrac2;
                                break;
                            case 2:
                                g = hrac2;
                                break;
                            case 3:
                                h = hrac2;
                        }
                        break;
                    case 3:
                        switch (v) {
                            case 1:
                                i = hrac2;
                                break;
                            case 2:
                                j = hrac2;
                                break;
                            case 3:
                                k = hrac2;
                        }
                        break;
                    default:
                        System.out.println("zle si zadal rad");
                }
                break;
            }

            for (n = 0; n <= 9; n++) {
                if (hrac2 == 'x' || hrac2 == 'o') {
                    if (c == hrac2 && f == hrac2 && i == hrac2 || d == hrac2 && g == hrac2 && j == hrac2 || e == hrac2 && h == hrac2 && k == hrac2 || c == hrac2 && d == hrac2 && e == hrac2 || f == hrac2 && g == hrac2 && h == hrac2 || i == hrac2 && j == hrac2 && k == hrac2 || i == hrac2 && g == hrac2 && e == hrac2 || k == hrac2 && g == hrac2 && c == hrac2) {
                        x = 10;
                        System.out.println("Vyhral Hrac2");
                        System.out.println("      1    2    3");
                        System.out.println("  -------------------");
                        System.out.println("a |  " + c + "  |  " + d + "  |  " + e + "  |");
                        System.out.println("  -------------------");
                        System.out.println("b |  " + f + "  |  " + g + "  |  " + h + "  |");
                        System.out.println("  -------------------");
                        System.out.println("c |  " + i + "  |  " + j + "  |  " + k + "  |");
                        System.out.println("  -------------------");
                    }
                }
                break;
            }

        }
    }
}
