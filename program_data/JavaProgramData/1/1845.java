package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void recur(int N,int i)
	{
		if (N == 1)
		{
			sum++;
		}
		while (i <= N)
		{
			if (N % i == 0)
			{
				recur(N / i, i);
			}
			i++;
		}
		return;
	}
	public static int Main()
	{
		int t = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0; k < t; k++)
		{
			int n = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int i = 2;
			int res = 1;
			for (int i = 2; i <= n / 2;i++)
			{
				if (n % i == 0)
				{
					sum = 0;
					recur(n / i, i);
					res += sum;
				}
			}
			System.out.print(res);
			System.out.print("\n");
		}
		return 0;
	}

}

