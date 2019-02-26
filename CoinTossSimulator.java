// Name:Xiaodong Zheng
// USC NetID:8542804448
// CS 455 PA1
// Spring 2019

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
import java.util.Random;
public class CoinTossSimulator {

	private int numTrials;
	private int numTwoHeads;
	private int numTwoTails;
	private int numHeadTails;

   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
	   numTrials=0;
	   numTwoHeads=0;
	   numTwoTails=0;
	   numHeadTails=0;
	   
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
	   
	   if (numTrials>=0)
	   {
		   this.numTrials = this.numTrials + numTrials;
		   
		   Random generator = new Random();
		   
		   for(int i= 0;i<numTrials;i++)
		   {
			  int coin1= generator.nextInt(2);
			  int coin2 =generator.nextInt(2);
			
			  if (coin1==0 && coin2==0)// 1 represents head 0 represents tail
			  {
				  numTwoHeads+=1;
			  }
			  else if (coin1==1 && coin2==1)
			  {
				  numTwoTails+=1;
			  }
			  else if((coin1==1 && coin2==0) || (coin1==0 &&coin2==1)) 
			  {
				  numHeadTails+=1;
			  }
		   }
	   }
	   else 
		   System.out.println("the number of trials must be >=1");
	   
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return numTrials; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return numTwoHeads; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return numTwoTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return numHeadTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   this.numTrials = 0;
	   this.numTwoHeads=0;
	   this.numTwoTails=0;
	   this.numHeadTails=0;
	   
   }


}
