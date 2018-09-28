package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ZXF;
		int i;
		int p;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10];
		double[] b = new double[10];
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
				p = Integer.parseInt(tempVar3);
			}
			if (p >= 90)
			{
				b[i] = 4.0;
			}
			else if (p >= 85)
			{
				b[i] = 3.7;
			}
			else if (p >= 82)
			{
				b[i] = 3.3;
			}
			else if (p >= 78)
			{
				b[i] = 3.0;
			}
			else if (p >= 75)
			{
				b[i] = 2.7;
			}
			else if (p >= 72)
			{
				b[i] = 2.3;
			}
			else if (p >= 68)
			{
				b[i] = 2.0;
			}
			else if (p >= 64)
			{
				b[i] = 1.5;
			}
			else if (p >= 78)
			{
				b[i] = 1.0;
			}
			else if (p >= 78)
			{
				b[i] = 0;
			}
		}
		ZXF = 0;
		for (i = 0;i < n;i++)
		{
			ZXF += a[i];
		}
		for (i = 0;i < n;i++)
		{
			GPA += 1.0 * a[i] / ZXF * b[i];
		}
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

