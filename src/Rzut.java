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
        System.out.println("Liczba uzyskanych punktów: " + obliczPunkty());
    }
    public int obliczPunkty() {
        int Punkty = 0;
        for(int i=1;i<=6;i++) {
            int LiczbaWystapien = 0;
            for (Kostka kostka : wyniki) {
                if(kostka.getWynik() == i){
                    LiczbaWystapien++;
                    Punkty+=i;
                }
            }
            if(LiczbaWystapien==1){
                Punkty-=i;
            }
        }
        return Punkty;
    }
}
