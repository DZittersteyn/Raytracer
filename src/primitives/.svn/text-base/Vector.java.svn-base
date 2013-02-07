package primitives;

public class Vector extends Triple {

    public static <X extends Triple> Vector toVector(X t) {
        Vector out = new Vector();
        out.x = t.x;
        out.y = t.y;
        out.z = t.z;
        return out;
    }

   
    public static <X extends Triple> Vector normalized(X v) {
        Vector t = Vector.div(v, v.length());
        return t;
    }

    /*
     * Add
     */
    public static <X extends Triple> Vector add(X t1, X t2) {
        Vector out = new Vector();
        out.x = t1.x + t2.x;
        out.y = t1.y + t2.y;
        out.z = t1.z + t2.z;
        return out;
    }

    public static <X extends Triple> Vector add(X t1, double d) {
        Vector out = new Vector();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    public static <X extends Triple> Vector add(double d, X t1) {
        Vector out = new Vector();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    /*
     * Subtract
     */
    public static <X extends Triple> Vector sub(X t1, X t2) {
        Vector out = new Vector();
        out.x = t1.x - t2.x;
        out.y = t1.y - t2.y;
        out.z = t1.z - t2.z;
        return out;
    }

    public static <X extends Triple> Vector sub(X t1, double d) {
        Vector out = new Vector();
        out.x = t1.x - d;
        out.y = t1.y - d;
        out.z = t1.z - d;
        return out;
    }

    public static <X extends Triple> Vector sub(double d, X t1) {
        Vector out = new Vector();
        out.x = d - t1.x;
        out.y = d - t1.y;
        out.z = d - t1.z;
        return out;
    }

    /*
     * Divide
     */
    public static <X extends Triple> Vector div(double d, X t1) {
        Vector out = new Vector();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    public static <X extends Triple> Vector div(X t1, double d) {
        Vector out = new Vector();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    /*
     * Times
     */
    public static <X extends Triple> Vector times(X t1, X t2) {
        Vector out = new Vector();
        out.x = t1.x * t2.x;
        out.y = t1.y * t2.y;
        out.z = t1.z * t2.z;
        return out;
    }

    public static <X extends Triple> Vector times(X t, double d) {
        Vector out = new Vector();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    public static <X extends Triple> Vector times(double d, X t) {
        Vector out = new Vector();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    /*
     * Cross products
     */
    public static <X extends Triple> Vector cross(X t1, X t2) {
        Vector out = new Vector();
        out.x = t1.y * t2.z - t1.z * t2.y;
        out.y = t1.z * t2.x - t1.x * t2.z;
        out.z = t1.x * t2.y - t1.y * t2.x;
        return out;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
