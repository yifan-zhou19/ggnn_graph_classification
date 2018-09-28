package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int b = 0;
		double c;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		double[] sa = new double[500];
		int[] sb = new int[500];
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sb[i]) = Integer.parseInt(tempVar2);
			}
			b = b + sb[i];
		}
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sa[i]) = Double.parseDouble(tempVar3);
			}
			if (sa[i] >= 90)
			{
				sa[i] = 4.0;
			}
			else if (sa[i] >= 85)
			{
				sa[i] = 3.7;
			}
			else if (sa[i] >= 82)
			{
				sa[i] = 3.3;
			}
			else if (sa[i] >= 78)
			{
				sa[i] = 3.0;
			}
			else if (sa[i] >= 75)
			{
				sa[i] = 2.7;
			}
			else if (sa[i] >= 72)
			{
				sa[i] = 2.3;
			}
			else if (sa[i] >= 68)
			{
				sa[i] = 2.0;
			}
			else if (sa[i] >= 64)
			{
				sa[i] = 1.5;
			}
			else if (sa[i] >= 60)
			{
				sa[i] = 1.0;
			}
			else
			{
				sa[i] = 0;
			}
			sa[i] = sa[i] * sb[i];
		}
		for (i = 0;i < a;i++)
		{
			c = c + sa[i];
		}
		c = c / b;
		System.out.printf("%.2lf",c);
		return 0;
	}

}

