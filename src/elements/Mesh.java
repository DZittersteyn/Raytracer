
package elements;

import primitives.Hit;
import primitives.Material;
import raytracer.Ray;


public class Mesh extends IElement {

    public String path;

   
    @Override
    public Material getMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaterial(Material material) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Hit intersect(Ray ray) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
