package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int f;
		int m;
		double[] male = new double[41];
		double[] female = new double[41];
		String tip = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		f = 0;
		m = 0;
		for (i = 0;i < n - 1;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							tip = tempVar2.charAt(0);
						}
						if (tip.charAt(0) == 'f')
						{
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								female[f] = Double.parseDouble(tempVar3);
							}
							f++;
						}
						else
						{
							String tempVar4 = ConsoleInput.scanfRead();
							if (tempVar4 != null)
							{
								male[m] = Double.parseDouble(tempVar4);
							}
							m++;
						}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			tip = tempVar5.charAt(0);
		}
		if (tip.charAt(0) == 'f')
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				female[f] = Double.parseDouble(tempVar6);
			}
			f++;
		}
		else
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				male[m] = Double.parseDouble(tempVar7);
			}
			m++;
		}
		s = 1;
		while (s > 0)
		{
			s = 0;
		for (i = 0;i < m - 1;i++)
		{
		if (male[i] > male[i + 1])
		{
		male[i] = male[i] + male[i + 1];
		male[i + 1] = male[i] - male[i + 1];
		male[i] = male[i] - male[i + 1];
		s++;
		}
		}
		}
		s = 1;
		while (s > 0)
		{
			s = 0;
		for (i = 0;i < f - 1;i++)
		{
		if (female[i] < female[i + 1])
		{
		female[i] = female[i] + female[i + 1];
		female[i + 1] = female[i] - female[i + 1];
		female[i] = female[i] - female[i + 1];
		s++;
		}
		}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < f - 1;i++)
		{
			System.out.printf("%.2lf ",female[i]);
		}
		System.out.printf("%.2lf\n",female[f - 1]);
		return 0;
	}

}

