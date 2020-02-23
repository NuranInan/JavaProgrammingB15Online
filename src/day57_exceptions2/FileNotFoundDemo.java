
package day57_exceptions2;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {
        try {
            Files.readAllLines(Paths.get("file.txt"));
        }catch (IIOException e){
            System.out.println("Exception happened and caught! ");
        }
    }

}
