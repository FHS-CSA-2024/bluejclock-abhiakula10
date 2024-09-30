package src.main.java;



public class NumberDisplay
{
    
    private int limit;
  
    private int value;
    
    
  
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }
    
    public int getLimit() {
        return limit;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setLimit(int newLimit) {
        limit = newLimit;
    }
    
    public void setValue(int newValue) {
        if ( newValue >= 0 && newValue < limit) {
            value = newValue;
        }
    }
    
   
    public String getDisplayValue() {
        String output ="";
        output = Integer.toString(value);
        if (output.length() == 1) {
            output = "0" + output;
        }
        
        return output;
    }

   
    public void increment() {
        value++;
        
        if (value>= limit) {
            value = 0;
        }
    }
}
