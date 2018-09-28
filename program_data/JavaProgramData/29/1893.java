package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int[] a = new int[100];
		float N;
		float[] x = new float[100];
		float[] y = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		x[1] = 2F;
		x[2] = 3F;
		y[1] = 1F;
		y[2] = 2F;
		for (i = 1;i <= m;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] == 2)
			{
				N = 3.5F;
			}
			else if (a[i] == 1)
			{
				N = 2F;
			}
			else
			{
				N = x[1] / y[1] + x[2] / y[2];
				for (n = 3;n <= a[i];n++)
				{
					x[n] = x[n - 1] + x[n - 2];
					y[n] = y[n - 1] + y[n - 2];
					N = N + x[n] / y[n];
				}
			}
			System.out.printf("%.3f\n",N);
		}
		return 0;
	}
}

