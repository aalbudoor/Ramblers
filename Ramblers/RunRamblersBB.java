
public class RunRamblersBB {


	public static void main(String[] args) {
		
		TerrainMap tmap = new TerrainMap("/Users/aalbudoor/git/Ramblers/Ramblers/tmc.pgm");
		
		RamblerState init = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),0,0);
		RamblerState goal = new RamblerState(tmap.getTmap(),tmap.getDepth(),tmap.getWidth(),10,6);
		RamblersSearch s = new RamblersSearch(init,goal);
		s.runSearch("branchAndBound");
		//s.runSearch("breadthFirst");
	}

}
