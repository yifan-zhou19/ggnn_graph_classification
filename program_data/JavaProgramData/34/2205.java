package <missing>;

public class GlobalMembers
{
	//*****************************
	//*????????           *
	//*?  ????  1100062709   *
	//*???2011 .11 .15         *
	//*****************************
	public static int f(int number) //?????
	{
		int n;
		if (number == 1) //????????1 ????????
		{
				System.out.print("End");
				System.out.print("\n");
				return 0;
		}
		else
		{
			if (number % 2 == 0) //????????
			{
				   n = number / 2;
				   System.out.print(number);
				   System.out.print("/2");
				   System.out.print("=");
				   System.out.print(n);
				   System.out.print("\n");
				   number = n; //?n???number
			}
			else
			{
				n = 3 * number + 1; //????????
				System.out.print(number);
				System.out.print("*3+1=");
				System.out.print(n);
				System.out.print("\n");
				number = n;
			}
			return f(number); //??????
		}
	}
	public static int Main() //?????
	{
		int number;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(number); //??????
		return 0; //?????
	}

}

