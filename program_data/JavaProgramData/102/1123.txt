package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		int i;
		int f = 0;
		int m = 0;
		String c = new String(new char[7]);
		double high;
		double[] mh = new double[40];
		double[] nh = new double[40];
		for (i = 0;i < num;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			high = Double.parseDouble(tempVar3);
		}
		if (strcmp(c,"male") == 0)
		{
		m = m + 1;
		mh[m - 1] = high;
		}
		else
		{
		f = f + 1;
		nh[f - 1] = high;
		}
		}
		int j;
		double max;
		for (i = 1;i <= m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (mh[j] > mh[j + 1])
				{
				max = mh[j];
				mh[j] = mh[j + 1];
				mh[j + 1] = max;
				}
			}
		}
		for (i = 1;i <= f;i++)
		{
			for (j = 0;j < f - i;j++)
			{
				if (nh[j] < nh[j + 1])
				{
				max = nh[j];
				nh[j] = nh[j + 1];
				nh[j + 1] = max;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%.2lf ",mh[i]);
		}
		System.out.printf("%.2lf",nh[0]);
		for (i = 1;i < f;i++)
		{
		System.out.printf(" %.2lf",nh[i]);
		}

	return 0;
	}

}

