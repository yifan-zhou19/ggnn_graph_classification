package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] a = new int[2][10];
		int j;
		int he = 0;
		float sum = 0F;
		float[] jidian = new float[10];
		float gpa;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0][j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][j] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			if (a[1][j] >= 90)
			{
				jidian[j] = 4F;
			}
			else if (a[1][j] >= 85 && a[1][j] <= 89)
			{
				jidian[j] = 3.7F;
			}
			else if (a[1][j] >= 82 && a[1][j] <= 84)
			{
				jidian[j] = 3.3F;
			}
			else if (a[1][j] >= 78 && a[1][j] <= 81)
			{
				jidian[j] = 3.0F;
			}
			else if (a[1][j] >= 75 && a[1][j] <= 77)
			{
				jidian[j] = 2.7F;
			}
			else if (a[1][j] >= 72 && a[1][j] <= 74)
			{
				jidian[j] = 2.3F;
			}
			else if (a[1][j] >= 68 && a[1][j] <= 71)
			{
				jidian[j] = 2.0F;
			}
			else if (a[1][j] >= 64 && a[1][j] <= 67)
			{
				jidian[j] = 1.5F;
			}
			else if (a[1][j] >= 60 && a[1][j] <= 63)
			{
				jidian[j] = 1.0F;
			}
			else
			{
				jidian[j] = 0F;
			}
			sum = sum + jidian[j] * a[0][j];
			he = he + a[0][j];
		}
		gpa = sum / (float)he;
		System.out.printf("%.2f\n",gpa);
	}


}

