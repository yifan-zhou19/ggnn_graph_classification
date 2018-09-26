package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[11];
		double[] b = new double[11];
		double sum = 0;
		double GPA = 0;
		int n;
		int i;


		for (i = 0;i < 11;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
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
				a[i] = Double.parseDouble(tempVar2);
			}
			sum += a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}

		}

		for (i = 0;i < n;i++)
		{
			if (100 >= b[i] != 0 && b[i] >= 90)
			{
				b[i] = 4.0;
				continue;
			}
			if (89 >= b[i] != 0 && b[i] >= 85)
			{
				b[i] = 3.7;
				continue;
			}
			if (84 >= b[i] != 0 && b[i] >= 82)
			{
				b[i] = 3.3;
				continue;
			}
			if (81 >= b[i] != 0 && b[i] >= 78)
			{
				b[i] = 3.0;
				continue;
			}
			if (77 >= b[i] != 0 && b[i] >= 75)
			{
				b[i] = 2.7;
				continue;
			}
			if (74 >= b[i] != 0 && b[i] >= 72)
			{
				b[i] = 2.3;
				continue;
			}
			if (71 >= b[i] != 0 && b[i] >= 68)
			{
				b[i] = 2.0;
				continue;
			}
			if (67 >= b[i] != 0 && b[i] >= 64)
			{
				b[i] = 1.5;
				continue;
			}
			if (63 >= b[i] != 0 && b[i] >= 60)
			{
				b[i] = 1.0;
				continue;
			}
			if (60 > b[i])
			{
				b[i] = 0.0;
				continue;
			}

		}
		for (i = 0;i < n;i++)
		{
			GPA += b[i] * a[i];
		}

		System.out.printf("%.2f",GPA / sum);
		return 0;
	}

}

