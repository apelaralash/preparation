package tasks.task6;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number:");
        String number = scanner.nextLine();

        BufferedImage image = new BufferedImage(288, 64, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("Dialog", Font.PLAIN, 16));
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(number, 6, 24);

        for (int y = 0; y < 64; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < 288; x++)
                sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y) == -1 ? "*" : "*");
            if (sb.toString().trim().isEmpty()) continue;
            System.out.println(sb);
        }
    }
}
