package primitives;


public class Eye {

 
    public Point location;
    public Vector upvector;
    public Point gridcenter;

 
    @Override
    public String toString() {
        return "Location: " + location + "\n"
                + "Direction: " + upvector + "\n"
                + "Drawplanedist: " + gridcenter;
    }
}
