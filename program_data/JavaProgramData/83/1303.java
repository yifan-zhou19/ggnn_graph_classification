package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[2][9];
		int n;
		int i;
		int j;
		int d;
		float b;
		float GPA;
		float c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
		for (j = 0;j < n;j++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar2);
		   }
		}
		}
		c = 0F;
		d = 0;
		for (j = 0;j < n;j++)
		{
			if (a[1][j] >= 90 && a[1][j] <= 100)
			{
				b = 4.0F;
			}
		if (a[1][j] >= 85 && a[1][j] <= 89)
		{
			b = 3.7F;
		}
		if (a[1][j] >= 82 && a[1][j] <= 84)
		{
			b = 3.3F;
		}
		if (a[1][j] >= 78 && a[1][j] <= 81)
		{
			b = 3.0F;
		}
		if (a[1][j] >= 75 && a[1][j] <= 77)
		{
			b = 2.7F;
		}
		if (a[1][j] >= 72 && a[1][j] <= 74)
		{
			b = 2.3F;
		}
		if (a[1][j] >= 68 && a[1][j] <= 71)
		{
			b = 2.0F;
		}
		if (a[1][j] >= 64 && a[1][j] <= 67)
		{
			b = 1.5F;
		}
		if (a[1][j] >= 60 && a[1][j] <= 63)
		{
			b = 1.0F;
		}
		if (a[1][j] < 60)
		{
			b = 0F;
		}
		c = c + a[0][j] * b;
		d = d + a[0][j];
		}
		GPA = c / d;
		System.out.printf("%.2f\n",GPA);
	}
}

