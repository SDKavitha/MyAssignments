package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			//System.out.println("***");
			int var=num%i;
			if(var==0)
			{
			flag=true;
			}
			break;
		}
		if(flag==true)
		{
			System.out.println("This is not a prime");
		}
		else
		{
			System.out.println("This is prime");
		}

	}

}
