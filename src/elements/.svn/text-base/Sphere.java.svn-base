package elements;

import primitives.*;
import raytracer.Ray;

public class Sphere extends IElement {


    public double radius;
    
    public void setMaterial(Material material) {
        this.material = material;
    }

    public Hit intersect(Ray ray) {
        Vector eo = Vector.toVector(Point.sub(this.location, ray.origin));
        double v = Vector.dot(eo, ray.direction);
        double disc = (Math.pow(this.radius, 2) - (Vector.dot(eo, eo) - Math.pow(v, 2)));
        double d = Math.sqrt(disc);

        if (disc >= 0 && v - d >= 0) {
            Point intersect = Point.add(ray.origin, Point.times((v - d), ray.direction));
     
            return new Hit((v - d), intersect, Vector.normalized(Vector.sub(intersect, this.location)));
        } else {
            return Hit.no_hit();
        }

    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "type: Sphere:" + " | @:" + location + " | r: " + radius + " | m: [" + material + "]";
    }



}
