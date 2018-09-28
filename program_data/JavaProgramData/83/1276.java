package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double b;
		double c;
		double d;
		double e;
		double GPA;
		d = 0;
		e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[3][11];
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[1][j] = Integer.parseInt(tempVar2);
			}
			e = e + a[1][j];
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[2][i] = Integer.parseInt(tempVar3);
			}
		if (a[2][i] >= 90 && a[2][i] <= 100)
		{
			b = 4.0;
		}
		else if (a[2][i] >= 85 && a[2][i] <= 89)
		{
			b = 3.7;
		}
		else if (a[2][i] >= 82 && a[2][i] <= 84)
		{
			b = 3.3;
		}
		else if (a[2][i] >= 78 && a[2][i] <= 81)
		{
			b = 3.0;
		}
		else if (a[2][i] >= 75 && a[2][i] <= 77)
		{
			b = 2.7;
		}
		else if (a[2][i] >= 72 && a[2][i] <= 74)
		{
			b = 2.3;
		}
		else if (a[2][i] >= 68 && a[2][i] <= 71)
		{
			b = 2.0;
		}
		else if (a[2][i] >= 64 && a[2][i] <= 67)
		{
			b = 1.5;
		}
		else if (a[2][i] >= 60 && a[2][i] <= 63)
		{
			b = 1.0;
		}
		else
		{
			b = 0;
		}
		c = b * a[1][i];
		d = d + c;
		}
		GPA = d / e;
		System.out.printf("%.2f",GPA);
	}
}

