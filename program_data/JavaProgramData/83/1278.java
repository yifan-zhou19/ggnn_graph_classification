package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int n;
		float[][] a = new float[3][10];
		float GPA = 0F;
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
				a[0][j] = Float.parseFloat(tempVar2);
			}
			i = i + a[0][j];
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][j] = Float.parseFloat(tempVar3);
			}
			if (a[1][j] >= 90F)
			{
				a[2][j] = 4.0F;
			}
			else if (a[1][j] >= 85F)
			{
				a[2][j] = 3.7F;
			}
			else if (a[1][j] >= 82F)
			{
				a[2][j] = 3.3F;
			}
			else if (a[1][j] >= 78F)
			{
				a[2][j] = 3.0F;
			}
			else if (a[1][j] >= 75F)
			{
				a[2][j] = 2.7F;
			}
			else if (a[1][j] >= 72F)
			{
				a[2][j] = 2.3F;
			}
			else if (a[1][j] >= 68F)
			{
				a[2][j] = 2.0F;
			}
			else if (a[1][j] >= 64F)
			{
				a[2][j] = 1.5F;
			}
			else if (a[1][j] >= 60F)
			{
				a[2][j] = 1.0F;
			}
			else
			{
				a[2][j] = 0F;
			}
			a[2][j] = a[2][j] * a[0][j];
		}
		for (j = 0;j <= n - 1;j++)
		{
			GPA = GPA + a[2][j];
		}
		GPA = GPA / i;
		System.out.printf("%.2f",GPA);
	}






}

