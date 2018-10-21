package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		char[][] sex = new char[41][7];
		double[] height = new double[41];
		double[] male = new double[41];
		double[] female = new double[41];
		double ex;
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
				height[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sex[i][0] == 'm')
			{
				male[i] = height[i];
			}
			else
			{
				female[i] = height[i];
			}
		}
		for (i = 0;i < 41;i++)
		{
			for (j = 0;j < 40;j++)
			{
				if (male[j] > male[j + 1])
				{
					ex = male[j];
					male[j] = male[j + 1];
					male[j + 1] = ex;
				}
			}
		}
		for (i = 0;i < 41;i++)
		{
			for (j = 0;j < 40;j++)
			{
				if (female[j] < female[j + 1])
				{
					ex = female[j];
					female[j] = female[j + 1];
					female[j + 1] = ex;
				}
			}
		}
		for (i = 0;i < 41;i++)
		{
			if (male[i] != 0)
			{
				System.out.printf("%.2lf ",male[i]);
			}
		}
		System.out.printf("%.2lf",female[0]);
		for (i = 1;female[i] != 0;i++)
		{
			System.out.printf(" %.2lf",female[i]);
		}
		return 0;

	}
}

