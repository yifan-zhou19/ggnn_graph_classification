package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[100];
		double c;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[1] = 1;
		a[2] = 2;
		for (i = 3;i < 100;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				c = c + (double)a[j + 1] / a[j];
			}
			System.out.printf("%.3lf\n",c);
	c = 0;
		}
		return 0;
	}

}

