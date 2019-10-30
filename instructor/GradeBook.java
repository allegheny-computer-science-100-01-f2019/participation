package classseven;

/** Define class GradeBook with a member method displayMessage.
*/
public class GradeBook {

  // instance variable
  private String courseName;
  private String courseTag;

  /** constructor.
  */
  public GradeBook(String name) {
    courseName = name;
  }

  /** constructor 2.
  */
  public GradeBook(String name, String tag) {
    courseName = name;
    courseTag = tag;
  }

  /** method to display a welcome message.
  */
  public void displayMessage(String name) {
    System.out.println("Welcome to the Grade Book for " + name);
  }

  /** method to obtain the course name.
  */
  public String getName() {
    return courseName;
  }

  /** method to set a course name.
  */
  public void setName(String newName) {
    courseName = newName;
  }
  
  /** method to obtain the course tag.
  */
  public String getTag() {
    return courseTag;
  }

  /** method to set a course tag.
  */
  public void setTag(String newTag) {
    courseTag = newTag;
  }
}
