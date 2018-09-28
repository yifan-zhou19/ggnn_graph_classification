package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		int sum;
		double GPA;
		double c;
		double d;
		GPA = 0,sum = 0,c = 0.0,d = 0.0;
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
			sum += a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] <= 100 && b[i] >= 90)
			{
				c = 4.0;
			}
			else if (b[i] <= 89 && b[i] >= 85)
			{
				c = 3.7;
			}
			else if (b[i] <= 84 && b[i] >= 82)
			{
				c = 3.3;
			}
			else if (b[i] <= 81 && b[i] >= 78)
			{
				c = 3.0;
			}
			else if (b[i] <= 77 && b[i] >= 75)
			{
				c = 2.7;
			}
			else if (b[i] <= 74 && b[i] >= 72)
			{
				c = 2.3;
			}
			else if (b[i] <= 71 && b[i] >= 68)
			{
				c = 2.0;
			}
			else if (b[i] <= 67 && b[i] >= 64)
			{
				c = 1.5;
			}
			else if (b[i] <= 63 && b[i] >= 60)
			{
				c = 1.0;
			}
			else
			{
				c = 0.0;
			}
			d += c * (a[i] * 1.0);
		}
		GPA += d / (sum * 1.0);
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

