package iburger;
public class IburgerCollection {
    private Iburger[] iburgerArray = new Iburger[0]; // create Object Array 
    
    //Add order here
    public boolean  addOrder( Iburger iburger){
        
        extendArray();
        iburgerArray[iburgerArray.length-1]=iburger;
        return true;
    
    }
    // extend Array---------------
    public void extendArray(){
        
        Iburger []tempBuger = new Iburger[iburgerArray.length+1];
        for (int i = 0; i <iburgerArray.length; i++) {
            tempBuger[i] =iburgerArray[i];
        }
        iburgerArray = tempBuger;
    
    }
    // automatically generate ID 
    public String generateId(){
        
        if (iburgerArray.length == 0) {
            return "B0001";
        }else{
        
           String lastOrderId = iburgerArray[iburgerArray.length-1].getId(); // Take last ID number of Array
           int lastNumber = Integer.parseInt(lastOrderId.substring(1)); // Take last Number Of orderID
           return String.format("B%04d",lastNumber+1);
        }
    
    }
    // Searching ID here
    public Iburger searchOrderId(String id){
        
        for (Iburger iburger : iburgerArray) {
            if (iburger.getId().equalsIgnoreCase(id)) {
                return iburger;
            }
        }
        return null;
    }
    
    //
    
} 
