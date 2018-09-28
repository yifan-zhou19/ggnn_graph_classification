package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[2][10];
		int sum = 0;
		int i;
		double GPA = 0;
		double[][] b = new double[2][10];
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
				a[0][i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			sum = sum + a[0][i];
		}
		for (i = 1;i <= n;i++)
		{
			if (a[1][i] >= 90)
			{
				b[1][i] = 4.0;
			}
			if (a[1][i] >= 85 && a[1][i] < 90)
			{
				b[1][i] = 3.7;
			}
			if (a[1][i] >= 82 && a[1][i] < 85)
			{
				b[1][i] = 3.3;
			}
			if (a[1][i] >= 78 && a[1][i] < 82)
			{
				b[1][i] = 3.0;
			}
			if (a[1][i] >= 75 && a[1][i] < 78)
			{
				b[1][i] = 2.7;
			}
			if (a[1][i] >= 72 && a[1][i] < 75)
			{
				b[1][i] = 2.3;
			}
			if (a[1][i] >= 68 && a[1][i] < 72)
			{
				b[1][i] = 2.0;
			}
			if (a[1][i] >= 64 && a[1][i] < 68)
			{
				b[1][i] = 1.5;
			}
			if (a[1][i] >= 60 && a[1][i] < 64)
			{
				b[1][i] = 1.0;
			}
			if (a[1][i] < 60)
			{
				b[1][i] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			GPA = GPA + b[1][i] * a[0][i];
		}
		GPA = GPA / sum;
		System.out.printf("%.2f",GPA);
	}
}

