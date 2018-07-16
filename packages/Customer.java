//set packages when using in other java file, just use in 
package packages;
public class Customer {
 
    private int id;
    private String name;
 
    public Customer(int i, String n){
        this.id=i;
        this.name=n;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
}
