package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=34343;
		int temp=num;
		int sum=0,n;
		while(num>0)
		{
			n=num%10;
			sum=sum*10+n;
			num=num/10;
			
			
		}
		if(temp==sum)
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not Palindrome");
		}
		
		
	}

}
