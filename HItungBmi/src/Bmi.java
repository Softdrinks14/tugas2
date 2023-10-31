import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @// TODO: 10/31/2023  
 */

public class Bmi {
    /**
     * 
     * @param args
     */
    public static void main(String[] args){
        inputBmi();
    }

    /**
     * 
     * @throws InputMismatchException
     */
    public static void inputBmi() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Tinggi Badan M : ");
            double TinggiBadan = input.nextDouble();
            System.out.print("Berat Badan KG : ");
            int BeratBadan = input.nextInt();

            double convTinggi = TinggiBadan / 100;
            double hasil = BeratBadan / (convTinggi * convTinggi);
            if (hasil < 17.0) {
                System.out.println("Kurus, Kekurangan berat badan berat " + hasil);
            } else if (hasil >= 17.1 && hasil <= 18.4) {
                System.out.println("Kurus, Kekurangan berat badan ringan " + hasil);
            } else if (hasil >= 18.5 && hasil <= 25) {
                System.out.println("Normal " + hasil);
            } else if (hasil >= 25.1 && hasil <= 27.0) {
                System.out.println("Gemuk, Kelebihan berat badan tingkat ringan " + hasil);
            } else {
                System.out.println("Gemuk, Kelebihan berat badan tingkat berat " + hasil);
            }
        } catch (InputMismatchException e){
            System.out.println("Harus input angka ");
            inputBmi();
        }
    }
}
