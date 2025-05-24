public class evenchecker {
    
    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {4, 7, 10, 15, 22};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " even? " + isEven(num));
        }
    }
}

