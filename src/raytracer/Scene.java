package raytracer;

import primitives.*;
import elements.*;

public class Scene {

    public Image image;
    public Eye eye;
    public java.util.Vector<Light> lights;
    public java.util.Vector<IElement> elements;

    public enum Type {

        image, eye, lights, elements, error
    };

    public Image render() {
 
        Vector upvectorN = Vector.normalized(this.eye.upvector);

        Vector gridvectorN = Vector.normalized(Vector.sub(this.eye.gridcenter, this.eye.location));
        Vector rightN = Vector.cross(upvectorN, gridvectorN);


        for (int x = -1 * (image.width / 2); x < image.width / 2; x++) {
            for (int y = -1 * (image.height / 2); y < image.height / 2; y++) {
                Point target = this.eye.gridcenter;

                target = Point.add(target, Vector.times(x, rightN)); //x
                target = Point.add(target, Vector.times(y, upvectorN)); //y

                Ray ray = new Ray(eye.location, (Vector.sub(target, eye.location)));
             
                image.setPixel(image.height / 2 - (x + 1), image.width / 2 - (y + 1), ray.trace(this).clamp());

            }
        }
        return image;
    }

    @Override
    public String toString() {
        String eyeString = "" + eye.toString();
        String lightString = "";
        for (Light light : lights) {
            lightString += light + "\n";
        }
        String elementString = "";
        for (IElement element : elements) {
            elementString += element + "\n";
        }
        String imageString = image.toString();
        
        return "Image: \n" + imageString + "\n\n"
                + "Eye: \n" + eyeString + "\n\n"
                + "Lights: \n" + lightString + "\n"
                + "Elements: \n" + elementString + "\n";
    }
}
