package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] male = new double[40];
		double[] female = new double[40];
		String sex = new String(new char[10]);
		int i;
		int j;
		int n;
		int m = 0;
		int f = 0;
		double h;
		double t;
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
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
			   male[m] = h;
			   m++;
			}
			else
			{
			   female[f] = h;
			   f++;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					t = male[j];
					male[j] = male[j + 1];
					male[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= f;i++)
		{
			for (j = 0;j < f - i;j++)
			{
				if (female[j] > female[j + 1])
				{
					t = female[j];
					female[j] = female[j + 1];
					female[j + 1] = t;
				}
			}
		}
		System.out.printf("%.2lf",male[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %.2lf",male[i]);
		}
		for (i = f - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",female[i]);
		}

	   return 0;
	}
}

