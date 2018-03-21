package readMethods;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class SaveImageClass {

    public static void bytesToImage(byte[] decoderBytes, String resultDirectory) throws IOException {
        BufferedImage resultImage = ImageIO.read(new ByteArrayInputStream(decoderBytes));
        ImageIO.write(resultImage, "jpg", new File(resultDirectory, "resultImage.jpg"));
    }
}
