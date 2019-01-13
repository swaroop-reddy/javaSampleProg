class MergeSort{
	public static void main(String[] arg){
		int[] ipArray = {2,4,6,1,5,1,2,33,44,77,20,0};
		System.out.println("Before Merge Sort\n"+java.util.Arrays.toString(ipArray));
		mergeSort(ipArray,0,ipArray.length-1);
		System.out.println("After Merge Sort\n"+java.util.Arrays.toString(ipArray));
	}
	private static void mergeSort(int[] ipArray, int startIndex, int endIndex){
		if(startIndex<endIndex){
			int midIndex  = (startIndex+endIndex)/2;
			mergeSort(ipArray,startIndex,midIndex);
			mergeSort(ipArray,midIndex+1,endIndex);
			merge(ipArray,startIndex,midIndex,endIndex);
		}
	}
	private static void merge(int arr[], int l, int m, int r){ 
		int n1 = m - l + 1; 
		int n2 =r-m;
		int[] left = new int[n1];
		int[] right = new int[n2];
		int temp=0;
		for(int i= l;i<=m;i++){
			left[temp] = arr[i];temp++;
		}
		temp = 0;
		for(int i= m+1;i<=r;i++){
			right[temp] = arr[i];temp++;
		}
		int i=0;
		int j=0,k=l;
		while(i<n1 && j <n2){
			if(left[i]<right[j]){
				arr[k] = left[i];i++;
			}else{
				arr[k] = right[j];j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = left[i];i++;k++;
		}
		while(j<n2){
			arr[k] = right[j];j++;k++;
		}
	}
}
