public class OOPs6 {
    public static void main(String[] args) {
        Student.SchoolName = "DPS"; // Set static field using class name

        Student s1 = new Student();
        Student s2 = new Student();
        s2.setName("shibani");

        System.out.println("Name: " + s2.getName());
        System.out.println("School: " + Student.SchoolName); // Access static via class
    }
}

class Student {
    //static function
    static int percent(int math, int phy, int chem) {
        return (math + phy + chem ) / 3;
    }

    String name;
    int roll;

    static String SchoolName; // shared by all students

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }

    void setRoll(int roll) {
        this.roll = roll;
    }
    int getRoll() {
        return this.roll;
    }
}
