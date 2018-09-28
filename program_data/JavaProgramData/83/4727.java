package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int n;
		int s1 = 0;
		double s = 0;
		double[] c = new double[1000];
		double sum;
		double s2 = 0;
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
			c[i] = a[i];
			s2 += c[i];
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
				s += 4.0 * c[i];
			}
			else if (b[i] >= 85 && b[i] <= 89)
			{
				s += 3.7 * c[i];
			}
			else if (b[i] >= 82 && b[i] <= 84)
			{
				s += 3.3 * c[i];
			}
			else if (b[i] >= 78 && b[i] <= 81)
			{
				s += 3.0 * c[i];
			}
			else if (b[i] >= 75 && b[i] <= 77)
			{
				s += 2.7 * c[i];
			}
			else if (b[i] >= 72 && b[i] <= 74)
			{
				s += 2.3 * c[i];
			}
			else if (b[i] >= 68 && b[i] <= 71)
			{
				s += 2.0 * c[i];
			}
			else if (b[i] >= 64 && b[i] <= 67)
			{
				s += 1.5 * c[i];
			}
			else if (b[i] >= 60 && b[i] <= 63)
			{
				s += 1.0 * c[i];
			}
			else if (b[i] < 60)
			{
				s += 0;
			}
		}
		sum = s / s2 * 1.00;
		System.out.printf("%.2lf",sum);
		return 0;
	}

}

