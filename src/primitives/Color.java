package primitives;

public class Color extends Triple {

    public Color(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public static <X extends Triple> Color toColor(X t) {
        Color out = new Color();
        out.x = t.x;
        out.y = t.y;
        out.z = t.z;
        return out;
    }


    /*
     * Add
     */

    public static <X extends Triple> Color add(X t1, X t2) {
        Color out = new Color();
        out.x = t1.x + t2.x;
        out.y = t1.y + t2.y;
        out.z = t1.z + t2.z;
        return out;
    }

    public static <X extends Triple> Color add(X t1, double d) {
        Color out = new Color();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    public static <X extends Triple> Color add(double d, X t1) {
        Color out = new Color();
        out.x = t1.x + d;
        out.y = t1.y + d;
        out.z = t1.z + d;
        return out;
    }

    /*
     * Subtract
     */
    public static <X extends Triple> Color sub(X t1, X t2) {
        Color out = new Color();
        out.x = t1.x - t2.x;
        out.y = t1.y - t2.y;
        out.z = t1.z - t2.z;
        return out;
    }

    public static <X extends Triple> Color sub(X t1, double d) {
        Color out = new Color();
        out.x = t1.x - d;
        out.y = t1.y - d;
        out.z = t1.z - d;
        return out;
    }

    public static <X extends Triple> Color sub(double d, X t1) {
        Color out = new Color();
        out.x = d - t1.x;
        out.y = d - t1.y;
        out.z = d - t1.z;
        return out;
    }

    /*
     * Divide
     */
    public static <X extends Triple> Color div(double d, X t1) {
        Color out = new Color();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    public static <X extends Triple> Color div(X t1, double d) {
        Color out = new Color();
        double invf = 1.0 / d;
        out.x = t1.x * invf;
        out.y = t1.y * invf;
        out.z = t1.z * invf;
        return out;
    }

    /*
     * Times
     */
    public static <X extends Triple> Color times(X t1, X t2) {
        Color out = new Color();
        out.x = t1.x * t2.x;
        out.y = t1.y * t2.y;
        out.z = t1.z * t2.z;
        return out;
    }

    public static <X extends Triple> Color times(X t, double d) {
        Color out = new Color();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    public static <X extends Triple> Color times(double d, X t) {
        Color out = new Color();
        out.x = t.x * d;
        out.y = t.y * d;
        out.z = t.z * d;
        return out;
    }

    /*
     * Cross products
     */
    public static <X extends Triple> Color cross(X t1, X t2) {
        Color out = new Color();
        out.x = t1.y * t2.z - t1.z * t2.y;
        out.y = t1.z * t2.x - t1.x * t2.z;
        out.z = t1.x * t2.y - t1.y * t2.x;
        return out;
    }

    public Color(double r, double g, double b) {
        x = r;
        y = g;
        z = b;
    }

    public Color(double grey){
        x = grey;
        y = grey;
        z = grey;
    }
    public void setR(double r) {
        this.x = r;
    }

    public void setG(double g) {
        this.y = g;
    }

   public void setB(double b) {
        this.z = b;
    }

    public float getRf() {
        return new Double(x).floatValue();
    }

    public float getGf() {
        return new Double(y).floatValue();
    }

    public float getBf() {
        return new Double(z).floatValue();
    }

    public double getR() {
        return x;
    }

    public double getG() {
        return y;
    }

    public double getB() {
        return z;
    }

    public java.awt.Color toAWTColor() {
        return new java.awt.Color(getRf(), getGf(), getBf());
    }

    public Color clamp() {
        x = x > 1 ? 1 : x;
        y = y > 1 ? 1 : y;
        z = z > 1 ? 1 : z;

        x = x < 0 ? 0 : x;
        y = y < 0 ? 0 : y;
        z = z < 0 ? 0 : z;
        return this;
    }
}
