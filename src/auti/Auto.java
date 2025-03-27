package auti;

public class Auto {

    // svojstva auta
    String boja;
    int snaga;
    int brojVrata;
    int brojKotaca;
    boolean upaljen;

    // konstruktor
    Auto (String boja, int snaga, int brojVrata, int brojKotaca) {
        this.boja = boja;
        this.snaga = snaga;
        this.brojVrata = brojVrata;
        this.brojKotaca = brojKotaca;
        this.upaljen = false;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getSnaga() {
        return snaga;
    }

    public void setSnaga(int snaga) {
        this.snaga = snaga;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public int getBrojKotaca() {
        return brojKotaca;
    }

    public void setBrojKotaca(int brojKotaca) {
        this.brojKotaca = brojKotaca;
    }

    public boolean isUpaljen() {
        return upaljen;
    }

    public void setUpaljen(boolean upaljen) {
        this.upaljen = upaljen;
    }

    // koje radnje moze raditi auto
    void upaliti() {
        System.out.println("auti.Auto je upaljen.");
        this.upaljen = true;
    }

    int voziti(int vrijemeUSatima) {
        if (!upaljen) {
            upaliti();
        }
        return 10 * vrijemeUSatima;
    }

    void ugasiti() {
        System.out.println("auti.Auto je ugasen.");
        this.upaljen = false;
    }
}
