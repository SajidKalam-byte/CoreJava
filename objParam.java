import java.io.*;
class Student
{
	String name;
	int age;
	Student()
	{}
	Student(String n, int a)
	{
		this.name = n;
		this.age = a;
	}
	void display()
	{
		System.out.println("Name: "+name+" Age: "+age);
	}
}

class objParam
{
	static void modify(Student s1)
	{
		s1.name = "Updated "+ s1.name;
		s1.age += 1;
	}
	public static void main(String arg[])
	{
		Student stud1 = new Student("Rohit", 37);
		stud1.display();

		modify(stud1);
		System.out.println("After modification ");
		stud1.display();
	}
}