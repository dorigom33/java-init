package p08;

public class RemoconExec {
	
	public static void main(String[] args) {
		Remote[] remotes = new Remote[2];
		remotes[0] = new AirconRemocon();
		remotes[1] = new TvRemocon();
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof AirconRemocon) {
				AirconRemocon ar = (AirconRemocon)remotes[i];
				ar.tempUp();
				ar.tempDown();
			}
			if(remotes[i] instanceof TvRemocon) {
				TvRemocon tv = (TvRemocon)remotes[i];
				tv.chUp();
				tv.chDown();
			}
			remotes[i].off();
			
		}
	}
}
