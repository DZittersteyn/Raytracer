package primitives;

public class Point extends Triple {

    public static <X extends Triple> Point normalized(X v) {
        Point t = Point.div(v, v.length());
        return t;
    }

    public static <X extends Triple> Point toPoint(X t) {
        Point out = new Point();
        out.x = t.x;
        out.y = t.y;
        out.z = t.z;
        return out;
    }


    /*
     * Add
     */
    public static <X extends Triple> Point add(X t1, X t2) {
        Point out = new Point();
        out.x = t1.x + t2.x;
        out.y = t1.y + t2.y;
        out.z = t1.z + t2.z;
        return out;
    }

    public static <X extends Triple> Point add(X t1, double d) {
        Point out = new Point();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    public static <X extends Triple> Point add(double d, X t1) {
        Point out = new Point();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    /*
     * Subtract
     */
    public static <X extends Triple> Point sub(X t1, X t2) {
        Point out = new Point();
        out.x = t1.x - t2.x;
        out.y = t1.y - t2.y;
        out.z = t1.z - t2.z;
        return out;
    }

    public static <X extends Triple> Point sub(X t1, double d) {
        Point out = new Point();
        out.x = t1.x - d;
        out.y = t1.y - d;
        out.z = t1.z - d;
        return out;
    }

    public static <X extends Triple> Point sub(double d, X t1) {
        Point out = new Point();
        out.x = d - t1.x;
        out.y = d - t1.y;
        out.z = d - t1.z;
        return out;
    }

    /*
     * Divide
     */
    public static <X extends Triple> Point div(double d, X t1) {
        Point out = new Point();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    public static <X extends Triple> Point div(X t1, double d) {
        Point out = new Point();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    /*
     * Times
     */
    public static <X extends Triple> Point times(X t1, X t2) {
        Point out = new Point();
        out.x = t1.x * t2.x;
        out.y = t1.y * t2.y;
        out.z = t1.z * t2.z;
        return out;
    }

    public static <X extends Triple> Point times(X t, double d) {
        Point out = new Point();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    public static <X extends Triple> Point times(double d, X t) {
        Point out = new Point();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    /*
     * Cross products
     */
    public static <X extends Triple> Point cross(X t1, X t2) {
        Point out = new Point();
        out.x = t1.y * t2.z - t1.z * t2.y;
        out.y = t1.z * t2.x - t1.x * t2.z;
        out.z = t1.x * t2.y - t1.y * t2.x;
        return out;
    }
}
