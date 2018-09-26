package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int odd = int x;
		int even = int y; //????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			if (n % 2 == 0)
			{
			   n = even(n);
			} //??????
		else
		{
			   n = odd(n);
		} //??????
		}
		System.out.print("End");
		return 0;

	}

	public static int odd(int x) //????
	{
		int y;
	  y = 3 * x + 1;
	  System.out.print(x);
	  System.out.print("*3+1=");
	  System.out.print(y);
	  System.out.print("\n");
	  return y;
	}

	public static int even(int x) //????
	{
		int y;
	  y = x / 2;
	  System.out.print(x);
	  System.out.print("/2=");
	  System.out.print(y);
	  System.out.print("\n");
	  return y;
	}
}

