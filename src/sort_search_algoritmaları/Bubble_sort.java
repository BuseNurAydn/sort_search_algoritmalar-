package sort_search_algoritmalar�;

public class Bubble_sort {
	public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {                
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

	public static void main(String[] args) {
		
		Bubble_sort sort=new Bubble_sort();
	
		int[]arr = {1,2,3,4,5};
		
		sort.bubbleSort(arr);

	
}
}