package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=-40;
		int posnum;
		if(num<0)
		{
			posnum=Math.abs(num);
			System.out.println("The number"+num+"is converted to"+posnum);
		}
		else
		{
			System.out.println("Given number is positive");
		}

	}

}
