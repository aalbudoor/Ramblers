
public class RunRamblersAstar {
	
	public static void testSet1()
	{
		System.out.println("On Diablo Initial State: (0,0), Goal State: (25,22)");
		TerrainMap tmap = new TerrainMap("/Users/aalbudoor/Downloads/COM1005_Assignment_2021/code/search3/diablo.pgm");
		RamblerState goal = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),25,22);
		RamblerState init = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),0,0,goal);
		
		RamblersSearch s = new RamblersSearch(init,goal);
		s.runSearch("A Star");
	}
	
	public static void testSet2()
	{
		System.out.println("On Diablo Initial State: (10,2), Goal State: (50,45)");
		TerrainMap tmap = new TerrainMap("/Users/aalbudoor/Downloads/COM1005_Assignment_2021/code/search3/diablo.pgm");
		RamblerState goal = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),50,45);
		RamblerState init = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),10,2,goal);
		
		RamblersSearch s = new RamblersSearch(init,goal);
		s.runSearch("A Star");
	}
	
	public static void testSet3()
	{
		System.out.println("On tmc.pgm Initial State: (10,2), Goal State: (50,45)");
		TerrainMap tmap = new TerrainMap("/Users/aalbudoor/git/Ramblers/Ramblers/tmc.pgm");
		RamblerState goal = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),5,4);
		RamblerState init = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),10,2,goal);
		
		RamblersSearch s = new RamblersSearch(init,goal);
		s.runSearch("A Star");
	}

	public static void main(String[] args) {
		
		//testSet1();
		testSet1();
		
	}

}
