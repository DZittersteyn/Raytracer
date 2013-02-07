package primitives;

public class Hit {
    public double distance;
    public Point intersection;
    public Vector normal;

    public static final double NO_HIT = Double.MAX_VALUE ;
    
    public static Hit no_hit(){
        return new Hit(NO_HIT, new Point(), new Vector());
    }

    public Hit(){
        
    }
    public Hit(double distance, Point intersection, Vector normal){
        this.distance = distance;
        this.normal = Vector.normalized(normal);
        this.intersection = intersection;
    }

    @Override
    public String toString(){
        return "[Hit: dist: " + this.distance + " norm: " + this.normal +"]";
    }
}
