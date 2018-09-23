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
		int n;
		int m;
		int j;
		int re;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			re = factor(m, 2);
			System.out.printf("%d\n",re);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

