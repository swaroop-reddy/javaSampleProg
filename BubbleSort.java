import static java.lang.System.out;

class BubbleSort{

	public static void main(String[] args){
		int[] nums = {23,56,74,12,01,3,9};
		out.println("Array Before Bubble Sort..\n\n");
		out.println(java.util.Arrays.toString(nums)+"\n");
		for(int i = nums.length-1;i>0;i--)
			for(int j=1; j<=i;j++){
				if(nums[j-1]>nums[j]){
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		out.println("Arraay After Bubble Sort..\n\n");
		out.println(java.util.Arrays.toString(nums));
	}
}
