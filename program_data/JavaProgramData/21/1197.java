package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		float[] a = new float[310];
		float sum = 0F;
		float aver;
		float[] b = new float[310];
		float[] c = new float[310];
		float max;
		float tem;
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
				a[i] = Float.parseFloat(tempVar2);
			}
		}

		for (i = 1;i <= n;i++)
		{
			sum = sum + a[i];
		}
		aver = sum / n;

		for (i = 1;i <= n;i++)
		{
			b[i] = a[i] - aver;
			if (b[i] < 0F)
			{
				b[i] = -b[i];
			}
		}

		max = b[1];
		for (i = 1;i <= n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}

		for (i = 1;i <= n;i++)
		{
			if (b[i] == max)
			{
				j = j + 1;
				c[j] = a[i];
			}
		}

		if (j == 1)
		{
			System.out.printf("%.f",c[1]);
		}
		else
		{
			for (i = j;i > 1;i--)
			{
				for (k = 1;k < i;k++)
				{
					if (c[k] > c[k + 1])
					{
						tem = c[k];
						c[k] = c[k + 1];
						c[k + 1] = tem;
					}
				}
			}

			System.out.printf("%.f",c[1]);
			for (i = 2;i <= j;i++)
			{
				System.out.printf(",%.f",c[j]);
			}
		}



		return 0;
	}
}

