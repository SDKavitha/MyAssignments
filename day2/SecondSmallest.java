package week1.day2;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,67,32,89,22};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j+1])
				{
					temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The smallest number is:"+arr[1]);

	}

}
