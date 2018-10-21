package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[301];
		int sum = 0;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		for (j = 1; j < n; j++)
		{
			for (i = 1; i <= n - j; i++)
			{
				if (a[i] > a[i + 1])
				{
					p = a[i];
					a[i] = a[i + 1];
					a[i + 1] = p;
				}
			}
		}
		int[] g = new int[301];
		int[] num = new int[301];
		double sum1;
		double aver;
		double[] b = new double[301];
		double q = 0;
		sum1 = sum;
		aver = sum1 / n;
		for (i = 1; i <= n; i++)
		{
			if (a[i] - aver < 0)
			{
				b[i] = aver - a[i];
			}
			else
			{
				b[i] = a[i] - aver;
			}
			if (b[i] > q)
			{
				q = b[i];
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (b[i] == q)
			{
				num [i] = i;
			}
		}
		q = 1;
		for (i = 1; i <= n; i++)
		{
			if (num[i] == 0)
			{
				continue;
			}
			else
			{
				g[i] = q;
				q++;
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (num[i] == 0)
			{
				continue;
			}
			else
			{
				if (g[i] == 1)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}




}

