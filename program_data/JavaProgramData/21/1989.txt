package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int[] a = new int[300];
		int sum = 0;
		double t;
		double[] b = new double[300];
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
			sum = sum + a[i];
		}
			t = 1.0 * sum / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (j = 0;j < n;j++)
		{
			if (a[j] >= t)
			{
				b[j] = a[j] - t;
			}
			else
			{
				b[j] = t - a[j];
			}
			 max = b[0];
			if (b[j] >= max)
			{
				max = b[j];
			}
			else if (b[j] < max)
			{
				max = b[0];
			}

		}
		int mm = 0;
		for (j = 0;j < n;j++)
		{

			if (max == b[j])
			{
				if (mm == 0)
				{
					System.out.printf("%d",a[j]);
				}
				else
				{
					System.out.printf(",%d",a[j]);
				}
				mm++;
			}
		}

			return 0;
	}

}

