import static java.lang.System.out;
class InsertionSort{

	public static void main(String[] arg){
		int[] nums = {23,84,74,12,01,3,9};
		out.println("Array Before Insertion Sort..\n\n");
		out.println(java.util.Arrays.toString(nums)+"\n");
		insertionSort(nums);
		out.println("Arraay After Insertion Sort..\n\n");
		out.println(java.util.Arrays.toString(nums));
	}
  
	private static void insertionSort(int[] arr){
		for(int i=1; i< arr.length;i++){
			if(arr[i-1]> arr[i]){
				int temp = arr[i];
				int j = i-1;
				while(j>=0 && arr[j]>temp){
					arr[j+1] = arr[j];
					--j;
				}
				arr[j+1] = temp;
			}
		}
	}
  
	/*private static void insertionSort(int nums[]){
        for(int i = 1 ;i<nums.length;i++)
			if(nums[i-1]> nums[i]){
				int holeIndex = i;
				while(holeIndex-1 >= 0 && nums[holeIndex-1]> nums[i]){
					--holeIndex;
				}
				int num = nums[i];
				while(holeIndex<=i){
					int temp = nums[holeIndex];
					nums[holeIndex] = num;
					num = temp;
					++holeIndex;
				}
			} 
    }*/
}
