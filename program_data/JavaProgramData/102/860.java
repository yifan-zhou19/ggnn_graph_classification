package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int f = 0;
		double[] sz = new double[40];
		double[] male = new double[40];
		double[] female = new double[40];
		char[][] sex = new char[40][10];
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex[i],"male") == 0)
			{
				male[m] = sz[i];
				m++;
			}
			else
			{
				female[f] = sz[i];
				f++;
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					double c;
					c = male[j];
					male[j] = male[j + 1];
					male[j + 1] = c;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}


		for (i = 1;i < f;i++)
		{
			for (j = 0;j < f - i;j++)
			{
				if (female[j] < female[j + 1])
				{
					double d;
					d = female[j];
					female[j] = female[j + 1];
					female[j + 1] = d;
				}
			}
		}
		for (i = 0;i < f;i++)
		{
			if (i == f - 1)
			{
				System.out.printf("%.2lf",female[i]);
			}
			else
			{
				System.out.printf("%.2lf ",female[i]);
			}
		}
		return 0;
	}
}

