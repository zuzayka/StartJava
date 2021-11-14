import java.awt.*;
import java.io.IOException;

public class Unicode {
    public static void main(String[] args) throws IOException {
        int i;
        byte[] arr = {33, 126};
        String substitute = new String(arr, "UTF-8");
        Font font = new Font("SourceCodePro-Light", Font.PLAIN, 10);
        boolean b = font.canDisplay((char) 9398);
        System.out.println(b);

        for (i = 9398; i <= 10178; i++) {
            if ((i + 2) % 10 == 0) {
                System.out.println(" ");
            }
            if (font.canDisplay((char) i)) {
                System.out.print((char) i + " ");
            } else {
                System.out.print(substitute);
            }
        }
    }
}
