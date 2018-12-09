import static java.lang.System.out;
class SelectionSort{
	public static void main(String[] arg){
		int[] nums = {23,56,74,12,01,3,9};
		out.println("Before Selection Sort..\n\n");
		out.println(java.util.Arrays.toString(nums)+"\n");
		for(int i = 0;i<nums.length;i++)
			for(int j=i; j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		out.println("After Selection Sort..\n\n");
		out.println(java.util.Arrays.toString(nums));
	}
}
