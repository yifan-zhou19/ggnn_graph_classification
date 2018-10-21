package <missing>;

public class GlobalMembers
{
	public static int T;
	public static int n;

	public static int calc(int n, int min)
	{
		if (n == 1)
		{
			return 1;
		}
		if (n <= min)
		{
			return 0;
		}
		int re = 0;
		for (int i = min + 1; i <= n; i++)
		{
			if (n % i == 0)
			{
				//printf("calc %d,%d += calc %d,%d\n",n,min,n/i,i);
				re += calc(n / i, i - 1);
			}
		}
		if (re == 0)
		{
			re = 1;
		}
		//printf("calc %d,%d=%d\n", n, min, re);
		return re;
	}

	public static int Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			T = Integer.parseInt(tempVar);
		}
		while (T-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n", calc(n, 1));
		}
		return 0;
	}
}

