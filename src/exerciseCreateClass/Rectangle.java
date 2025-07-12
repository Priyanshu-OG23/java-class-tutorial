package exerciseCreateClass;

public class Rectangle {

    private int length=4;
    private int width=5;

    // get letter methods which will show the variable and user would not be able to modify it 

    public int getlength()
    {
        // since we cannot return double variable using return method we will wrap them in a array 
       return length;
    }

    public void setLength(int l) 
    {
        length=l;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int w)
    {
        width=w;
    }
    
}
