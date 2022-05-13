package question1_1;
//Wirakarn Ponpraserd
//6409650311

//import java.util.Scanner;

public class FourWordsTest {

	public static void main(String[] args) {
		FourWords words4 = new FourWords();
		words4.add("cash");
		words4.add("apple");
		words4.add("trees");
		words4.add("bee");
		words4.add("something");
		words4.printWords();
//		Scanner scanWord = new Scanner(System.in);
//		System.out.println("No words set up yet!");
//		words4.printWords();
//		for(int i=1; i<=5; i++) {
//			System.out.print("Enter your word: ");
//			String inputWord = scanWord.nextLine();
//			words4.add(inputWord);
//			System.out.printf("Round %d: ",i);
//			words4.printWords();
//		}
	}
}
