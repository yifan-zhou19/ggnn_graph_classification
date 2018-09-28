package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[11];
		int[] df = new int[11];
		double zj = 0;
		double GPA = 0;
		double zxf = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (df[i] >= 90 && df[i] <= 100)
			{
				zj = zj + 4.0 * xf[i];
			}
			else if (df[i] >= 85 && df[i] <= 89)
			{
				zj = zj + 3.7 * xf[i];
			}
			else if (df[i] >= 82 && df[i] <= 84)
			{
				zj = zj + 3.3 * xf[i];
			}
			else if (df[i] >= 78 && df[i] <= 81)
			{
				zj = zj + 3.0 * xf[i];
			}
			else if (df[i] >= 75 && df[i] <= 77)
			{
				zj = zj + 2.7 * xf[i];
			}
			else if (df[i] >= 72 && df[i] <= 74)
			{
				zj = zj + 2.3 * xf[i];
			}
			else if (df[i] >= 68 && df[i] <= 71)
			{
				zj = zj + 2.0 * xf[i];
			}
			else if (df[i] >= 64 && df[i] <= 67)
			{
				zj = zj + 1.5 * xf[i];
			}
			else if (df[i] >= 60 && df[i] <= 63)
			{
				zj = zj + 1.0 * xf[i];
			}
			else if (df[i] < 60)
			{
				zj = zj;
			}

		}
		for (int i = 0;i < n;i++)
		{
			zxf = zxf + xf[i];
		}
		GPA = zj / zxf;
		System.out.printf("%.2lf",GPA);
	}
}

