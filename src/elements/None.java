
package elements;

import primitives.Hit;
import primitives.Material;
import raytracer.Ray;


public class None extends IElement{

    public Material getMaterial() {
        return new Material();
    }

    public void setMaterial(Material material) {
    }

    public Hit intersect(Ray ray) {
        return Hit.no_hit();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
