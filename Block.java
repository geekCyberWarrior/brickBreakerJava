import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Block extends Rectangle {

	private static final long serialVersionUID = 1L;

	Image pic;
	int dx,dy;
	boolean destroyed;
	Rectangle left,right;
	boolean powerup;
	public Block(int xx, int yy, int w, int h, String s) {
		dx=2;
		dy=-2;
		destroyed = false;
		powerup = false;
		x=xx;
		y=yy;
		width = w;
		height = h;
		left = new Rectangle(xx-1, yy, 1, h);
		right = new Rectangle(xx+w+1, yy, 1, h);
		right = new Rectangle();
		pic = Toolkit.getDefaultToolkit().getImage(s);
	}
	
	public void draw(Graphics g, Component c) {
		if(!destroyed)
			g.drawImage(pic, x, y, width, height, c);
	}
}
