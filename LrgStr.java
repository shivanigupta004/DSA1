public class LrgStr {
    public static void main(String[] args) {

        // lexicographic order
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        int r = 0;
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
                r = i;
            }
        }
        System.out.println("largest is : " + largest + "\nAnd its index is : " + r);
    }
}
