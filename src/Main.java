import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        Boolean kontynuuj = true;
        int LiczbaKostek = 0;

        do{
            System.out.println("Ile kostek chcesz rzucić? (3 - 10)");
            System.out.print(">>> ");
            LiczbaKostek = scanner.nextInt();
        }while(LiczbaKostek < 3 || LiczbaKostek > 10);

        while(kontynuuj) {
            Rzut rzut = new Rzut(LiczbaKostek);
            rzut.WypiszWyniki();

            while(true){
                System.out.println("Jeszcze raz? (t/n)");
                String decision = scanner.next();

                if(Objects.equals(decision, "n")){
                    kontynuuj = false;
                    break;
                }else if(Objects.equals(decision, "t")) {
                    break;
                }

            }
        }

    }
}