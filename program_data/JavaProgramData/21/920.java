package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] x = new int[100];
		int sum = 0;
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							x[i] = Integer.parseInt(tempVar2);
						}
						sum = sum + x[i];
		}
		float aver;
		aver = (float)sum / n;
		float[] y = new float[100];
		for (i = 0;i < n;i++)
		{
						y[i] = Math.abs(x[i] - aver);
		}
		float max = y[0];
		for (i = 1;i < n;i++)
		{
						if (y[i] - max > 0F)
						{
									  max = y[i];
						}
		}
		int[] z = new int[100];
		int m = 0;
		for (i = 0;i < n;i++)
		{
						if (Math.abs(y[i] - max) < Math.pow(10,-9))
						{
								   z[m] = x[i];
								   m++;
						}
		}
		int o;
		int w;
		for (i = 1;i < m;i++)
		{
						 for (o = 0;o < m - i;o++)
						 {
										   if (x[o] > x[o + 1])
										   {
														  w = z[o];
														  z[o] = z[o + 1];
														  z[o + 1] = w;
										   }
						 }
		}

		System.out.printf("%d", z[0]);
		for (i = 1;i < m;i++)
		{
						System.out.printf(",%d", z[i]);
		}

		return 0;
	}

}

