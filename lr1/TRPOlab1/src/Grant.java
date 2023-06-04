public class Grant {
	private float GrantCoef;
	
	public Grant(float averageScore) {
		SetGrantCoef(averageScore);
	}
	
	private void SetGrantCoef(float averageScore) {
		if (averageScore < 5) {
			GrantCoef = 0;
		}
		else if (averageScore < 6) {
			GrantCoef = 1;
		}
		else if(averageScore < 8) {
			GrantCoef = 1.25f;
		}
		else {
			GrantCoef = 1.5f;
		}
	}
	
	public String GetGrantCoef() {
		return Float.toString(GrantCoef);
	}
}
