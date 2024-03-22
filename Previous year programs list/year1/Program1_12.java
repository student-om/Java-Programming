class Program1_12{
	public static void main(String args[]){
	int arr[] = {32,21,45,56,98,22,89};
	int largest=arr[0];
	for(int i=0;i<arr.length;i++){
	if(arr[i]>=largest){
	largest = arr[i];
	}
	}
	System.out.printf("largest element in array is %d\n",largest);
	
	}
}

