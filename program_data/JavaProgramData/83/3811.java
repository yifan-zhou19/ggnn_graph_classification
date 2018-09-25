package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int[] a = new int[15];
		int f;
		int i;
		double[] b = new double[15];
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s += a[i];
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f = Integer.parseInt(tempVar3);
			}
			if (f >= 90)
			{
				b[i] = 4;
			}
			else if (f >= 85)
			{
				b[i] = 3.7;
			}
			else if (f >= 82)
			{
				b[i] = 3.3;
			}
			else if (f >= 78)
			{
				b[i] = 3;
			}
			else if (f >= 75)
			{
				b[i] = 2.7;
			}
			else if (f >= 72)
			{
				b[i] = 2.3;
			}
			else if (f >= 68)
			{
				b[i] = 2;
			}
			else if (f >= 64)
			{
				b[i] = 1.5;
			}
			else if (f >= 60)
			{
				b[i] = 1;
			}
			else
			{
				b[i] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			sum += a[i] * b[i];
		}
		System.out.printf("%.2lf",sum / s);
		return 0;
	}

}

