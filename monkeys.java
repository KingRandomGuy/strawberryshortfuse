public class monkeys {
	public static void main(String[] args){
		int p1W=0;
		int p2W=0;
		int p3W=0;
		int p4W=0;
		for(int i=0; i<10000000; i++){
			int numCakes=5;
			int numBombs=5;
			boolean p1=true;
			boolean p2=true;
			boolean p3=true;
			boolean p4=true;
			while((p1||p2||p3||p4)){
				double chance = ((double)(numCakes))/(numCakes+numBombs);
				if(p1){
					if(!p2&&!p3&&!p4){
						System.out.println("p1 wins");
						p1W++;
						break;
					}
					double rand = Math.random();
					if(rand>chance){
						p1=false;
						numBombs--;
					}
					else if(numCakes>0){
						numCakes--;
					}
					else{
						numCakes=5;
						numBombs=5;
						chance = ((double)(numCakes))/(numCakes+numBombs);
					}
				}
				if(p2){
					if(!p1&&!p3&&!p4){
						System.out.println("p2 wins");
						p2W++;
						break;
					}
					double rand = Math.random();
					if(rand>chance){
						p2=false;
						numBombs--;
					}
					else if(numCakes>0){
						numCakes--;
					}
					else{
						numCakes=5;
						numBombs=5;
						chance = ((double)(numCakes))/(numCakes+numBombs);
					}
				}
				if(p3){
					if(!p2&&!p1&&!p4){
						System.out.println("p3 wins");
						p3W++;
						break;
					}
					double rand = Math.random();
					if(rand>chance){
						p3=false;
						numBombs--;
					}
					else if(numCakes>0){
						numCakes--;
					}
					else{
						numCakes=5;
						numBombs=5;
						chance = ((double)(numCakes))/(numCakes+numBombs);
					}
				}
				if(p4){
					if(!p1&&!p3&&!p2){
						System.out.println("p4 wins");
						p4W++;
						break;
					}
					double rand = Math.random();
					if(rand>chance){
						p4=false;
						numBombs--;
					}
					else if(numCakes>0){
						numCakes--;
					}
					else{
						numCakes=5;
						numBombs=5;
						chance = ((double)(numCakes))/(numCakes+numBombs);
					}
				}
			}
		}
		int total = p1W+p2W+p3W+p4W;
		System.out.println(p1W + ", " + p2W + ", " + p3W + ", " + p4W);
		System.out.println(p1W/((double)total) + ", " + p2W/((double)total) + ", " + p3W/((double)total) + ", " + p4W/((double)total));
	}
}
