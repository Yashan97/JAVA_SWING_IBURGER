package iburger;
public class Iburger {

   private String id;
       private String number;
       private String name;
       private int qty;
       private double price;
       private int stutus;
       
       public Iburger(){
       
       
       }

    public Iburger(String id, String number, String name, int qty, double price, int stutus) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.stutus = stutus;
    }
       

    
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

   
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    public int getQty() {
        return qty;
    }

    
    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

    
    public int getStutus() {
        return stutus;
    }
    public void setStutus(int stutus) {
        this.stutus = stutus;
    }
       
   
       
    
}
