package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 2;
		}
		else
		{
			return f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] sz = new int[1000];
		 for (i = 0;i < n;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		 }
		for (i = 0;i < n;i++)
		{
			double sum = 0;
			for (j = 1;j <= sz[i];j++)
			{
				sum += f(j + 1) / f(j);
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}

}

