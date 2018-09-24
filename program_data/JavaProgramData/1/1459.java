package <missing>;

public class GlobalMembers
{
	public static int cal(int M, int N)
	{
		int i;
		int num = 0;
		if (M == 1)
		{
			return 0;
		}
		if (N >= M)
		{
			return (1 + cal(M, M - 1));
		}
		for (i = 2;i < M;i++)
		{
			if (M % i == 0 && i <= N)
			{
				num = num + cal(M / i, i);
			}
		}
		return num;
	}
	public static int Main()
	{
		int n;
		int M;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(cal(M, M));
			System.out.print("\n");
		}
		return 0;
	}


}

