/**
 * CircleDingus -- part of HA RandomArtist
 * example of a very simple Dingus
 * @author huub
 */

import java.awt.Graphics;

class StarDingus extends Dingus {
    protected int radius;
    protected boolean filled; //true: filled, false: outline

    public StarDingus(int maxX, int maxY) {
        // intialize randomly the Dingus properties, i.e., position and color
        super(maxX, maxY);
        // initialize randomly the CircleDingus properties, i.e., radius and filledness
        radius = random.nextInt(maxX/4);
        filled = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        double x = random.nextInt(800);
        double y = random.nextInt(450);
        double face = random.nextInt(360);
        double faceOffs = 2 * Math.PI / 3;
        double thrust = random.nextInt(40);
        if(thrust > 0) {
        double ang = 2 * Math.PI / 3;
        int[] px = { (int) Math.round(x + 15 * Math.cos(face)),
                (int) Math.round(x + 10 * Math.cos(face + faceOffs)),
                (int) Math.round(x + 10 * Math.cos(face - faceOffs)) };
        int[] py = { (int) Math.round(y + 15 * Math.sin(face)),
                (int) Math.round(y + 10 * Math.sin(face + faceOffs)),
                (int) Math.round(y + 10 * Math.sin(face - faceOffs)) };
        g.fillPolygon(px, py, 3);
        g.drawPolygon(px, py, 3);

        }
    }
}
