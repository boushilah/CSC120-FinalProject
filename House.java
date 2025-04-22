/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  //Attributes 
  private ArrayList<Student> residents;
  private boolean hasDiningRoom;
  private int initialCapacity, maxcapacity;
/**
 * Constructor
 * @param name
 * @param address
 * @param nFloors
 * @param hasDiningRoom
 * @param initialCapacity
 */

public House(String name, String address){
  super(name,address);
  residents = new ArrayList<>(initialCapacity);
  System.out.println("You have built a house: 🏠");  
}
public void knock(){
  //Knock to see if a student is in a room. 
}
public void showOptions() {
  System.out.println("Available options at " + this.name + ":\n [1] goTo() \n [2] ScanRoom()\n [3] knock(n) \n");
}
/**
 * Adding new residents to the house.
 * checks whether the student is the house and if not add them to the residents arraylist.
 * @param s take the name of the student.
 * checks whether the student is the house and if not add them to the residents arraylist.
 */
public void moveIn(Student s){
  if (!residents.contains(s)) {
      residents.add(s);
  }
else if (residents.size()>=maxcapacity){
   System.out.println("The house is full. Find another lodging");   
  }
  else{
    System.out.println("The student is already in the house!");
  }
  }
public void goTO() {
  //Go to house
}
public String toString() {
    return this.name + " is a House located at " + this.address;
}

 public static void main(String[] args) {
  House CampusHouse = new House("Cutter","10 Prospect Street");
  System.out.println(CampusHouse);
  Student  student1 = new Student("Fatima",2025);
  Student student2= new Student("Yvon",2028);
  Student student3= new Student("Mzee",2030);
  CampusHouse.moveIn(student1);
  CampusHouse.moveIn(student2);
  CampusHouse.moveIn(student3);
  CampusHouse.showOptions();
  
  }

} 