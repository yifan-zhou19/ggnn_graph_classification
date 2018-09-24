package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
		return 0;
	}

	public static int f(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			return 0;
		} //n==1??
		if (n % 2 == 1)
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
				   n = n * 3 + 1;
		}
		else
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			  n = n / 2;
		}
		f(n); //????

	}

}

