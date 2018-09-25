package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] c = new double[10];
		double[] s = new double[10];
		double[] p = new double[10];
		double tc = 0;
		double tp = 0;
		double GPA;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Double.parseDouble(tempVar2);
			}
			tc = tc + c[i];
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Double.parseDouble(tempVar3);
			}
			if (s[i] < 60)
			{
				p[i] = 0;
			}
			else if (s[i] >= 60 && s[i] <= 63)
			{
				p[i] = 1.0 * c[i];
			}
			else if (s[i] >= 64 && s[i] <= 67)
			{
				p[i] = 1.5 * c[i];
			}
			else if (s[i] >= 68 && s[i] <= 71)
			{
				p[i] = 2.0 * c[i];
			}
			else if (s[i] >= 72 && s[i] <= 74)
			{
				p[i] = 2.3 * c[i];
			}
			else if (s[i] >= 75 && s[i] <= 77)
			{
				p[i] = 2.7 * c[i];
			}
			else if (s[i] >= 78 && s[i] <= 81)
			{
				p[i] = 3.0 * c[i];
			}
			else if (s[i] >= 82 && s[i] <= 84)
			{
				p[i] = 3.3 * c[i];
			}
			else if (s[i] >= 85 && s[i] <= 89)
			{
				p[i] = 3.7 * c[i];
			}
			else
			{
				p[i] = 4.0 * c[i];
			}
			tp = tp + p[i];
		}
		GPA = tp / tc;
		System.out.printf("%.2lf", GPA);
	}
}

