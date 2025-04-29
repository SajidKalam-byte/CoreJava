import java.util.Scanner;

class Student {
    private String studentID;
    private String name;
    private int age;
    private String course;
    private int[] marks = new int[5];

    Student() {
		//next time 
    }

    int calculateTotalMarks() {
        int total = 0;
        for (int i = 0; i< 5; i++) {
            total += marks[i];
        }
        return total;
    }

    char calculateGrade() {
        int total = calculateTotalMarks()/5;
		if (total>=90){
			return 'A';
		}
		else if (total>=75){
			return 'B';
		}
		else if(total>= 60){
			return 'C';
		}
		else if (total>=40){
			return 'D';
		}
		else{
			return 'F';
		}

	}
	void input(){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student ID ");
        studentID = sc.nextLine();
        System.out.println("Enter the Student name");
        name = sc.nextLine();
		System.out.println("Enter the course");
        course = sc.nextLine();
        System.out.println("Enter the age ");
        age = sc.nextInt();
        
        System.out.println("Enter the marks of 5 subject");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
	}
    void display() {
	System.out.println("\n\n");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Grade: " + calculateGrade());
	System.out.println("\n\n");
    }
}

public class StudentM {
    public static void main(String args[]) {

        Student obj = new Student();
		obj.input();
        obj.display();
		// Student obj2 = new Student();
		// obj2.input();
		// obj2.display();
		// Student obj3 = new Student();
		// obj3.input();
		// obj3.display();
    }
}