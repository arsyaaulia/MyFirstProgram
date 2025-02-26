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
            "Java is an object-oriented and general-purpose programming language that is widely used around the world. ",

            "Java's platform neutrality is one of its key advantages. Its 'Write Once, Run Anywhere' (WORA) capability allows Java code to be compiled into bytecode that can run on any Java Virtual Machine (JVM) and host operating system. ",

            "Many Android apps are created using Googles's Java platform. ",

            "Minecraft was initially built in Java by its creator, Notch, because he was familiar with the language. Later, after Microsoft acquired Minecraft, a C++ version was launched. ",

            "Java significantly influences the Internet of Things (IoT) because its portability and scalability make it suitable for creating embedded systems and integrating IoT devices. ",

            "James Gosling, the original designer of Java, initially named it Oak after an oak tree visible from his office window. The name was changed to Java in 1994 due to a trademark issue with Oak Technology. ",

            "The Java mascot is named Duke, and it was created by Joe Palrang, who also worked on the movie 'Shrek. ",

            "The JUnit Testing Framework is a popular Java technology, with approximately 70% of Java developers using it. ",

            "The term 'final' in Java has four distinct meanings: final class (cannot be extended), final method (cannot be overridden), final field (a constant), and final variable (its value cannot be changed once assigned). ",

            "Java gets downloaded one billion times a year. ",

            "Java was created somewhat by accident when James Gosling and his team were cleaning up C++, they ended up with a new language. ",

            "In 2010, Oracle launched lawsuits regarding the use of Java in Android operating systems, seeking $8.8 billio. The cas was settled in 2016 in favor of Google. ",

            "There are approximately 9 million Java developers worldwide. ",

            "Java is the second most popular programming language. ",

            "Java is platform independent, meaning the code is compatible with Mac, Linux, and Windows platforms. ",

            "An average salary of a Java programmer is about $84,000 per year. ",

            "Java lost its leading position as the most poppular programming language in 2021, according to Tiobe. ",

            "Java is most known for its contribution to web development. ",

            "Java doesn't have any abbreviations; it's named after a rich, aromatic coffe seed. ",

            "Java is case-sensitive, meaning the value of indetifiers like classes, methods, and variables changes depending on whether they are upper or lower case. ",
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
            System.out.print("\nDo you want to read Funfact? (y/n) : ");
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
