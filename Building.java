public class Building {

    protected String name;
    protected String address;
    public Building( String name, String address){
        this.name= name;
        this.address= address;
    
    }
    /* Accessors */
    public String getName() {
        return this.name;
    }
    public void goTo(){
        // Move the students to the building 
    }
    public void scanRoom(){
        //Scan the room to see who is in the building to possibly give you the right letter.
    }
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + ScanRoom() \n + goTo() \n + getCurrentLocation()");
    }
    public String showCurrentLocation() {
        return this.name + " is located at " + this.address;
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");
        
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063");
        System.out.println(fordHall);
        fordHall.showOptions();
        System.out.println("-----------------------------------");
        System.out.println("Demonstrating functions");
        System.out.println("-----------------------------------");
        fordHall.goTo();
        System.out.println(fordHall);
    }
}
