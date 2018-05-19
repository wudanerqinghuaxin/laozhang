public class paixu{
	public static void main(String[] agrs){
		int[] arr = {12,52,63,84,75,9,24,31,85,24};
		for(int i = 0;i <arr.length;i++){
			for(int j = i;j< arr.length ;j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i : arr){
			System.out.print(i + "  ");
		}
	}
}
