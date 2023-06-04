public class Student {
	private Session session;
	private boolean sessionOnTime, stateEmployee;
	private String name;
	private Grant grant;
	
	public Student(int[] scores, boolean sessionOnTime, boolean stateEmployee, String name) {
		session = new Session(scores);
		this.sessionOnTime = sessionOnTime;
		this.stateEmployee = stateEmployee;
		this.name = name;
		grant = new Grant(session.GetAverageSessionScore());
	}
	
	public float GetAverageSessionScore() {
		return session.GetAverageSessionScore();
	}
	
	public boolean GetSessionOnTime() {
		return sessionOnTime;
	}
	
	public boolean GetStateEmployee() {
		return stateEmployee;
	}
	
	public String GetAllInfo() {
		return Float.toString(session.GetAverageSessionScore()) + " " + Boolean.toString(sessionOnTime) + " " + 
									  Boolean.toString(stateEmployee) + " " + name + " " + grant.GetGrantCoef();
	}
	
}
