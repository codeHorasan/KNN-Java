public class HeapSort { 
	public void sort(Candidate[] arr) { 
		int n = arr.length; 
		
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i); 
	
		for (int i=n-1; i>=0; i--) { 
			Candidate temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 

			heapify(arr, i, 0); 
			}	 
	} 

	void heapify(Candidate[] arr, int n, int i) { 
		int largest = i; 
		int l = 2*i + 1; 
		int r = 2*i + 2; 

		if (l < n && arr[l].getDistance() > arr[largest].getDistance()) 
			largest = l; 

		if (r < n && arr[r].getDistance() > arr[largest].getDistance()) 
			largest = r; 

		if (largest != i) { 
			Candidate swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			heapify(arr, n, largest); 
		} 
	}
} 
