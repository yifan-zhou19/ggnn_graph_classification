package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int Main()
	{
		void count(int a,int b);
		int r;
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		for (i = 0;i < r;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (k = 2;k <= Math.sqrt(n);k++)
			{
				if (n % k == 0)
				{
					m++;
					count(k, n / k);
				}
			}
			System.out.printf("%d\n",m + 1);
			m = 0;
		}
	}

	public static void count(int a,int b)
	{
		int j;
		double t = Math.sqrt(b);
		for (j = a;j <= t;j++)
		{
			if (b % j == 0)
			{
				m++;
				count(j, b / j);
			}
		}
	}

}

