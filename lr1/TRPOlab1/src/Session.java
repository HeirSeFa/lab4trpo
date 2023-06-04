public class Session {
	private int math, pe, english, oop, trpo;
	
	public Session(int math, int pe, int english, int oop, int trpo) {
		this.math = math;
		this.pe = pe;
		this.english = english;
		this.oop = oop;
		this.trpo = trpo;
	}
	
	public Session(int[] scores) {
		math = scores[0];
		pe = scores[1];
		english = scores[2];
		oop = scores[3];
		trpo = scores[4];
	}
	
	public float GetAverageSessionScore() {
		return (math + pe + english + oop + trpo) / 5f;
	}
}
