package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int b = 0;
	double GPA;
	double a = 0;
	int[] xf = new int[10];
	int[] fs = new int[10];
	double[] jd = new double[10];
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
				(xf[i]) = Integer.parseInt(tempVar2);
			}
	}
	System.out.print("\n");
	for (j = 0;j < n;j++)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(fs[j]) = Integer.parseInt(tempVar3);
			}
	}
	for (i = 0;i < n;i++)
	{
		if (fs[i] >= 90)
		{
				jd[i] = 4.0;
		}
		else if (fs[i] >= 85)
		{
				jd[i] = 3.7;
		}
		else if (fs[i] >= 82)
		{
				jd[i] = 3.3;
		}
		else if (fs[i] >= 78)
		{
				jd[i] = 3.0;
		}
		else if (fs[i] >= 75)
		{
				jd[i] = 2.7;
		}
		else if (fs[i] >= 72)
		{
				jd[i] = 2.3;
		}
		else if (fs[i] >= 68)
		{
				jd[i] = 2.0;
		}
		else if (fs[i] >= 64)
		{
				jd[i] = 1.5;
		}
		else if (fs[i] >= 60)
		{
				jd[i] = 1.0;
		}
		else
		{
			jd[i] = 0.0;
		}
	}
	for (i = 0;i < n;i++)
	{
			a = a + (xf[i]) * (jd[i]);
		b = b + (xf[i]);
	}
	GPA = 1.0 * a / b;
	System.out.printf("%.2lf",GPA);
	}
}

