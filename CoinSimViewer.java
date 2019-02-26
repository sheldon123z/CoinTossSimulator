// Name:Xiaodong Zheng
// USC NetID:zhen371
// CS 455 PA1
// Spring 2019

/**
 * class CoinSimViewer
 * 
 *View the simulation result in a bar chart
 * 
 */

import javax.swing.JFrame;
import java.util.Scanner;
/**
   A class to view the coin simulation result
*/
public class CoinSimViewer {
    
    private static int frameWidth=800;
    private static int frameHeight=500;
/**
   Main class to run the program, in this method the simulation results are acuqired from CoinTossSimulator class
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();

		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("Three Bars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
      	CoinTossSimulator sim = new CoinTossSimulator();
        
        int simulationTrials=0;
        boolean flag=false;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of trails:");      
        while(!flag)
        {
        simulationTrials=reader.nextInt();
        if (simulationTrials<=0)
          {
           System.out.println("ERROR: Number entered must be greater than 0.");
          }
        else
          {
           flag=true;
           reader.close();
          }
        }
		sim.run(simulationTrials);
		double numTrials=sim.getNumTrials();
		int numTwoHeads=sim.getTwoHeads();
		int numTwoTails=sim.getTwoTails();
		int numHeadTails=sim.getHeadTails();
		
		double bar1Scale=numTwoHeads/numTrials;
		double bar2Scale=numHeadTails/numTrials;
		double bar3Scale=numTwoTails/numTrials;	

		
		System.out.println("bar1Scale: "+ bar1Scale);
		System.out.println("bar2Scale: "+ bar2Scale);
		System.out.println("bar3Scale: "+ bar3Scale);
		System.out.println("numTrials:"+numTrials);
		System.out.println("numTwoHeads:"+numTwoHeads);
		System.out.println("numHeadTails: "+numHeadTails);
		System.out.println("numTwoTails:"+numTwoTails);
		
        CoinSimComponent component = new CoinSimComponent(bar1Scale,bar2Scale,bar3Scale,numTwoHeads,numHeadTails,numTwoTails);
        frame.add(component);

        frame.setVisible(true);
	}

}
