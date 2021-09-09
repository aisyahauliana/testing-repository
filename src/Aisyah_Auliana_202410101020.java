import java.util.Scanner;

public class Aisyah_Auliana_202410101020 {

    public static void main(String[] args) {
        System.out.println("PROGRAM JAVA MENGHITUNG BODY MASS INDEX (BMI)");
        System.out.println("............................................");

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berat badan anda(kg) : ");
        float weight = sc.nextFloat();
        System.out.print("Masukkan tinggi badan anda(m) : ");
        float height = sc.nextFloat();
        float BMI =(weight/(height*height));
        System.out.println("BMI anda : " + BMI);

        if (BMI < 18.5) {
            System.out.println("Weight status : Underweight");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Weight status : Normal weight");
        }
        else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("Weight status : Overweight");
        }
        else if (BMI >= 30.0 && BMI <= 34.9){
            System.out.println("Weight status : Obesity class I");
        }
        else if (BMI >= 35.0 && BMI <= 39.9) {
            System.out.println("Weight status : Obesity class II");
        }
        else if (BMI >= 40.0) {
            System.out.println("Weight status : Obesity class III");
        }
    }
}


