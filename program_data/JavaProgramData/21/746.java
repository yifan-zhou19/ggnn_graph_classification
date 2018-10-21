package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[500];
		int t = 0;
		int p;
		double aver = 0;
		double[] b = new double[500];
		double max;
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
			aver += a[i];
		}
		aver /= n;

		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - aver);
		}
		max = b[0];
		p = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				p = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((max - b[i]) < (1e-9))
			{
				t++;
				if (t == 1)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.print(",");
					System.out.printf("%d",a[i]);
				}
			}
		}
			return 0;
	}




}

