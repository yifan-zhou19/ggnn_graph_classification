package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void fenjie(int t,int n)
	{
		int i = 0;
		if (n == 1)
		{
			sum++;
		}
		for (i = t; i <= n; i++)
		{
			if (n % i == 0)
			{
				fenjie(i, n / i);
			}
		}
	}
	public static int Main()
	{
		int n = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 sum = 0;
			 fenjie(2, k);
			 n--;
			 System.out.print(sum);
			 System.out.print("\n");
		}
		return 0;
	}
}

