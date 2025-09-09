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
            int LiczbaKostek = scanner.nextInt();
            if (LiczbaKostek >= 3 && LiczbaKostek <= 10) {
                Rzut rzut = new Rzut(LiczbaKostek);
                rzut.WypiszWyniki();
                System.out.println("Jeszcze raz? (t/n)");
                String decision = scanner.next();
                if(Objects.equals(decision, "n")){
                    kontynuuj = false;
                }
            }
        }
    }
}