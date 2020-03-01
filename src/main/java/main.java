import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String carName = scan.next();
        IAuto car = AutoFactory.getCar(carName);
        if (car == null)
            System.out.println("Unsupported car type");
        else {
            car.turnOn();
            car.turnOff();
        }

    }
}
