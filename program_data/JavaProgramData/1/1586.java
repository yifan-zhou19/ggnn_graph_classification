package <missing>;

public class GlobalMembers
{
	public static int factor(int n,int min)
	{
		int result = 1;
		int i;

		if (n < min)
		{
			return 0;
		}

		for (i = min; i < n; i++)
		{
			if (n % i == 0)
			{
			   result += factor(n / i, i);
			}
		}

		return result;
	}
	public static int Main()
	{
		int m;
		int x;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (j = 1;j <= m; j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}

			k = factor(x, 2);

			System.out.printf("%d\n", k);
		}

		return 0;
	}
}

