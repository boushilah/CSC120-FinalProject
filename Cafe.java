public class Cafe extends Building {
//Attributes
private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
private int nSugarPackets; // The number of sugar packets remaining in inventory
private int nCreams; // The number of "splashes" of cream remaining in inventory
private int nCups; // The number of cups remaining in inventory

/**
 * 
 * @param name takes the name of the cafe
 * @param address takes the address of the cafe
 * @param nCoffeeounces takes the ounces of coffe there is in the cafe
 * @param sugarPackets takes the number of sugar packets we have
 * @param ncreams takes the number of cream we have
 * @param cups takes the number of cups available.
 */
public Cafe(String name, String address, int nCoffeeounces, int sugarPackets, int ncreams,int cups) {
 super(name,address);
 this.nCoffeeOunces= nCoffeeounces;
 this.nSugarPackets= sugarPackets;
 this.nCreams = ncreams;
 this.nCups= cups;
System.out.println("You have built a cafe: ☕");
 }

public void ShowOptions(){
    System.out.println("Options:");
    System.out.println(" [1] Enter()\n [2] exit()\n [3] sellCoffee()\n [4] restock()\n");
}
public void goTo(){
// Go to the café
}
 /**
  * Sells coffee
  * @param size the size of the coffee
  * @param nSugarPackets the number of sugar packs put into the coffee
  * @param nCreams the amount of cream that goes into the cafe. 
  */
 public void orderCoffee(int size, int nSugarPackets, int nCreams){
// Order coffee to get the secret letter 
}
public String toString() {
    return this.name + " is a cafe located at " + this.address;
}
    public static void main(String[] args) {
    Cafe Columbiano = new Cafe("Nkurunziza","32 Nyarutarama",30,50,100,100);
    System.out.println(Columbiano);
    Columbiano.orderCoffee(3, 2, 4);
    Columbiano.goTo();
    }
}
