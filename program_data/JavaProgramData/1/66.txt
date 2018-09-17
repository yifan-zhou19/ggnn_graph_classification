package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int A;

	public static int acSearch(int n, int i)
	{
		int ret = 0;

		if (n == 1)
		{
			ret = 1;
		}
		else
		{
			for (; i <= n; ++i)
			{
			if (n % i == 0)
			{
				ret += acSearch(n / i, i);
			}
			}
		}

		return ret;
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (; N--;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n", acSearch(A, 2));
		}
		return 0;
	}

}

