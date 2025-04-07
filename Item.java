
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private int weight;

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }
    
    public int getWeight()
    {
        return weight;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDescription()
    {
        return description + "Weight: " + weight + ")";
    }
}
