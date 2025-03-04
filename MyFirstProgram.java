import java.util.Scanner;
import java.util.Random;

public class MyFirstProgram {
    public static void main(String[] args) {

        //Deklarasi semua import ; scanner dan random
        Scanner input = new Scanner(System.in); //set variable? command? untuk input user nanti
        Random  random = new Random(); // set command untuk random warna dan fun fact nanti
        
        System.out.println("\033[97m" + "\n╔══════════════════════╗" + "\033[0m" );
        System.out.println("\033[973m" + "║" + "\033[0m" +  "\033[1;95m" + " WELCOME TO FUNFACTS! " + "\033[0m" + "\033[97m" + "║" + "\033[0m");
        System.out.println("\033[97m" + "╚══════════════════════╝" + "\033[0m");

        //Scanner input = new Scanner(System.in);
        
        System.out.print("\033[1;95m" + "\033[107m"+ "\nPlease input your name : " + "\033[0m"); 
        System.out.print("\033[1;95m" + "\033[107m");
        String nama = input.nextLine(); 
        System.out.print("\033[0m");
    
        System.out.println(nama + " did you know Java has some secrets waiting to be uncovered? Stick around, and you will discover fascinating facts you never expected!");

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

        //set kombinasi wrna text dan background
        String[][] colorCombinations = {
            {"\033[1;30m", "\033[102m"}, //hitam, hijau muda
            {"\033[1;33m", "\033[104m"}, // kuning, biru
            {"\033[1;35m", "\033[107m"} //ungu, putih
        };

        int sisaFunfact = funfact.length; //Jumlah funfact yang belum ditampilkan
        int colorIndex = 0; //mulai dari index pertama

        while (sisaFunfact > 0){
            System.out.print("\nDo you want to read Funfact? (y/n) : ");
            String dyk = input.nextLine().toLowerCase(); //dyk = did you know, variabel untuk inputan user mau lnjut atau tidak

            if (dyk.equals("y")){
                int index; //deklarasi index

                do {
                    index = random.nextInt(funfact.length);
                } while (funfact[index] == null); //klo funfact yang kluar null, maka random ulang lagi
                
                String textColor = colorCombinations[colorIndex][0];
                String bgColor = colorCombinations[colorIndex][1];

                System.out.println("\033[1m" + bgColor + textColor + "Did you know? " + funfact[index] + "\033[0m");
                
                funfact[index] = null; //funfact yg sudah keluar, berubah menjadi null
                sisaFunfact--;
                colorIndex = ++colorIndex % colorCombinations.length; //pindah ke color combinasi selanjutnya, hingga n colorCombination
            }

            else if (dyk.equals("n")) {
                System.out.println("\nThankyou for reading fun facts about Java!");
                System.out.println("Have a nice day!");
                break;
            }

            else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }

        if (sisaFunfact == 0) {
            System.out.println("\nAll fun facts have been read. Thank you!\n");
        }

        String javaversion = System.getProperty("java.version");

        System.out.print("Java Version : " + javaversion + "\n" );

        input.close();
    }
}
