package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] sg = new double[40];
		double[] male = new double[40];
		double[] female = new double[40];
		double e;
		char[][] xb = new char[40][7];
		int n;
		int i;
		int j;
		int l;
		int k;
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
				xb[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
		}
		j = 0;
		k = 0;
		int result;
		for (i = 0;i < n;i++)
		{
			result = strcmp(xb[i],"male");
			if (result == 0)
			{
				male[j] = sg[i];
				j++;
			}
			else
			{
				female[k] = sg[i];
				k++;
			}
		}
		for (l = 1;l <= j;l++)
		{
			for (i = 0;i < j - l;i++)
			{
				if (male[i] > male[i + 1])
				{
					e = male[i + 1];
					male[i + 1] = male[i];
					male[i] = e;
				}
			}
		}
		for (l = 1;l <= k;l++)
		{
			for (i = 0;i < k - l;i++)
			{
				if (female[i] < female[i + 1])
				{
					e = female[i + 1];
					female[i + 1] = female[i];
					female[i] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2lf ",female[i]);
		}
		System.out.printf("%.2lf",female[k - 1]);
	return 0;
	}
}

