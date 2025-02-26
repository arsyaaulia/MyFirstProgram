import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class MyFirstProgram {
    public static void main(String[] args) {

        //Deklarasi semua import ; scanner dan random
        Scanner input = new Scanner(System.in);
        Random  random = new Random();
        
        System.out.println("Welcome!");

        //Scanner input = new Scanner(System.in);
        
        System.out.print("Input your name : ");
        String nama = input.nextLine(); 
    
        System.out.println("\nHello " + nama + "!");

        ArrayList<String> funfact = new ArrayList<>();
            funfact.add ("Taukah kamu, nama Java terinspirasi dari kopi Jawa.");
            funfact.add ("Java lahir dari proyek bernama The Green project pada tahun 1991 yang bertujuan untuk menciptakan bahasa permrograman yang lebih baik dari C dan C++.");
            funfact.add ("Bahasa pemrograman ini awalnya bernama Oak, terinspirasi dari pohon Oak.");
            

        while(!funfact.isEmpty()){ //Loop slama ada funfact
            System.out.print("\nMau baca Funfact? (y/n) : ");
            String dyk = input.nextLine().toLowerCase();
            
            if (dyk.equals("y")) {
                int index = random.nextInt(funfact.size()); //ambil index acak
                System.out.println("Fun Fact : " + funfact.get(index)); 
                funfact.remove(index);
            }
            else if (dyk.equals("n")) {
                System.out.println("\nTerimakasih sudah membaca Funfact seputar Java!");
                System.out.println("Have a nice day!");
                break;
            }
            else {
                System.out.println("Input tidak terbaca, program diberhentikan.");
                System.out.println("Have a nice day!");
                break;
            }
        }

        if (funfact.isEmpty()) {
            System.out.println("\nSemua funfact sudah dibaca. Terimakasih!");
            System.out.println("Have a nice day!");
        }
    
        input.close();
    }
}
