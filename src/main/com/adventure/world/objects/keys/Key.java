package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 *
 * The default values for a door are level = 1 and name = "key"
 */

public class Key implements Tangible {

    //TODO variable for level and name needed here
    public int level;
    public String name;
    //TODO Add default (i.e. no params) constructor here

    /**
     * Create a new key with a default level of 1 and the name: "key".
     */
    public Key() {
        this.level = 1;
        this.name = "key";
    }

    //TODO add constructor that takes a level, and saves it

    /**
     * Creates a key with a particular level and name in mind.
     * @param level - any integer.
     */
    public Key(int level) {
        this.level = level;
        this.name = "key";
    }

    //TODO add constructor that takes a level and name, and saves it

    /**
     * Creates a key with a particular level and name in mind.
     * @param level - any integer.
     * @param name - a name in String format.
     */
    public Key(int level, String name) {
        this.level = level;
        this.name = name;
    }


    /**
     * Get the level of a key.
     * @return level - an integer.
     */
    public int getLevel() {
        //TODO Fix this so it references the level property instead of 0
        return this.level;
    }

    /**
     * Get the name of a key.
     * @return name - a key name in String format.
     */
    //TODO Fix this so it references the name property instead of "key"
    @Override
    public String getName() {
        return this.name;
    }





    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
