package <missing>;

public class GlobalMembers
{
	public static int prime(int k)
	{
		if (k == 2)
		{
			return 1;
		}
		for (int i = 2;i <= k / 2;i++)
		{
		if (k % i == 0)
		{
			return 0;
		}
		}
		return 1;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 2;i <= n / 2;i++)
		{
		   if (prime(i) != 0 && prime(n - i) != 0)
		   {
			   System.out.print(i);
			   System.out.print(' ');
			   System.out.print(n - i);
			   System.out.print("\n");
		   }
		}

	}

}

