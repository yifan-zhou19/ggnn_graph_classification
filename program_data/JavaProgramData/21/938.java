package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int m;
		int num;
		int n;
		double ave;
		double min;
		double[] b = new double[300];
		double sum = 0;
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
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			if ((ave - a[i]) > 0 || (ave - a[i]) == 0)
			{
			b[i] = ave - a[i];
			}
			else
			{
				b[i] = -ave + a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (b[j] > b[j - 1])
				{
					num = a[j];
					a[j] = a[j - 1];
					a[j - 1] = num;
					min = b[j - 1];
					b[j - 1] = b[j];
					b[j] = min;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (b[i] != b[i - 1])
			{
				break;
			}
		}
		if (i > 1)
		{
		for (j = 0;j < i;j++)
		{
			for (m = i - 1;m > j;m--)
			{
				if (a[m] < a[m - 1])
				{
					num = a[m];
					a[m] = a[m - 1];
					a[m - 1] = num;
				}
			}
		}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d",a[j]);
			if (j != i - 1)
			{
				System.out.print(",");
			}
		}
		return 0;
	}







}

