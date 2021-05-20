package Task4;

import java.util.Scanner;

public class MainRuner {


    public static void main(String[] args) {
        Auto[] autos = new Auto[3];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < autos.length; i++) {
            System.out.printf("%s", "введите тип машины");
            int typeCar = scanner.nextInt();
            String name = scanner.nextLine();
            int weight = scanner.nextInt();
            boolean go = scanner.hasNextBoolean();
           if (typeCar == 0) {
               autos[i] = new Mers(name, weight, go);
           }else if(typeCar == 1 ) {
               autos[i] = new Bmw(name, weight, go);
           }else {
               autos[i] = new Lada(name, weight, go);
           }

        }
        System.out.printf("Введите марку авто");
        String mark =  scanner.next();
        for (int i = 0; i < autos.length; i++) {
            if (mark.equals(autos[i].name)) {
                System.out.println(autos[i].name);
            }
        }
    }
}
