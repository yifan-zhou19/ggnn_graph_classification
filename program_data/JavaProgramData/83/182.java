package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum1 = 0;
		int[] x = new int[10];
		double sum2 = 0;
		double[] m = new double[10];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			sum1 += x[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i] = Double.parseDouble(tempVar3);
			}
			if (m[i] >= 90)
			{
				m[i] = 4;
			}
			else if (m[i] >= 85)
			{
				m[i] = 3.7;
			}
			else if (m[i] >= 82)
			{
				m[i] = 3.3;
			}
			else if (m[i] >= 78)
			{
				m[i] = 3.0;
			}
			else if (m[i] >= 75)
			{
				m[i] = 2.7;
			}
			else if (m[i] >= 72)
			{
				m[i] = 2.3;
			}
			else if (m[i] >= 68)
			{
				m[i] = 2.0;
			}
			else if (m[i] >= 64)
			{
				m[i] = 1.5;
			}
			else if (m[i] >= 60)
			{
				m[i] = 1;
			}
			else
			{
				m[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum2 += (x[i] * m[i]);
		}
		System.out.printf("%.2lf",sum2 / sum1);
		return 0;
	}
}

