package raytracer;

import elements.IElement;
import elements.Mesh;
import primitives.*;

public class Ray {

    public Point origin;
    public Vector direction;

    public Ray(Point origin, Vector direction) {
        this.origin = origin;
        this.direction = Vector.normalized(direction);
    }

    // Calculate the point along vector 'direction' at distance 'distance' from point origin
    public Point at(double distance) {
        return Point.add(origin, Point.times(distance, Point.toPoint(direction)));

    }

    public Color trace(Scene s) {
        Hit min_hit = Hit.no_hit();
        Color c = new Color();



        IElement hitElement = null;
        for (IElement element : s.elements) {
            Hit hit = element.intersect(this);
            if (hit.distance < min_hit.distance) {
                min_hit = hit;
                hitElement = element;
            }
        }
        if (hitElement == null) {
            return c;
        }

        // normal of the object at the hitpoint
        Vector N = Vector.normalized(min_hit.normal);

        switch (s.image.rendermode) {
            case phong:

                boolean doAmbient = true;
                boolean doDiffuse = true;
                boolean doSpecular = true;


                // Ambient calculation
                if (doAmbient) {
                    double ka = hitElement.material.ka;
                    Color ambient = Color.times(ka, hitElement.material.color);
                    ambient.clamp();
                    c = Color.add(c, ambient);
                }




                for (Light light : s.lights) {

                    // light vector
                    Vector L = Vector.normalized(Vector.sub(light.location, min_hit.intersection));
                    // reflection of the light at the intersection point
                    Vector R = Vector.normalized(Vector.sub(L, Vector.times(2, Vector.times(N, Vector.dot(L, N)))));
                    // vector between the origin of the ray and the hitpoint
                    Vector V = Vector.normalized(Vector.sub(min_hit.intersection, this.origin));

                    // Diffuse calculation
                    if (doDiffuse) {
                        double kd = hitElement.material.kd;
                        double diff = Vector.dot(Vector.normalized(L), N);
                        Color diffuse = Color.times(kd, Color.times(diff, hitElement.material.color));
                        diffuse.clamp();
                        c = Color.add(c, diffuse);
                    }

                    // Specular calculation
                    if (doSpecular) {
                        // Lr = L - 2 * N(L.N)
                        double ks = hitElement.material.ks;
                        if (Vector.dot(R, V) > 0) {
                            double spec = Math.pow(Vector.dot(R, L), hitElement.material.n);
                            Color specular = Color.times(ks, new Color(spec));
                            specular.clamp();
                            c = Color.add(c, specular);
                        }
                    }

                }

                break;


            case normal:
                int ref = 0; // 0 = show normal of sphere, 1 = show direction of reflection
                switch (ref) {
                    case 0:
                        c = new Color(((N.x) + 1) / 2, ((N.y) + 1) / 2, ((N.z) + 1) / 2);
                        break;

                    case 1:
                        Vector V = Vector.sub(min_hit.intersection, this.origin);

                        // R = V-2*N(V.N)
                        Vector R = Vector.normalized(Vector.sub(V, Vector.times(2, Vector.times(N, Vector.dot(V, N)))));
                        c = new Color(((R.x) + 1) / 2, ((R.y) + 1) / 2, ((R.z) + 1) / 2);
                }
                break;
            case plain:
                c = hitElement.material.color;
                break;
            case zbuffer:
                c = new Color(1 - (min_hit.distance / 1500));
                break;
            case error:
            default:

        }

        return c;
    }

    @Override
    public String toString() {
        return "Ray with origin " + this.origin + " and direction " + direction;
    }
}
