package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sumxf = 0;
		int[] xf = new int[10];
		int[] df = new int[10];
		double GPA;
		double sumGPA = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (i < n - 1)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xf[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					xf[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (i < n - 1)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					df[i] = Integer.parseInt(tempVar4);
				}
			}
			else
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					df[i] = Integer.parseInt(tempVar5);
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (df[i] <= 100 && df[i] >= 90)
			{
				sumGPA += 4.0 * xf[i];
			}
			else if (df[i] <= 89 && df[i] >= 85)
			{
				sumGPA += 3.7 * xf[i];
			}
			else if (df[i] <= 84 && df[i] >= 82)
			{
				sumGPA += 3.3 * xf[i];
			}
			else if (df[i] <= 81 && df[i] >= 78)
			{
				sumGPA += 3.0 * xf[i];
			}
			else if (df[i] <= 77 && df[i] >= 75)
			{
				sumGPA += 2.7 * xf[i];
			}
			else if (df[i] <= 74 && df[i] >= 72)
			{
				sumGPA += 2.3 * xf[i];
			}
			else if (df[i] <= 71 && df[i] >= 68)
			{
				sumGPA += 2.0 * xf[i];
			}
			else if (df[i] <= 67 && df[i] >= 64)
			{
				sumGPA += 1.5 * xf[i];
			}
			else if (df[i] <= 63 && df[i] >= 60)
			{
				sumGPA += 1.0 * xf[i];
			}
			else if (df[i] < 60)
			{
				sumGPA += 0;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			sumxf += xf[i];
		}
		GPA = (sumGPA * 0.1) / (sumxf * 0.1);
		System.out.printf("%.2lf",GPA);

		return 0;
	}

}

