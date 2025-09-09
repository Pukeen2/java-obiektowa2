import java.util.ArrayList;

public class Rzut {
    private ArrayList<Kostka> wyniki = new ArrayList<Kostka>();
    Rzut(int liczbaKostek){
        for(int i=0;i<liczbaKostek;i++) {
            this.wyniki.add(new Kostka());
        }
    }
    public void WypiszWyniki(){
        int i = 1;
        for(Kostka kostka : wyniki){
            System.out.println("Kostka " + i + ": " + kostka.getWynik());
            i++;
        }
        System.out.println("Liczba uzyskanych punktów: " + obliczSume());
    }
    public int obliczSume() {
        int Suma = 0;
        for (Kostka kostka : wyniki) {
            Suma += kostka.getWynik();
        }
        return Suma;
    }
}
