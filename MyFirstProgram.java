import java.util.Scanner;
import java.util.Random;

public class MyFirstProgram {
    public static void main(String[] args) {

        //Deklarasi semua import ; scanner dan random
        Scanner input = new Scanner(System.in);
        Random  random = new Random();
        
        System.out.println("╔═════════════════════════╗");
        System.out.println("║" +  "\033[1;35m" + "  WELLCOME TO FUNFACTS!  " + "\033[0m" + "║" );
        System.out.println("╚═════════════════════════╝");

        //Scanner input = new Scanner(System.in);
        
        System.out.print("\nPlease input your name : "); 
        String nama = input.nextLine(); 
    
        System.out.println("Hello " + nama + "! Get ready read some funfacts about java programming!");

        //Array funfact
        String[] funfact = {
            "Java is an object-oriented and general-purpose programming language that is widely used around the world. ",

            "Java's platform neutrality is one of its key advantages. Its 'Write Once, Run Anywhere' (WORA) capability allows Java code to be compiled into bytecode that can run on any Java Virtual Machine (JVM) and host operating system. ",

            "Many Android apps are created using Google's Java platform. ",

            "Minecraft was initially built in Java by its creator, Notch, because he was familiar with the language. Later, after Microsoft acquired Minecraft, a C++ version was launched. ",

            "Java significantly influences the Internet of Things (IoT) because its portability and scalability make it suitable for creating embedded systems and integrating IoT devices. ",

            "James Gosling, the original designer of Java, initially named it Oak after an oak tree visible from his office window. The name was changed to Java in 1994 due to a trademark issue with Oak Technology. ",

            "The Java mascot is named Duke, and it was created by Joe Palrang, who also worked on the movie 'Shrek. ",

            "The JUnit Testing Framework is a popular Java technology, with approximately 70% of Java developers using it. ",

            "The term 'final' in Java has four distinct meanings: final class (cannot be extended), final method (cannot be overridden), final field (a constant), and final variable (its value cannot be changed once assigned). ",

            "Java gets downloaded one billion times a year. ",

            "Java was created somewhat by accident when James Gosling and his team were cleaning up C++, they ended up with a new language. ",

            "In 2010, Oracle launched lawsuits regarding the use of Java in Android operating systems, seeking $8.8 billion. The case was settled in 2016 in favor of Google. ",

            "There are approximately 9 million Java developers worldwide. ",

            "Java is the second most popular programming language. ",

            "Java is platform independent, meaning the code is compatible with Mac, Linux, and Windows platforms. ",

            "An average salary of a Java programmer is about $84,000 per year. ",

            "Java lost its leading position as the most popular programming language in 2021, according to Tiobe. ",

            "Java is most known for its contribution to web development. ",

            "Java doesn't have any abbreviations; it's named after a rich, aromatic coffee seed. ",

            "Java is case-sensitive, meaning the value of identifiers like classes, methods, and variables changes depending on whether they are upper or lower case. ",
        };

        //set wrna text dan background
        String[] textColors = {
            "\033[1;30m", //hitam, 3x = atur text wrna normal
            "\033[1;31m", //merah
            "\033[1;32m", //hijau
            "\033[1;34m", //biru
            "\033[1;35m" //ungu
        };

        String[] bgColors = {
            "\033[101m", //merah terang, 10x = atur bg wrna terang
            "\033[102m", //hijau terang
            "\033[103m", //Kuning
            "\033[106m", //cyan
            "\033[107m" //putih
        };

        int count = funfact.length; //Jumlah funfact yang belum ditampilkan

        while (count > 0){
            System.out.print("\nDo you want to read Funfact? (y/n) : ");
            String dyk = input.nextLine().toLowerCase();

            if (dyk.equals("y")){
                int index; //deklarasi index

                do {
                    index = random.nextInt(funfact.length);
                } while (funfact[index] == null);
                
                int colorIndex = random.nextInt(textColors.length);
                int bgIndex = random.nextInt(bgColors.length);

                System.out.println(bgColors[bgIndex] + textColors[colorIndex] + "Did you know? " + funfact[index] + "\033[0m");
                
                funfact[index] = null;
                count--;
            }

            else if (dyk.equals("n")) {
                System.out.println("\nThankyou for reading fun facts about Java!");
                System.out.println("Have a nice day!");
                break;
            }

            else {
                System.out.println("Invalid input. The program has been terminated.");
                System.out.println("Have a nice day!");
                break;
            }
        }

        if (count == 0) {
            System.out.println("\nAll fun facts have been read. Thank you!\n");
        }

        input.close();
    }
}
