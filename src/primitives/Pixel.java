package primitives;

public class Pixel {

    public Color color;

    public Pixel(){
        color = new Color(0, 0, 0);
    }

    public Pixel(Color c){
        this.color = c;
    }

    public void setColor(Color color){
        this.color = color.clamp();
    }

}
