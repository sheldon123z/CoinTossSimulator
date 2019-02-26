// Name:
// USC NetID:
// CS 455 PA1
// Spring 2019

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
   
	private int bottom;
	private int left;
	private int barWidth;
	private int barHeight;
	private double scale;
	private String label;
	private Color color;

   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   public Bar(int bottom, int left, int width, int barHeight,
              double scale, Color color, String label) {
	   this.bottom=bottom;
	   this.left=left;
	   this.barWidth=width;
	   this.barHeight=barHeight;
	   this.scale=scale;
	   this.label=label;
	   this.color=color;	   
			   
   }
   
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
	   
	   /*draw the rectangle object*/
	   int actualHeight=(int)(barHeight*scale);
	   g2.setColor(color);
	   Rectangle rect= new Rectangle(left,bottom+(barHeight-actualHeight),barWidth,actualHeight);
	   g2.fill(rect);
	   
	   /*draw the string */
	   g2.setColor(Color.black);
	   Font font = g2.getFont();
	   FontRenderContext context = g2.getFontRenderContext();
	   Rectangle2D labelBounds = font.getStringBounds(label, context);
	   int widthOfLabel = (int) labelBounds.getWidth();
	   int heightOfLabel = (int) labelBounds.getHeight();
	   g2.drawString(label, (int) (left+0.5*barWidth-0.5*widthOfLabel), bottom+barHeight+heightOfLabel);
	   	   
   }
}
