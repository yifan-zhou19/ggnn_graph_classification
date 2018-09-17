package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void divide(int n,int a)
	{
		for (int i = a;i <= n;i++)
		{
			if ((n % i == 0))
			{
				if (n / i == 1)
				{
					sum++;
				}
				else
				{
					divide(n / i, i);
				}
			}
		}
	}
	public static int Main()
	{
		int N = 0;
		int n = 0;
		int i = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			divide(n, 2);
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

