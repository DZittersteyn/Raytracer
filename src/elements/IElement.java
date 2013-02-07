package elements;

import raytracer.Ray;
import primitives.*;

public abstract class IElement {


    public Point location;
    public Material material;

    public abstract Material getMaterial();

    public abstract void setMaterial(Material material);

    public abstract Hit intersect(Ray ray);

    @Override
    public abstract String toString();

  
}
