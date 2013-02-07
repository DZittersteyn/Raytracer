package raytracer;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        YamlReader reader = null;
        Scene s = null;
        try {
            reader = new YamlReader(new FileReader("scene01.yaml"));
            s = reader.read(Scene.class);
        } catch (FileNotFoundException f) {
            System.err.println("File not Found: " + "scene01.yaml");
        } catch (YamlException y) {
            y.printStackTrace();
        }
        //System.out.println(s);
        s.render().writeImage(new File("scene01.png"));

    }
}
