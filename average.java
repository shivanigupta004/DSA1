public class average {
    public static float computeAverage(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        float average = computeAverage(10, 20, 30);
        System.out.println("The average is: " + average);
    }
}