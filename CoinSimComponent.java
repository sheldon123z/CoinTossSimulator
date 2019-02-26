import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CoinSimComponent extends JComponent 
{   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int width;
	private int barHeight;

	
	private double bar1Scale;
	private double bar2Scale;	
	private double bar3Scale;
	private int numTwoHeads;
	private int numHeadTails;	
	private int numTwoTails;
		
	public CoinSimComponent(double bar1Scale, double bar2Scale, double bar3Scale,int numTwoHeads,int numHeadTails, int numTwoTails ) {
		// TODO Auto-generated constructor stub

		 width=50;
		 barHeight=400;
		 
		 this.bar1Scale=bar1Scale;
		 this.bar2Scale=bar2Scale;	
		 this.bar3Scale=bar3Scale;
		 this.numTwoHeads=numTwoHeads;
		 this.numHeadTails=numHeadTails;
		 this.numTwoTails=numTwoTails;
		 
	}

	public void paintComponent(Graphics g)
	{  
		
	    Graphics2D g2 = (Graphics2D) g;
	    
	    int barX = getWidth()/4;
	    int bottom=(getHeight()-barHeight)/2;

	    Bar bar1 = new Bar(bottom, barX, width, barHeight, bar1Scale, Color.RED, "Two Heads: "+"("+numTwoHeads+") "+Math.round(bar1Scale*100)+"%");
	    bar1.draw(g2);
	   
	    Bar bar2 = new Bar(bottom, barX*2, width, barHeight, bar2Scale, Color.GREEN, "A Head and a Tail: "+"("+numHeadTails+") " +Math.round(bar2Scale*100)+"%");
	    bar2.draw(g2);
	    
	    Bar bar3 = new Bar(bottom, barX*3, width, barHeight, bar3Scale, Color.BLUE, "Two Tails: "+"("+numTwoTails+") "+Math.round(bar3Scale*100)+"%");
	    bar3.draw(g2);
	}
}
