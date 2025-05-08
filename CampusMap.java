import java.util.ArrayList;

public class CampusMap {
    public String address;
    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }
    public String getAddress(){
        return this.address;
    }
    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        buildings.add(b);
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        System.out.println("To go into a building, remember to type 'go' to make a choice\n");
        return mapString;
    }
    /**
     * It displays the name of the building.
     * @param name name of a building
     * @return the name of the building passed.
     */
    public Building getBuildingByName(String name) {
        for (Building b : buildings) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
}
