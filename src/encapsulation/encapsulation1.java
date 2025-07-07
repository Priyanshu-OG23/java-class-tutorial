package encapsulation;

public class encapsulation1 {

    public int eyes=2;
    private int ears=2;

    // get method which is used to display the function but user cannot overwrite it 

    public int getEars()
    {
        // we can call the global variable in the same class even if it's marked private  
        return ears;
    }
    
    // setMethod will allow the user to overwrite the value set to variable by passing arguments 

    public void setEars(int e) // this e will take parameter and we will set e to eyes to overwrite the private declared variable 
    {
        ears=e;
    }
}
