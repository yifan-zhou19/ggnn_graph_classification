package <missing>;

public class GlobalMembers
{
	public static double score(int a)
	{
		double result;
		if (a >= 90)
		{
			result = 4.0;
		}
		else if (a >= 85 && a <= 89)
		{
			result = 3.7;
		}
		else if (a >= 82 && a <= 84)
		{
			result = 3.3;
		}
		else if (a >= 78 && a <= 81)
		{
			result = 3.0;
		}
		else if (a >= 75 && a <= 77)
		{
			result = 2.7;
		}
		else if (a >= 72 && a <= 74)
		{
			result = 2.3;
		}
		else if (a >= 68 && a <= 71)
		{
			result = 2.0;
		}
		else if (a >= 64 && a <= 67)
		{
			result = 1.5;
		}
		else if (a >= 60 && a <= 63)
		{
			result = 1.0;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] sz1 = new int[50];
		int[] sz2 = new int[50];
		double[] sz3 = new double[50];
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
				sz1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz2[i] = Integer.parseInt(tempVar3);
			 }
		}
	double x;
	double a = 0;
	int y = 0;
		for (i = 0;i < n;i++)
		{
			x = score(sz2[i]);
				sz3[i] = x * sz1[i];
		}
		for (i = 0;i < n;i++)
		{
			a += sz3[i];
			y += sz1[i];
		}

		System.out.printf("%.2lf\n",a / y);
		return 0;
	}
}

