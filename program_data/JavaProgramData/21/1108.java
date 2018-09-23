package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int n;
		int t;
		int[] b = new int[300];
		double aver;
		double c;
		double max;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			sum = sum + a[i];
		}
		aver = sum / n;
			max = Math.abs(a[0] - aver);
		for (i = 0;i <= n - 1;i++)
		{
		c = Math.abs(a[i] - aver);
		if (c > max)
		{
			max = c;
		}
		}
		for (i = 0,j = 0;i <= n - 1;i++)
		{
			c = Math.abs(a[i] - aver);
			if ((max - c) < 1e-6)
			{
			b[j] = a[i];
			j++;
			}
		}
		for (k = 0;k < j;k++)
		{
			for (i = 0;i < j - k - 1;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < j;i++)
		{
					System.out.printf(",%d",b[i]);
		}
				return 0;
	}
}

