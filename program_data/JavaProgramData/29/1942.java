package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int jie = 1;
		int[] c = new int[100];
		float[][] a = new float[100][300];
		float[] b = new float[100];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 1;i <= n;i++)
		{
			b[i] = 0F;
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= c[i] + 2;j++)
			{
				if (j == 1)
				{
					a[i][j] = 1.0F;
				}
				else if (j == 2)
				{
					a[i][j] = 2.0F;
				}
				else
				{
					a[i][j] = a[i][j - 1] + a[i][j - 2];
				}

			}

		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= c[i];j++)
			{
				b[i] += a[i][j + 1] / a[i][j];
			}


			System.out.printf("%.3f\n",b[i]);
		}
		return 0;
	}


}

