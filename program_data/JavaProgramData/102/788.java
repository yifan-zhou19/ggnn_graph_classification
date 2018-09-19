package <missing>;

public class GlobalMembers
{
	public static double[] male = new double[40];
	public static double[] female = new double[40];
	public static int mk;
	public static int fk;
	public static void sor1()
	{
		int i;
		int j;
		int tmp;
		double min;
		for (i = 0;i < mk;i++)
		{
			min = male[i];
			tmp = i;
			for (j = i + 1;j < mk;j++)
			{
				if (min > male[j])
				{
					min = male[j];
					tmp = j;
				}
			}
			male[tmp] = male[i];
			male[i] = min;
		}

	}
	public static void sor2()
	{
		int i;
		int j;
		int tmp;
		double min;

		for (i = 0;i < fk;i++)
		{
			min = female[i];
			tmp = i;
			for (j = i + 1;j < fk;j++)
			{
				if (min > female[j])
				{
					min = female[j];
					tmp = j;
				}
			}
			female[tmp] = female[i];
			female[i] = min;
		}

	}

	public static int Main()
	{
		int n;
		int i;
		String sex = new String(new char[10]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		mk = 0;
		fk = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			if (sex.charAt(0) == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					male[mk++] = Double.parseDouble(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					female[fk++] = Double.parseDouble(tempVar4);
				}
			}
		}
		sor1();
		sor2();
		for (i = 0;i < mk;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (i = fk - 1;i > 0;i--)
		{
			System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f\n",female[0]);
	}
}

