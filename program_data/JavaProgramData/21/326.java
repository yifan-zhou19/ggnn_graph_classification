package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int s = 0;
		int i;
		int j;
		int[] a = new int[300];
		double[] b = new double[300];
		double[] c = new double[300];
		double ave;
		double t;
		double p;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			s = s + a[i];
		}
		ave = (double)s / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > ave)
			{
				b[i] = a[i] - ave;
				c[i] = ave - a[i];
			}

			else
			{
				b[i] = ave - a[i];
				c[i] = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					p = c[j];
					b[j] = b[j + 1];
					c[j] = c[j + 1];
					b[j + 1] = t;
					c[j + 1] = p;
				}
			}
		}
		if (c[0] > 0)
		{
			k = ave - b[0];
		}
		else
		{
			k = ave + b[0];
		}
		System.out.printf("%.0f",k);
			i = 1;
			while (b[i] == b[0])
			{
				if (c[i] > 0)
				{
				  k = ave - b[i];
				}
				else
				{
				  k = ave + b[i];
				}
				System.out.printf(",%.0f",k);
				i++;
			}

	}
}

