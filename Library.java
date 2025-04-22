import java.util.Hashtable;
public class Library extends Building{
/**
 * Hastable for book collection.
 */
private Hashtable<String, Boolean> collection;

/**
 * Constructor
 * @param name takes the name of the library
 * @param address shows the address at which the libray is located
 */
public Library(String name, String address) {
  super(name, address);
  collection = new Hashtable<String, Boolean>();
  System.out.println("You have built a library: 📖");
}
/**
 * Checks to see if the collection contains the title of the book.
 * @param title is the name of the book to be checked. 
 * returns true if the title appears as a key in the Libary's collection, false otherwise
 */
public boolean containsTitle(String title){
  if(collection.containsKey(title)){
    return true;
  }
  else{
    return false;
  }
}
/**
 *  prints out the entire collection in an easy-to-read way (including checkout status)
 */
public void printCollection(){
  System.out.println("");
  System.out.println("Please check out our collection below:");
  System.out.println("______________________________________");
  System.out.println("");
  for (String title : collection.keySet()) {
    boolean available = collection.get(title);
    String status = available ? "Available" : "Checked Out";
    System.out.println("[] " + title + " [" + status + "]");
  }
}

@Override
public String toString(){
  return super.toString()+" and our collection currently has "+collection.size()+" books.";
}
public void showOptions(){
  System.out.println("The available options at "+name+" are: \n 1. goTo()" + "\n 2. converse()");
}
public void goTo() {
//Go to the library
}

public static void main(String[] args) {
 Library Neilson = new Library("Neilson", "7 Neilson Drive", 4);
 System.out.println(Neilson);
  Neilson.showOptions();
  Neilson.addTitle("Language studies by Andy Kabagena");
  Neilson.isAvailable("Ururimi by Bwiza");
  Neilson.addTitle("Ururimi by Bwiza ");
  Neilson.addTitle("Mystery Mouseketool by Mickey Mouse");
  Neilson.addTitle("The unseen by K Konate");
  Neilson.printCollection();
  Neilson.goToFloor(3);
}
}