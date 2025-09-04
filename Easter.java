// Munkhsoyombo Munkhbat, Period: 4, 09/04/2025
// This program will calculate the date easter falls on given year.

public class Easter{
    public static void main(String[] args) {
        int y = 2026;
        int a = y % 19;
        System.out.println(a);
        int b = y / 100;
        System.out.println(b);
        int c = y % 100;
        System.out.println(c);
        int d = b / 4;
        System.out.println(d);
        int e = b % 4;
        System.out.println(e);
        int f = (b + 8) / 25;
        System.out.println(f);
        int g = (b - f + 1) / 3;
        System.out.println(g);
        int h = (19 * a + b - d - g + 15) % 30;
        System.out.println(h);
        int i = c / 4;
        System.out.println(i);
        int k = c % 4;
        System.out.println(k);
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        System.out.println(r);
        int m = (a + 11 * h + 22 * r) / 451;
        System.out.println(m);
        int n = (h + r - 7 * m + 114) / 31;
        System.out.println(n);
        int p = (h + r - 7 * m + 114) % 31;
        System.out.println(p);
        p ++;
        System.out.println("Easter in " + y + " falls on " + n + "/" + p);
    }
}