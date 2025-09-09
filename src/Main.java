import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        Boolean kontynuuj = true;
        while(kontynuuj) {
            System.out.println("Ile kostek chcesz rzucić? (3 - 10)");
            System.out.print(">>> ");
            ;
            int Suma = 0;
            int LiczbaKostek = scanner.nextInt();
            if (LiczbaKostek >= 3 && LiczbaKostek <= 10) {
                for (int i = 0; i < LiczbaKostek; i++) {
                    int Wynik = random.nextInt(1, 7);
                    Suma += Wynik;
                    System.out.println("Kostka " + (i + 1) + ": " + Wynik);
                }
                System.out.println("Liczba uzyskanych punktów: " + Suma);
                System.out.println("Jeszcze raz? (t/n)");
                String decision = scanner.next();
                if(Objects.equals(decision, "n")){
                    kontynuuj = false;
                }
            }
        }

    }
}