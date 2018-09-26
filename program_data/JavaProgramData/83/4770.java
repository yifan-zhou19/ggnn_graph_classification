package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] xf = new int[10];
		int[] df = new int[10];
		int s = 0;
		double[] jd = new double[10];
		double[] zongjd = new double[10];
		double sum = 0;
		double a;
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
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (df[i] >= 90)
			{
				jd[i] = 4.0;
			}
			else if (df[i] >= 85)
			{
				jd[i] = 3.7;
			}
			else if (df[i] >= 82)
			{
				jd[i] = 3.3;
			}
			else if (df[i] >= 78)
			{
				jd[i] = 3.0;
			}
			else if (df[i] >= 75)
			{
				jd[i] = 2.7;
			}
			else if (df[i] >= 72)
			{
				jd[i] = 2.3;
			}
			else if (df[i] >= 68)
			{
				jd[i] = 2.0;
			}
			else if (df[i] >= 64)
			{
				jd[i] = 1.5;
			}
			else if (df[i] >= 60)
			{
				jd[i] = 1.0;
			}
			else
			{
				jd[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			zongjd[i] = jd[i] * xf[i];
			sum += zongjd[i];
			s += xf[i];
		}
		a = sum / s;
		System.out.printf("%.2lf",a);
		return 0;
	}

}

