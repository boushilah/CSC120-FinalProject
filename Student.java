
public class Student {
    // Attributes 
    private String name; 
    private int classYear; 
    //private ArrayList<Course> classes; 
    /**
     * 
     * @param name takes the name of the student
     * @param classYear is the student's year of graduation 
     */

    public Student(String name, int classYear) {
        this.name = name;
        this.classYear = classYear;
    }
    /**
     * 
     * @return the name of the student
     */
    public String getName() {
        return this.name; 
    }
    public void observe(){
        //
        //System.out.println("In this room there's:"+ Student.getName());
        // method to observe everyone in the room.
    }
    public void converse(){
        //Talk to students and get a letter from them
    }
    /**
     * returns the details of the student( name,classyear)
     */
    @Override
    public String toString() {
        return this.name + " of  Class Year: " + this.classYear;
    }

    public static void main(String[] args) {
        Student ab = new Student("Ab", 2014);
        System.out.println(ab);
    }
    
}
