import java.util.ArrayList;

public class Department {
private String name; // the name of school “Dept of Computing and Info Science”
private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
ArrayList<Course> courseList; // all courses offered by the department
ArrayList<Student> registerList; // all students taking courses in the department.
public Department(String name, String id)
{
	this.name = name;
	this.id = id;
	this.courseList = new ArrayList<Course>();
	this.registerList = new ArrayList<Student>();
}
/**
 * getName
 * @return dept name
 */
public String getName()
{
	return this.name;
}
/**
 * getId
 * @return dept id
 */
public String getId() 
{
	return this.id;
}

/**
 * addSudents
 * @param student
 */
public void addStudents(Student s)
{
	// check if student exist or not already
	boolean exist = false;
	for(int i=0;i<registerList.size();i++)
	{
		if(registerList.get(i).equals(s))// if exit
			exist = true;// true
	}
	if(exist == false)// if not exist then add student to dept
		this.registerList.add(s);
	
}

public String toString() {
// returns a string representation of department name, number
// of courses offered and number of students registered in the
// department. Use the format:
// ECSE: 53 courses, 460 students
	return this.getId()+" "+courseList.size()+" courses, "+registerList.size()+" students";
	
}
/**
 * offerCourse
 * @param course
 */
public void offerCourse(Course c) 
{
	this.courseList.add(c);
}
/**
 * 
 * @param code
 */
public void printStudentsRegisteredInCourse(int code) 
{
	
	for(int i=0;i<registerList.size();i++)// loop over register students
	{
		for(int j=0;j<registerList.get(i).getCourses().size();j++)// get student courses
		{
			if(registerList.get(i).getCourses().get(j).getNumber() == code)// check for course
			{
				System.out.println(registerList.get(i).getId()+" "+registerList.get(i).getName());// print student details
			}
		}
	}
	
}
/**
 * isStudentRegister
 * @param student 
 * @return true if student register
 */
public boolean isStudentRegistered(Student s) 
{
	for(Student ss: this.registerList)
	{
		if(ss.equals(s))
			return true;
	}
	
	return false;
}
public void printStudentsByName() 
{
	
	System.out.println(registerList.toString());
}

public String largestCourse() 
{
	int largest = courseList.get(0).getClassList().size();
	int index = 0;
	for(int i=0;i<courseList.size();i++)
	{
		if(largest < courseList.get(i).getClassList().size())
        {
            largest = courseList.get(i).getClassList().size();
            index = i;
        }
	}
	return courseList.get(index).getClassList().get(0).toString();
}
public void printCoursesOffered() 
{

	for(Course c: this.courseList)
	{
		System.out.println(c.toString());
	}
}
}