import java.util.Scanner;

public class DisplayInfo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name;
        int age;
        double marks;

        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextDouble();

        System.out.print("\nName: "+name+"\nAge: "+age+"\nMarks: "+marks);

        sc.close();

    }

}




