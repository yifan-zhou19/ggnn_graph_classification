package <missing>;

public class GlobalMembers
{
	public static int num(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n % 2 == 0)
		{
			 System.out.printf("%d/2=%d\n",n,n / 2);
			 num(n / 2);
		}
		else
		{
			 System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
			 num(n * 3 + 1);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num(n);
		System.out.print("End");
		return 0;
	}

}

