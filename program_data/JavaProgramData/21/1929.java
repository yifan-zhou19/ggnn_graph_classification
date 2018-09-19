package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 1;
		int sum = 0;
		int i;
		int j;
		int temp;
		int k;
		double aver;
		double temp2;
		double[] dis = new double[300];
		int[] a = new int[300];
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
			sum = sum + a[i];
		}
		aver = (double)sum / n;
		for (i = 0;i < n;i++)
		{
					if (a[i] > aver)
					{
			dis[i] = a[i] - aver;
					}
					else
					{
			dis[i] = aver - a[i];
					}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (dis[i] > dis[i + 1])
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					temp2 = dis[i];
					dis[i] = dis[i + 1];
					dis[i + 1] = temp2;
				}
			}
		}
		for (i = n - 2;i > 0;i--)
		{
			if (dis[i] == dis[n - 1])
			{
				count++;
			}
		}
	k = 0;
			for (i = n - 1;i > n - count;i--,k++)
			{
			for (j = n - 1;j > n - count + k;j--)
			{
				if (a[i] > a[i - 1])
				{
					temp = a[i];
				}
					a[i] = a[i - 1];
					a[i - 1] = temp;
			}
			}
	if (count >= 2)
	{
		for (i = n - 1;i >= n - count + 1;i--)
		{
			System.out.printf("%d,", a[i]);
		}
			System.out.printf("%d", a[n - count]);
	}
	else
	{
		System.out.printf("%d", a[n - count]);
	}
	}
}

