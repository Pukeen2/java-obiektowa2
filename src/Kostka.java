import java.util.Random;

public class Kostka {
    private int Wynik;
    Kostka(){
        Random random = new Random();
        Wynik = random.nextInt(1,7);
    }

    public int getWynik() {
        return Wynik;
    }
}
