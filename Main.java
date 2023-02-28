import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> students = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    while (fileScanner.hasNextLine()) {
      students.add(fileScanner.nextLine());
    }
    
    Scanner textScanner = new Scanner(System.in);
    int option = -1;
    String optionOneResult = "$98,345 average salary in South Florida!";
    String optionTwoResult = "US News - 100 Best Jobs!";
    String optionThreeResult = "Top 10 Forbes In-Demand Jobs!";
    
    while (option != 5) {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      option = textScanner.nextInt();
      switch (option) {
        case 1: {
          System.out.println(optionOneResult);
          break;
        }
        case 2: {
          System.out.println(optionTwoResult);
          break;
        }
        case 3: {
          System.out.println(optionThreeResult);
          break;
        }
        case 4: {
          System.out.println("Current Students:");
          for (String student : students) {
            System.out.println(student);
          }
          break;
        }
      }
    }
	}
}