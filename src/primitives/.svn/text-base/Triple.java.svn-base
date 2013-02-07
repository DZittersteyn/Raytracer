package primitives;

public class Triple {

    public double x;
    public double y;
    public double z;


    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static <X extends Triple> Triple toTriple(X t) {
        Triple out = new Triple();
        out.x = t.x;
        out.y = t.y;
        out.z = t.z;
        return out;
    }

    public void normalize() {
        Triple v = Triple.normalized(this);
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }

    public static <X extends Triple> Triple normalized(X v) {
        Triple t = Triple.div(v, v.length());
        return t;
    }

    /*
     * Dot products
     */
    public static <X extends Triple> double dot(X t1, X t2) {
        return t1.x * t2.x + t1.y * t2.y + t1.z * t2.z;
    }

    /*
     * Add
     */
    public static <X extends Triple> Triple add(X t1, X t2) {
        Triple out = new Triple();
        out.x = t1.x + t2.x;
        out.y = t1.y + t2.y;
        out.z = t1.z + t2.z;
        return out;
    }

    public static <X extends Triple> Triple add(X t1, double d) {
        Triple out = new Triple();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    public static <X extends Triple> Triple add(double d, X t1) {
        Triple out = new Triple();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    /*
     * Subtract
     */
    public static <X extends Triple> Triple sub(X t1, X t2) {
        Triple out = new Triple();
        out.x = t1.x - t2.x;
        out.y = t1.y - t2.y;
        out.z = t1.z - t2.z;
        return out;
    }

    public static <X extends Triple> Triple sub(X t1, double d) {
        Triple out = new Triple();
        out.x = t1.x - d;
        out.y = t1.y - d;
        out.z = t1.z - d;
        return out;
    }

    public static <X extends Triple> Triple sub(double d, X t1) {
        Triple out = new Triple();
        out.x = d - t1.x;
        out.y = d - t1.y;
        out.z = d - t1.z;
        return out;
    }

    /*
     * Divide
     */
    public static <X extends Triple> Triple div(double d, X t1) {
        Triple out = new Triple();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    public static <X extends Triple> Triple div(X t1, double d) {
        Triple out = new Triple();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    /*
     * Times
     */
    public static <X extends Triple> Triple times(X t1, X t2) {
        Triple out = new Triple();
        out.x = t1.x * t2.x;
        out.y = t1.y * t2.y;
        out.z = t1.z * t2.z;
        return out;
    }

    public static <X extends Triple> Triple times(X t, double d) {
        Triple out = new Triple();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    public static <X extends Triple> Triple times(double d, X t) {
        Triple out = new Triple();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    /*
     * Cross products
     */
    public static <X extends Triple> Triple cross(X t1, X t2) {
        Triple out = new Triple();
        out.x = t1.y * t2.z - t1.z * t2.y;
        out.y = t1.z * t2.x - t1.x * t2.z;
        out.z = t1.x * t2.y - t1.y * t2.x;
        return out;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }
}
