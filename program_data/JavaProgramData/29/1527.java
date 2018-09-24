package <missing>;

public class GlobalMembers
{
	public static int fb(int a)
	{
		int[] f = new int[10000];
		f[1] = 1;
		f[2] = 2;
		int i;
		for (i = 3;i <= a;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[a];
	}
	public static int Main()
	{
		int m;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int n;
		int k;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (k = 1;k <= n;k++)
			{
				sum += 1.0 * fb(k + 1) / fb(k);
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0.0;
		}
		return 0;
	}


}

