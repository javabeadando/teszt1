package alg;

public class Jatek {

    private static Dobokocka kocka = new Dobokocka();

    private String jatekosNev;

    private int fordulok, kockaszam;

    private int tipp, pontszam;

    public Jatek(String jatekosNev, int fordulok) {
        this.jatekosNev = jatekosNev;
        this.fordulok = fordulok;
        this.tipp = 0;
        this.kockaszam = 2;
    }

    public String getJatekosNev() {
        return jatekosNev;
    }

    public void setJatekosNev(String jatekosNev) {
        this.jatekosNev = jatekosNev;
    }

    public int getFordulok() {
        return fordulok;
    }

    public void setFordulok(int fordulok) {
        this.fordulok = fordulok;
    }

    public int getTipp() {
        return tipp;
    }

    public void setTipp(int tipp) {
        this.tipp = tipp;
    }

    public boolean isIndithato() {
        return (fordulok > 0);
    }

    public String lejatszas() {

        StringBuffer sb = new StringBuffer("Kockadobas ket kockaval\n");

        sb.append("elozetes tipp: " + tipp + "\n");
        for (int i = 0; i < fordulok; i++) {
            int dobasosszeg = 0;
            sb.append("" + i + ". ");

            for (int j = 0; j < kockaszam; j++) {
                int dobas = egyFordulo();
                dobasosszeg += dobas;
                sb.append(dobas + (j < kockaszam - 1 ? " + " : " "));
            }

            pontszam += dobasosszeg;
            sb.append(" = " + dobasosszeg + "\n");
        }
        sb.append(" tipp=" + tipp + "; osszeg=" + pontszam + " \t A jatekos "
                + (isJolTippelt() ? " nyert!" : " nem nyert!") + "\n");

        return sb.toString();

    }

    private int egyFordulo() {
        return kocka.dobas();
    }

    public void alapallas() {
        pontszam = 0;
        tipp = 0;
    }

    public boolean isJolTippelt() {
        return pontszam == tipp;
    }
}
