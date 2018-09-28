package <missing>;

public class GlobalMembers
{
	public static double JD(int a)
	{
		double s;
		if (a >= 90)
		{
			s = 4.0;
		}
		else if (a < 90 && a >= 85)
		{
			s = 3.7;
		}
		else if (a < 85 && a >= 82)
		{
			s = 3.3;
		}
		else if (a < 82 && a >= 78)
		{
			s = 3.0;
		}
		else if (a < 78 && a >= 75)
		{
			s = 2.7;
		}
		else if (a < 75 && a >= 72)
		{
			s = 2.3;
		}
		else if (a < 72 && a >= 68)
		{
			s = 2.0;
		}
		else if (a < 68 && a >= 64)
		{
			s = 1.5;
		}
		else if (a < 64 && a >= 60)
		{
			s = 1.0;
		}
		else
		{
			s = 0;
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int i;
		double[] b = new double[10];
		double t;
		double x = 0;
		double y = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
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
				b[i] = JD(b[i]) * a[i];
		}
				for (i = 0;i < n;i++)
				{
					x = x + a[i];
				}
				for (i = 0;i < n;i++)
				{
					y = y + b[i];
				}

		t = y / x;
		System.out.printf("%.2lf",t);
		return 0;

	}

}

