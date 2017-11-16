import java.util.ArrayList;

public class Student {
  private String id;
  private String name;
  private ArrayList<Course> courses; // contains all courses the student is registered in

  /**
   * getName
   * @return student name
   */
  public String getName() {
	  return this.name;
  }

  /**
   * getId
   * @return student id
   */
  public String getId()
  {
	  return this.id;
  }
  /**
   * getCourses
   * @return student courses list
   */
  public ArrayList<Course> getCourses()
  {
	  return this.courses;
  }
  // constructor
  public Student(String id, String name) { 
     // initialize name and id. Also initialize the arraylist
	  this.id = id;
	  this.name = name;
	  this.courses = new ArrayList<Course>();
  }

  /**
   * toString
   */
  public String toString() {
     // return a string representation of a student using the following format:
     // 100234546 John McDonald
     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
	  String result = this.getId()+" "+this.getName();
	 // for(Course c: courses)
	  //{
		//  result += c.getCode()+" "+c.getNumber() +",";
	 // }
	  return result;
	  
  }

  /**
   * registerFor
   * @param course
   */
public void registerFor(Course c) 
{
	// check if student not register for course already
	boolean exist = false;
	for(int i=0;i<courses.size();i++)
	{
		if(courses.get(i).equals(c))
			exist = true;// if exist
	}
	
	
	if(exist == false)// if student not register 
	{
	this.courses.add(c);// register course
	c.getDept().addStudents(this);// add student to department
	c.addClass(c);// add course to class list
	}
}

/**
 * isRegisteredInCourse
 * @param course
 * @return true if course registered else false
 */
public boolean isRegisteredInCourse(Course c) 
{
	for(Course cc: courses)// loop over course
	{
		if(c.equals(cc))// check course matched
			return true;// return true
	}
	return false;
}
}
