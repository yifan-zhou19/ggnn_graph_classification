package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int n;
		int i;
		int[] x = new int[20];
		int sx = 0;
		double GPA = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int k = 0; k < n; k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[k] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			if (c >= 90 && c <= 100)
			{
				GPA += x[i] * 4.0;
			}
			if (c >= 85 && c <= 89)
			{
				GPA += x[i] * 3.7;
			}
			if (c >= 82 && c <= 84)
			{
				GPA += x[i] * 3.3;
			}
			if (c >= 78 && c <= 81)
			{
				GPA += x[i] * 3.0;
			}
			if (c >= 75 && c <= 77)
			{
				GPA += x[i] * 2.7;
			}
			if (c >= 72 && c <= 74)
			{
				GPA += x[i] * 2.3;
			}
			if (c >= 68 && c <= 71)
			{
				GPA += x[i] * 2.0;
			}
			if (c >= 64 && c <= 67)
			{
				GPA += x[i] * 1.5;
			}
			if (c >= 60 && c <= 63)
			{
				GPA += x[i] * 1.0;
			}
			if (c <= 59)
			{
				GPA += 0.0;
			}
			sx += x[i];
		}
		System.out.printf("%.2lf", GPA / sx * 1.0);
		return 0;
	}
}

