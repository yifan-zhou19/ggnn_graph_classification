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
		String sex = new String(new char[10]);
		double[] male = new double[40];
		double[] female = new double[40];
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			if (strcmp(sex,"male") == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					male[m] = Double.parseDouble(tempVar3);
				}
				m++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					female[f] = Double.parseDouble(tempVar4);
				}
				f++;
			}
		}
		for (i = 0;i <= m - 2;i++)
		{
			for (j = 0;j <= m - 2 - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					t = male[j];
					male[j] = male[j + 1];
					male[j + 1] = t;
				}
			}
		}
		for (i = 0;i <= f - 2;i++)
		{
			for (j = 0;j <= f - 2 - i;j++)
			{
				if (female[j] < female[j + 1])
				{
					t = female[j];
					female[j] = female[j + 1];
					female[j + 1] = t;
				}
			}
		}
		System.out.printf("%.2f",male[0]);
		for (i = 1;i <= m - 1;i++)
		{
			System.out.printf(" %.2f",male[i]);
		}
		for (i = 0;i <= f - 1;i++)
		{
			System.out.printf(" %.2f",female[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

