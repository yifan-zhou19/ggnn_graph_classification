package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] num = new double[300];
		double e;
		double c = 0;
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
				num[i] = Double.parseDouble(tempVar2);
			}
			c += num[i];
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (num[j] > num[j + 1])
				{
					e = num[j];
					num[j] = num[j + 1];
					num[j + 1] = e;
				}
			}
		}
		if ((c / n - num[0]) == (num[n - 1] - c / n))
		{
			System.out.printf("%.0lf,%.0lf\n",num[0],num[n - 1]);
		}
		else if ((c / n - num[0]) > (num[n - 1] - c / n))
		{
			System.out.printf("%.0lf\n",num[0]);
		}
		else if ((c / n - num[0]) < (num[n - 1] - c / n))
		{
			System.out.printf("%.0lf\n",num[n - 1]);
		}
		return 0;
	}

}

