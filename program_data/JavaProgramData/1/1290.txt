package <missing>;

public class GlobalMembers
{
	public static int factorize(int n,int j)
	{
		int F = 1;
		for (;j <= Math.sqrt(n);j++)
		{
			if (n % j == 0)
			{
				F += factorize(n / j, j);
			}
		}
		return F;
	}
	public static int Main()
	{
		int i;
		int m;
		int[] n = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",factorize(n[i], 2));
		}
		return 0;
	}
}

