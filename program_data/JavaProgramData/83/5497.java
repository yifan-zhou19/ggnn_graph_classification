package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] fs = new int[N];
		int[] xf = new int[N];
		double GPA;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(xf[j]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(fs[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			k = k + xf[j];
		}
		j = 0;
		s = 0;
		for (i = 0;i < n;i++)
		{
			if (fs[i] >= 90 && fs[i] <= 100)
			{
				s = s + 4.0 * xf[j];
			}
			else if (fs[i] >= 85 && fs[i] <= 89)
			{
				s = s + 3.7 * xf[j];
			}
			else if (fs[i] >= 82 && fs[i] <= 84)
			{
				s = s + 3.3 * xf[j];
			}
			else if (fs[i] >= 78 && fs[i] <= 81)
			{
				s = s + 3.0 * xf[j];
			}
			else if (fs[i] >= 75 && fs[i] <= 77)
			{
				s = s + 2.7 * xf[j];
			}
			else if (fs[i] >= 72 && fs[i] <= 74)
			{
				s = s + 2.3 * xf[j];
			}
			else if (fs[i] >= 68 && fs[i] <= 71)
			{
				s = s + 2.0 * xf[j];
			}
			else if (fs[i] >= 64 && fs[i] <= 67)
			{
				s = s + 1.5 * xf[j];
			}
			else if (fs[i] >= 60 && fs[i] <= 63)
			{
				s = s + 1.0 * xf[j];
			}
			else if (fs[i] < 60)
			{
				s = s + 0;
			}
			j = j + 1;
		}
		GPA = s / k;
		System.out.printf("%.2lf",GPA);
		return 0;
	}

}

