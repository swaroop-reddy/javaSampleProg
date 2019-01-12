public class QuickSort{
	public static void main(String arg[]){
		int[] ipArray = {2,4,6,1,2,3,0,77,1,99,22};
		System.out.println("ipArrays Before Quick Sort");
		System.out.println(java.util.ipArrays.toString(ipArray));
		quickSort(ipArray,0,ipArray.length-1);
		System.out.println("ipArrays After Quick Sort");
		System.out.println(java.util.ipArrays.toString(ipArray));
	}
	private static void quickSort(int[] ipArray,int startIndex, int endIndex){
		if(startIndex<endIndex){
			int partitionIndex = performPartition(ipArray,startIndex,endIndex);
			quickSort(ipArray,startIndex,partitionIndex-1);
			quickSort(ipArray,partitionIndex+1,endIndex);
		}
	}
	// makes sure that the elements left to partitionIndex is lessthan the element at partitionIndex
	// and elements right to partitionIndex is greaterthan the element at partitionIndex
	private static int performPartition(int[] ipArray,int startIndex,int endIndex){
		int pivot = ipArray[endIndex];
		int partitionIndex = startIndex;
		for(int i=startIndex;i<endIndex;i++){
			if(ipArray[i]<=pivot){
				if(partitionIndex != i){
					int temp = ipArray[partitionIndex];
					ipArray[partitionIndex] = ipArray[i];
					ipArray[i] = temp;
				}
				++partitionIndex;
			}
		}
		if(partitionIndex != endIndex){
			int temp = ipArray[endIndex];
			ipArray[endIndex] = ipArray[partitionIndex];
			ipArray[partitionIndex] = temp;
		}
		return partitionIndex;
	}
}
