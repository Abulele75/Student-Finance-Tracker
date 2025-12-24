package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class RoundedImageUtil {
    public static ImageIcon createRoundedImageIcon(String s, int i) {
        try {
            Image img = new ImageIcon(RoundedImageUtil.class.getResource(s)).getImage();
            if (img == null) {
                System.out.println("Image not found:" + s);
                return createDefaultIcon(i);
            }
            BufferedImage rounded = new BufferedImage(i, i, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = rounded.createGraphics();

            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, i, i);
            g2d.setClip(circle);

            g2d.drawImage(img, 0, 0,i,i, null);
            g2d.dispose();
            return new ImageIcon(rounded);
        } catch (Exception e) {
            System.out.println("Image not found:" + e.getMessage());
            return createDefaultIcon(i);
        }

    }

    public static ImageIcon createDefaultIcon(int s) {
        BufferedImage defaultImage = new BufferedImage(s, s, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = defaultImage.createGraphics();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillOval(0, 0, s, s);
        g2d.dispose();
        return new ImageIcon(defaultImage);
    }
}

