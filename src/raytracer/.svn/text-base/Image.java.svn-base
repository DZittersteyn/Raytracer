package raytracer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import primitives.Pixel;

public class Image {

    public enum Rendermode {

        phong, plain, normal, zbuffer, error
    };


    public Rendermode rendermode;
    public int width;
    public int height;
    private Pixel[][] pixelGrid;


   
    public void setPixel(int x, int y, primitives.Color c) {
        if(pixelGrid == null){
            System.out.println("new pixelgrid");
            pixelGrid = new Pixel[width][height];
        }
        pixelGrid[x][y] = new Pixel(c);

    }

    @Override
    public String toString() {
        return "Rendermode: " + rendermode.name() + "\n"
                + "Resolution: [" + width + "," + height + "]";
    }

    public void writeImage(File outputfile) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < pixelGrid.length; x++) {
            for (int y = 0; y < pixelGrid[0].length; y++) {
                img.setRGB(x, y, pixelGrid[x][y].color.toAWTColor().getRGB());
            }
        }

        try {
            ImageIO.write(img, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
