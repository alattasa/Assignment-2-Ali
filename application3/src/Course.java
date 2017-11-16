import java.util.ArrayList;

public class Course {
   private Department dept;
   private String title; // title of the course (e.g. “Intro to programming”);
   private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
   private int number; // course number, e.g. 1200, 2710, 2800, etc.
   ArrayList<Course> classList; // contains all students registered in this course

   /**
    * addClass
    * @param course
    */
   public void addClass(Course c)
   {
	   this.classList.add(c);// add course to class list
   }
   /**
    * getClassList
    * @return class list
    */
   public ArrayList<Course> getClassList()
   {
	   return this.classList;
   }
   /**
    * getDept
    * @return department
    */
   public Department getDept() 
   {
	   return this.dept;
   }
  
   /** 
    * getCode
    * @return course code
    */
   public String getCode() 
   {
	   return this.code;
   }

   //constructor
   public Course(String code, int number, Department dept, String title) {
      // also initialize the classList;
	   this.code = code;
	   this.number = number;
	   this.dept = dept;
	   this.title = title;
	   this.classList = new ArrayList<Course>();
   }

  public String toString() {
     // return a string representation of the course with the course code,
     // name, and number of people registered in the course in the following
     // format:
     // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
	  
	  return this.getCode()+" "+this.number+ " "+this.title+", Enrollment = "+this.classList.size();
  }

  /**
   * getNumber
   * @return course number
   */
public int getNumber()
{
	return this.number;
}
}
