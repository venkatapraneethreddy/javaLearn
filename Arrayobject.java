package learnprogramming;


class Student{
	String name;
	int marks;
	
}

public class Arrayobject {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="mahesh";
		s1.marks=90;
		
		Student s2=new Student();
		s2.name="ramesh";
		s2.marks=80;
		
		Student s3=new Student();
		s3.name="suresh";
		s3.marks=70;
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for (int i=0;i<students.length;i++) {
			System.out.println(students[i].name+":"+students[i].marks);
		}
		System.out.println();
		
		for(Student stud:students) {
			System.out.println(stud.name+":"+stud.marks);
		}
		

	}

}
