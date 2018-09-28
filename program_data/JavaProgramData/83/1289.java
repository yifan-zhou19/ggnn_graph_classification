package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		float GPA;
		float m = 0F;
		float p = 0F;
		float[][] a = new float[3][9];
		float[] b = new float[9];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Float.parseFloat(tempVar2);
				}

			}
		}
			for (j = 0;j <= n - 1;j++)
			{
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

			}
			for (j = 0;j <= n - 1;j++)
			{
				b[j] = a[0][j] * a[2][j];
			m = m + b[j];
				p = p + a[0][j];
			}
			GPA = m / p;
			System.out.printf("%.2f\n",GPA);
	}

}

