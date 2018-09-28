package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] n = new int[N];
		int[] a = new int[M];
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
		a[0] = 1;
		a[1] = 2;
		for (i = 0;i < m;i++)
		{
			double sum = 0.0;
			for (j = 1;j <= n[i];j++)
			{
				a[j + 1] = a[j] + a[j - 1];
				sum += 1.0 * a[j] / a[j - 1];
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

