package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content = new Key();
    private boolean isCovered = true;

    /**
     * Create what goes in a hole.
     * (hint: It will always be a key)
     * @param key - of type Key.
     */
    public HoleContent(Key key) {
        content = key;
    }
    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }
    public boolean isCovered() {
        return isCovered;
    }
    public Key getKey() {
        return content;
    }
}