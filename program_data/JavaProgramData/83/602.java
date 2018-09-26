package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[2][10];
		int n;
		int i;
		int j;
		float xfjd = 0F;
		float GPA;
		float xfh = 0F;
		float[] b = new float[11];
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

		for (i = 0;i < n;i++)
		{
			if (a[1][i] < 60)
			{
				b[i] = 0F;
			}
			else if (a[1][i] < 64)
			{
				b[i] = 1.0F;
			}
			else if (a[1][i] < 68)
			{
				b[i] = 1.5F;
			}
			else if (a[1][i] < 72)
			{
				b[i] = 2.0F;
			}
			else if (a[1][i] < 75)
			{
				b[i] = 2.3F;
			}
			else if (a[1][i] < 78)
			{
				b[i] = 2.7F;
			}
			else if (a[1][i] < 82)
			{
				b[i] = 3.0F;
			}
			else if (a[1][i] < 85)
			{
				b[i] = 3.3F;
			}
			else if (a[1][i] < 90)
			{
				b[i] = 3.7F;
			}
			else if (a[1][i] <= 100)
			{
				b[i] = 4.0F;
			}
		}


		for (i = 0;i < n;i++)
		{
			xfjd = a[0][i] * b[i] + xfjd;
		}

		for (i = 0;i < n;i++)
		{
			xfh = xfh + a[0][i];
		}

		GPA = xfjd / xfh;

		System.out.printf("%.2f",GPA);

	}
}

