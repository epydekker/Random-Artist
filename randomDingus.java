/**
 * TreeDingus - part of HA RandomArtist
 * a little bit more advanced example of a shape
 * a tree consisting of a trunk (rectangle) and a crown (circle)
 *
 * @author huub
 */

import java.awt.Graphics;

class randomDingus extends Dingus {
    private int crownRadius;
    private int trunkHeight;
    private int trunkWidth;
    private boolean filled; // true: filled; false: outline
    private int height;
    private int width;

    public randomDingus(int maxX, int maxY) {
        // initialize Dingus properties
        super(maxX, maxY);

        // initialize TreeDingus properties
        height = random.nextInt(maxX/4); // or something more sophisticated
        width= random.nextInt(maxY);
        trunkWidth = crownRadius/3 + 1;
        filled = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        // draw crown
        g.setColor(color);
        if (filled) {
            // more general way to draw an oval than with fillOval (hint :-)
            g.fillOval(x, y, width, height);
        } else {
            g.drawOval(x, y, width, height);
        }

        // draw trunk
        g.setColor(color);
        int xx = x + crownRadius - trunkWidth/2;
        int yy = y + 2*crownRadius;
        if (filled) {
            g.drawOval(x, y, width, height);
        } else {
            g.fillOval(x, y, width, height);
        }
    }
}

