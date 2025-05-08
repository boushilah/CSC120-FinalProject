public class Course {

    // Attributes
    private String majorName;
    private String category;

    public Course(String majorName, String category) {
        this.majorName = majorName;
        this.category = category;
    }

    public String getName() {
        return this.majorName;
    }

    public String getCategory() {
        return this.category;
    }

    public String toString() {
        return this.category + ": " + this.majorName; 
    }
/*
    public static void main(String[] args) {
        Course CSC = new Course("CS" , "STEM");
        System.out.println(CSC);
    }
*/   
}
