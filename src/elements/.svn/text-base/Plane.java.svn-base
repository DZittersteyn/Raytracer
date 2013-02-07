    
package elements;

import primitives.Hit;
import primitives.Material;
import primitives.Vector;
import raytracer.Ray;


public class Plane extends IElement{

    public Vector normal;

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public Hit intersect(Ray ray) {
        return new Hit(0, location, normal);
    }

    @Override
    public String toString() {
        return "Plane: location: " + location + " normal: " + normal;
    }

}
