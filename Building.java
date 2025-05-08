public class Building {
    //Attributes
    protected String name;
    protected String address;
    boolean haselevator;
    public int activeFloor;
/**
 * @constructor 
 * @param name stores the name of the building
 * @param address stores the address of the building
 * @param haselevator stores whether the building has an elevator or not.
 */

    public Building( String name, String address, boolean haselevator){
        this.name= name;
        this.address= address;
        this.haselevator= false;
    }
/**
 * 
 * @return the address of the building
 */
    public String getAddress(){
        return this.address;
    }
/**
 * 
 * @return the name of the building
 */
    public String getName(){
        return this.name;
    }
}
