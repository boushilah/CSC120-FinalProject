public class House extends Building {
  //Attributes 
  private boolean hasDiningRoom;
/**
 * Constructor
 * @param name
 * @param address
 * @param nFloors
 * @param hasDiningRoom
 */

public House(String name, String address){
  super(name,address, true);
}
public House(String name, String address, int nFloors, boolean hasDiningRoom){
  super(name, address, hasDiningRoom);
}
} 