
public class Candidate {
	private double social, algorithm, gpa, age;
	private int y;
	private double distance;
	
	public Candidate(double social, double algorithm, double gpa, double age, int y) {
		this.social=social;
		this.algorithm=algorithm;
		this.gpa=gpa;
		this.age=age;
		this.y=y;
		distance = 0.0;
	}
	
	public Candidate(double social, double algorithm, double gpa, double age) {
		this.social=social;
		this.algorithm=algorithm;
		this.gpa=gpa;
		this.age=age;
	}

	public double getSocial() {
		return social;
	}

	public void setSocial(double social) {
		this.social = social;
	}

	public double getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(double algorithm) {
		this.algorithm = algorithm;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getDistance() {
		return (Double) distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
