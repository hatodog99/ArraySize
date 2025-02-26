package arraysize;

import java.util.*;

public class ArraySize {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Input array size: ");
        int[] numbers = new int[arraySize(scanner)];
        
        System.out.println("");
        System.out.println("Enter " + numbers.length + " elements:");
        inputElements(numbers, scanner);
        
        System.out.println("");
        System.out.println("The sum is: " + sum(numbers));
    }    
    
    public static int arraySize(Scanner scanner) {
        int size = 0;
        while (true) { // error handling
            try {
                size = Integer.parseInt(scanner.nextLine());
                
                if (size > 0) { // checks if size is positive or not
                    break;
                }
                System.out.println("Size must be positive integer. Try again.");
            
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Must be integer.");
            }
        }
        
        return size;
    }
    
    public static void inputElements(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            while (true) { // error handling
                try {
                    arr[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter an integer");
                }
            }
        }
    }
    
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        
        return sum;
    }
}