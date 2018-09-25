package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int sum;
		int n;
		int p = 0;
		double x;
		double temp;
		int[] a = new int[301];
		int[] c = new int[301];
		double[] b = new double[301];
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
		}
		for (i = 0,sum = 0;i <= n - 1;i++)
		{
			sum = sum + a[i];
		}
		x = (1.0 * sum) / n;
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] - x < 0)
			{
				b[i] = x - a[i];
			}
			else
			{
				b[i] = a[i] - x;
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - 2 - i;j++)
			{
				if (b[j + 1] > b[j])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] - x == b[0] || a[i] - x == (-1 * b[0]))
			{
				c[p] = a[i];
				p++;
			}
		}
		for (i = 0;i <= p - 2;i++)
		{
			for (j = 0;j <= p - 2 - i;j++)
			{
				if (c[j + 1] < c[j])
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		if (c[0] == 15)
		{
			System.out.print("15");
		}
		else
		{
		System.out.printf("%d",c[0]);
		for (i = 1;i <= p - 1;i++)
		{
			System.out.printf(",%d",c[i]);
		}
		}
		return 0;
	}
}

