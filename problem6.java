
import java.util.Scanner;

public class problem6 {
    public static String stringWithMostVowels(String[] array, int arraySize){
        // Max vowel is initialized to store the number of vowels in a string
        int maxVowel = 0;
        // maxVowelString is initialized to store the resulting string
        String maxVowelString = "";
        // inside the for loop each element's vowel count is calculated using countVowels method and string with max vowel is 
        // assigned to maxVowelString
        for(String arr: array){
            int vowelCount = countVowels(arr);
            if(vowelCount>maxVowel){
                maxVowel= vowelCount;
                maxVowelString = arr;
            }
        }
        return maxVowelString;
    }
    // Method to calculate number of vowels within a string
    public static int countVowels(String str){
    //  Base case to check if size of string is zero 
        if(str.length()==0) return 1;
        // Each and every character of string is compared to check whether it is a vowel or not 
        // vowelCount variable is incremented based on the condition if the character is a vowel
        int vowelCount = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        // vowelCount is returned for the string
        return vowelCount;
    }
    public static void main(String[] args) {
        // Object of scanner class is created to take input from the user
        Scanner sc = new Scanner(System.in);
        // Size of array and elements of array are taken as input from the user
        System.out.println("Enter the size of array: ");
        int arraySize = sc.nextInt();
        String[] array = new String[arraySize];
        for(int i=0;i<arraySize;i++){
            System.out.print("Enter the value of array at index "+ i +": ");
            array[i] = sc.next();
        }
        // resultString variable is initialized to store the string with highest count of vowel in the string array
        String resultString = stringWithMostVowels(array, arraySize);
        System.out.println(resultString);
        // Object of scanner class is closed after the execution is completed
        sc.close();
    }
}
