package Sample;

import java.util.*;


public class Student {
	private int rollNo;
	private String name;
	private int age;
	
	//getters and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//METHODS
	public boolean addClassRoom(ClassRoom r)
	{
		return false;
		
	}
	public ArrayList<Student> getAllStudentsByAge(int age)
	{
		/*
		ArrayList<Student> student=new ArrayList<Student>();
		Student data,temp;
		data=new Student(1442274,"Ishan",22);
		student.add(data);
		Collections.sort(student,);???????????????
		ListIterator ltr=student.listIterator();
		while(ltr.hasNext())
		{
			temp=(Student) ltr.next();
			if(temp.age==age)
			{
			System.out.println(temp.name);
			}
			
		}
		*/
		return null;
		
	}
	public ArrayList<HighSchoolStudent> getAllHighSchoolStudents(String electiveName)
	{
		return null;
	}
	public HashMap<int,Student> getStudentsWithHighestAge()
	{ 
		
	}
	
	
	

}
