package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		double t;
		double s;
		double x;
		double[] c = new double[10];
		s = 0.00;
		y = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90 && b[i] <= 100)
			{
				t = 4.0;
			}
			else if (b[i] >= 85)
			{
				t = 3.7;
			}
			else if (b[i] >= 82)
			{
				t = 3.3;
			}
			else if (b[i] >= 78)
			{
				t = 3.0;
			}
			else if (b[i] >= 75)
			{
				t = 2.7;
			}
			else if (b[i] >= 72)
			{
				t = 2.3;
			}
			else if (b[i] >= 68)
			{
				t = 2.0;
			}
			else if (b[i] >= 64)
			{
				t = 1.5;
			}
			else if (b[i] >= 60)
			{
				t = 1.0;
			}
			else
			{
				t = 0.0;
			}
			c[i] = t * a[i];
			s += c[i];
			y += a[i];
		}
		x = s / y;
		System.out.printf("%.2lf",x);
		return 0;
	}

}

