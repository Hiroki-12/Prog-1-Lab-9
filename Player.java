import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private Room currentRoom;
    private String name;
    private ArrayList<Item> inventory;
    private int maxWeight;
    private int currentWeight;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name, Room startingRoom)
    {
        this.name = name;
        this.currentRoom = startingRoom;
        this.inventory = new ArrayList<>();
        this.maxWeight = 10;
        this.currentWeight = 0;
    }

    public Room getCurrentRoom()
    {
        return currentRoom;
    }
    
    public void setCurrentRoom(Room room)
    {
        this.currentRoom = room;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean takeItem(Item item)
    {
        if (currentWeight + item.getWeight() <= maxWeight)
        {
            inventory.add(item);
            currentWeight += item.getWeight();
            return true;
        }
        return false;
    }
    
    public boolean dropItem(Item item)
    {
        if (inventory.remove(item))
        {
            currentWeight -= item.getWeight();
            return true;
        }
        return false;
    }
}
