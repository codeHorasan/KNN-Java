import edu.princeton.cs.algs4.In;

public class Main {
	public static void main(String[] args) {
		In in = new In("Proje.txt");
		String[] applicants = in.readAllLines();
		Candidate[] candidates = new Candidate[applicants.length - 1];
		
		for(int i=0; i<candidates.length; i++) {
			String[] temp = applicants[i+1].split(",");
			candidates[i] = new Candidate(Double.parseDouble(temp[0]), Double.parseDouble(temp[1]),
					Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]));
		}
	
		Candidate c1 = new Candidate(candidates[0].getSocial(), candidates[0].getAlgorithm(), candidates[0].getGpa(), candidates[0].getAge());
		Candidate c2 = new Candidate(candidates[100].getSocial(), candidates[100].getAlgorithm(), candidates[100].getGpa(), candidates[100].getAge());
		System.out.println(applicantResult(candidates, c1, 5));
		System.out.println(applicantResult(candidates, c2, 5));
		
	}
	
	public static String applicantResult(Candidate[] candidates, Candidate applicant, int k) {
		String result = "";
		double total = 0.0;
		setEuclidDistances(candidates, applicant);
		HeapSort heapSort = new HeapSort();
		heapSort.sort(candidates);
		
		for(int i=0; i<k; i++) {
			total = total + candidates[i].getY();
		}
		
		if(total > (k - total)) 
			result = "Accepted!";
		else {
			result = "Rejected!";
		}

		return result;
	}
	
	public static double euclid(Candidate employee , Candidate applicant) {
		double sum = 0.0;
		
		sum = Math.pow((employee.getSocial() - applicant.getSocial()), 2) 
		+  Math.pow((employee.getAlgorithm() - applicant.getAlgorithm()), 2) 
		+  Math.pow((employee.getGpa() - applicant.getGpa()), 2) +  Math.pow((employee.getAge() - applicant.getAge()), 2);
		
		return Math.sqrt(sum);
	}
	
	public static void setEuclidDistances(Candidate[] array, Candidate applicant) {
		for(int i=0; i<array.length; i++) {
			array[i].setDistance(euclid(array[i], applicant));
		}
	}
	
}
