package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[10];
		int n;
		int h;
		int[] b = new int[10];
		double H;
		double[] c = new double[10];
		double GPA;
		h = 0;
		H = 0;
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
			h = h + a[i];
		}

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}

			if (b[i] <= 100 && b[i] >= 90)
			{
				c[i] = 4.0;
			}
			if (b[i] <= 89 && b[i] >= 85)
			{
				c[i] = 3.7;
			}
			if (b[i] <= 84 && b[i] >= 82)
			{
				c[i] = 3.3;
			}
			if (b[i] <= 81 && b[i] >= 78)
			{
				c[i] = 3.0;
			}
			if (b[i] <= 77 && b[i] >= 75)
			{
				c[i] = 2.7;
			}
			if (b[i] <= 74 && b[i] >= 72)
			{
				c[i] = 2.3;
			}
			if (b[i] <= 71 && b[i] >= 68)
			{
				c[i] = 2.0;
			}
			if (b[i] <= 67 && b[i] >= 64)
			{
				c[i] = 1.5;
			}
			if (b[i] <= 63 && b[i] >= 60)
			{
				c[i] = 1.0;
			}
			if (b[i] <= 59 && b[i] >= 0)
			{
				c[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			H = H + a[i] * c[i];
		}
		GPA = H / h;
		System.out.printf("%.2lf",GPA);
	}




}

