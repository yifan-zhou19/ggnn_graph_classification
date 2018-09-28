package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[num];
		int[] b = new int[num];
		double[] c = new double[num];
		double C = 0;
		double B = 0;
		double GPA;
		int n;
		int i;
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
				b[i] = Integer.parseInt(tempVar2);
			}
			B += b[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 90)
			{
				c[i] = 4.0 * b[i];
			}
			if (a[i] >= 85 && a[i] <= 89)
			{
				c[i] = 3.7 * b[i];
			}
			if (a[i] >= 82 && a[i] <= 84)
			{
				c[i] = 3.3 * b[i];
			}
			if (a[i] >= 78 && a[i] <= 81)
			{
				c[i] = 3.0 * b[i];
			}
			if (a[i] >= 75 && a[i] <= 77)
			{
				c[i] = 2.7 * b[i];
			}
			if (a[i] >= 72 && a[i] <= 74)
			{
				c[i] = 2.3 * b[i];
			}
			if (a[i] >= 68 && a[i] <= 71)
			{
				c[i] = 2.0 * b[i];
			}
			if (a[i] >= 64 && a[i] <= 67)
			{
				c[i] = 1.5 * b[i];
			}
			if (a[i] >= 60 && a[i] <= 63)
			{
				c[i] = 1.0 * b[i];
			}
			if (a[i] < 60)
			{
				c[i] = 0 * b[i];
			}
			C += c[i];
		}
		GPA = C / B;
		System.out.printf("%.2lf",GPA);
		return 0;
	}

}

