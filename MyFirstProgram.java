import java.util.Scanner;
import java.util.Random;
public class MyFirstProgram {
    public static void main(String[] args) {

        //Deklarasi semua import ; scanner dan random
        Scanner input = new Scanner(System.in);
        Random  random = new Random();
        
        System.out.println("Welcome!");

        //Scanner input = new Scanner(System.in);
        
        System.out.print("Input your name : ");
        String nama = input.nextLine(); 
    
        System.out.println("Hello " + nama + "!");

        //Array funfact
        String[] funfact = {
            "Funfact 1",
            "Funfact 2",
            "Funfact 3",
            "Funfact 4",
            "Funfact 5",
            "Funfact 6",
            "Funfact 7",
            "Funfact 8",
            "Funfact 9",
            "Funfact 10",
            "Funfact 11",
            "Funfact 12",
            "Funfact 13",
            "Funfact 14",
            "Funfact 15",
            "Funfact 16",
            "Funfact 17",
            "Funfact 18",
            "Funfact 19",
            "Funfact 20",
        };

        //set wrna text dan background
        String[] textColors = {
            "\033[1;31m", //merah, 3x = atur text wrna normal
            "\033[1;32m",
            "\033[1;33m",
            "\033[1;34m",
            "\033[1;35m"
        };

        String[] bgColors = {
            "\033[101m", //merah terang, 10x = atur bg wrna terang
            "\033[102m", //hijau terang
            "\033[103m",
            "\033[104m",
            "\033[105m"
        };

        int count = funfact.length; //Jumlah funfact yang belum ditampilkan

        while (count > 0){
            System.out.print("\nMau baca Funfact? (y/n) : ");
            String dyk = input.nextLine().toLowerCase();

            if (dyk.equals("y")){
                int index; //deklarasi

                do {
                    index = random.nextInt(funfact.length);
                } while (funfact[index] == null);
                
                int colorIndex = random.nextInt(textColors.length);
                int bgIndex = random.nextInt(bgColors.length);

                System.out.println(bgColors[bgIndex] + textColors[colorIndex] + "Fun Fact: " + funfact[index] + "\033[0m");
                
                funfact[index] = null;
                count--;
            }

            else if (dyk.equals("n")) {
                System.out.println("\nTerimakasih sudah membaca funfact seputar Java!");
                System.out.println("Have a nice day!");
                break;
            }

            else {
                System.out.println("Input tidak valid, program diberhentikan.");
                System.out.println("Hava a nice day!");
            }
        }

        if (count == 0) {
            System.out.println("\nSemua funfact sudah dibaca. Terima kasih!\n");
        }

        input.close();
    }
}
