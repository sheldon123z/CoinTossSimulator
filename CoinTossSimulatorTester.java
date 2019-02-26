
public class CoinTossSimulatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
      	CoinTossSimulator sim = new CoinTossSimulator();
      	int numTrials=sim.getNumTrials();
		int twoHead=sim.getTwoHeads();
		int twoTail=sim.getTwoTails();
		int oneHeadTail=sim.getHeadTails();
		
		System.out.println("After constructor:");
		System.out.println("Number of trials [exp:0]:"+numTrials);
		System.out.println("Two-head tosses:"+twoHead);
		System.out.println("Two-tail tosses:"+twoTail);
		System.out.println("One-head one-tail tosses:"+oneHeadTail);
		System.out.println("Tosses add up correctly?");
		if (numTrials==twoHead+twoTail+oneHeadTail)
			System.out.println("true");
		else 
			System.out.println("false");
		
		//sim.reset();
		sim.run(1);
		numTrials=sim.getNumTrials();
		twoHead=sim.getTwoHeads();
		twoTail=sim.getTwoTails();
		oneHeadTail=sim.getHeadTails();
		
		System.out.println("After run(1):");
		System.out.println("Number of trials [exp:1]:"+numTrials);
		System.out.println("Two-head tosses:"+twoHead);
		System.out.println("Two-tail tosses:"+twoTail);
		System.out.println("One-head one-tail tosses:"+oneHeadTail);
		System.out.println("Tosses add up correctly?");
		if (numTrials==twoHead+twoTail+oneHeadTail)
			System.out.println("true");
		else 
			System.out.println("false");

		sim.run(10);
		numTrials=sim.getNumTrials();
		twoHead=sim.getTwoHeads();
		twoTail=sim.getTwoTails();
		oneHeadTail=sim.getHeadTails();
		
		System.out.println("After run(10):");
		System.out.println("Number of trials [exp:11]:"+numTrials);
		System.out.println("Two-head tosses:"+twoHead);
		System.out.println("Two-tail tosses:"+twoTail);
		System.out.println("One-head one-tail tosses:"+oneHeadTail);
		System.out.println("Tosses add up correctly?");
		if (numTrials==twoHead+twoTail+oneHeadTail)
			System.out.println("true");
		else 
			System.out.println("false");
		
		//sim.reset();
		sim.run(100);
		numTrials=sim.getNumTrials();
		twoHead=sim.getTwoHeads();
		twoTail=sim.getTwoTails();
		oneHeadTail=sim.getHeadTails();
		
		System.out.println("After run(100):");
		System.out.println("Number of trials [exp:111]:"+numTrials);
		System.out.println("Two-head tosses:"+twoHead);
		System.out.println("Two-tail tosses:"+twoTail);
		System.out.println("One-head one-tail tosses:"+oneHeadTail);
		System.out.println("Tosses add up correctly?");
		if (numTrials==twoHead+twoTail+oneHeadTail)
			System.out.println("true");
		else 
			System.out.println("false");
		
		sim.reset();

		sim.run(0);
		numTrials=sim.getNumTrials();
		twoHead=sim.getTwoHeads();
		twoTail=sim.getTwoTails();
		oneHeadTail=sim.getHeadTails();
		
		System.out.println("After reset:");
		System.out.println("After run(0):");
		System.out.println("Number of trials [exp:0]:"+numTrials);
		System.out.println("Two-head tosses:"+twoHead);
		System.out.println("Two-tail tosses:"+twoTail);
		System.out.println("One-head one-tail tosses:"+oneHeadTail);
		System.out.println("Tosses add up correctly?");
		if (numTrials==twoHead+twoTail+oneHeadTail)
			System.out.println("true");
		else 
			System.out.println("false");
		
		sim.run(1000);
		numTrials=sim.getNumTrials();
		twoHead=sim.getTwoHeads();
		twoTail=sim.getTwoTails();
		oneHeadTail=sim.getHeadTails();
		
		System.out.println("After run(1000):");
		System.out.println("Number of trials [exp:1000]:"+numTrials);
		System.out.println("Two-head tosses:"+twoHead);
		System.out.println("Two-tail tosses:"+twoTail);
		System.out.println("One-head one-tail tosses:"+oneHeadTail);
		System.out.println("Tosses add up correctly?");
		if (numTrials==twoHead+twoTail+oneHeadTail)
			System.out.println("true");
		else 
			System.out.println("false");
	}

}
