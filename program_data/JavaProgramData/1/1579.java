package <missing>;

public class GlobalMembers
{
	public static int factor(int N, int min)
	{
		int result = 1;
		int i;
		if (N < min)
		{
		return 0;
		}
		for (i = min;i < N;i++)
		{
			if (N % i == 0)
			{
			result += factor(N / i, i);
			}
		}
		return result;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			k = factor(m, 2);
			System.out.printf("%d\n",k);
		}

		return 0;
	}

}

