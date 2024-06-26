package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Board {
    final int MAX_COL = 8;
    final int MAX_ROW = 8;
    public static final int SQUARE_SIZE = 100;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;

    public void draw(Graphics2D g2) {
        int c = 0;

        for (int row = 0; row < MAX_ROW; row++) {
            for (int col = 0; col < MAX_COL; col++) {
                if (c == 0) {
                    // Use a light green shade for the squares where pieces are placed
                    g2.setColor(new Color(255, 144, 216, 255));
                    c = 1;
                } else {
                    // Use a darker green shade for the remaining squares
                    g2.setColor(new Color(196, 241, 255));
                    c = 0;
                }

                g2.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }

            if (c == 0) {
                c = 1;
            } else {
                c = 0;
            }
        }
    }

}
//FF90D8FF
//        C4F1FFFF
