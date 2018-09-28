package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int xfh = 0;
		int[] xf = new int[9];
		int[] df = new int[9];
		double GPA;
		double[] gpa = new double[9];
		double[] xfjd = new double[9];
		double jdh = 0;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
			xfh += xf[i];
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			df[i] = Integer.parseInt(tempVar3);
		}
		if (df[i] >= 90)
		{
			gpa[i] = 4.0;
		}
		else if (85 <= df[i] != 0 && df[i] <= 90)
		{
			gpa[i] = 3.7;
		}
		else if (82 <= df[i] != 0 && df[i] <= 84)
		{
			gpa[i] = 3.3;
		}
		else if (78 <= df[i] != 0 && df[i] <= 81)
		{
			gpa[i] = 3.0;
		}
		else if (72 <= df[i] != 0 && df[i] <= 74)
		{
			gpa[i] = 2.3;
		}
		else if (68 <= df[i] != 0 && df[i] <= 71)
		{
			gpa[i] = 2.0;
		}
		else if (64 <= df[i] != 0 && df[i] <= 67)
		{
			gpa[i] = 1.5;
		}
		else if (60 <= df[i] != 0 && df[i] <= 63)
		{
			gpa[i] = 1.0;
		}
		else
		{
			gpa[i] = 0;
		}
		xfjd[i] = xf[i] * gpa[i];
		jdh += xfjd[i];
		}
		GPA = jdh / xfh;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

