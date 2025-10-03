package iburger;
public class IburgerCollection {
    private Iburger[] iburgerArray = new Iburger[0]; // create Object Array 
    private Iburger [] searchNumber =new Iburger[0]; 
    private Iburger [] viewQueqe = new Iburger[0];
    private Iburger [] viewPreparing = new Iburger[0];
    
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
    
    // search Customer id number and create arrays 
    public Iburger[] getSearchCustomerArray(String number){
      
        for (int i = 0; i <iburgerArray.length; i++) {
            if (number.equalsIgnoreCase(iburgerArray[i].getNumber())) {
              searchNumber =  extendSearchNumberArray(iburgerArray[i]);
            }
            
        }
    
        return  searchNumber;
    }
    public Iburger [] extendSearchNumberArray(Iburger number){
        
        Iburger []tempsearch = new Iburger[searchNumber.length+1];
        for (int i = 0; i <searchNumber.length; i++) {
            tempsearch[i] =searchNumber[i];
        }
        searchNumber = tempsearch;
        searchNumber[searchNumber.length-1]= number;
        return searchNumber;
    
    }
    
    // 
    public Iburger [] viewQuqeOrder(){
        int status  = 0;
        for (int i = 0; i <iburgerArray.length; i++) {
            if (status == iburgerArray[i].getStutus()) {
                viewQueqe = viewQuqeOrder(iburgerArray[i]);
            }
        }
        
        return viewQueqe;
    }
    
    public Iburger[] viewQuqeOrder(Iburger status){
        
        Iburger [] tempQuqe = new  Iburger[viewQueqe.length+1];
        for (int i = 0; i < viewQueqe.length; i++) {
            tempQuqe[i]= viewQueqe[i];
        }
        viewQueqe = tempQuqe;
        viewQueqe[viewQueqe.length-1]= status;
        return viewQueqe;
    
    }
    
    public Iburger [] viewPreparing (){
        int status = 1;
        for (int i = 0; i < iburgerArray.length; i++) {
            if (status == iburgerArray[i].getStutus()) {
                 viewPreparing = viewPararingOrder(iburgerArray[i]);
            }
        }
        return  viewPreparing;
    
    }
    public Iburger [] viewPararingOrder(Iburger status ){
        Iburger []tempPeparingOrder = new Iburger[viewPreparing.length+1];
        for (int i = 0; i <viewPreparing.length; i++) {
            tempPeparingOrder[i] = viewPreparing[i];
        }
        viewPreparing = tempPeparingOrder;
        viewPreparing[viewPreparing.length-1]=status;
        return viewPreparing;
    }
    
   
    
} 
