package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int j;
		int n;
		float p = 0F;
		float q = 0F;
		float[] c = new float[10];
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
			a[j] = Integer.parseInt(tempVar2);
		}
		}
		for (j = 0;j <= n - 1;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[j] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 0;j < n;j++)
		{
			if (b[j] >= 90 && b[j] <= 100)
			{
				c[j] = 4.0F;
			}
			if (b[j] >= 85 && b[j] <= 89)
			{
				c[j] = 3.7F;
			}
			if (b[j] >= 82 && b[j] <= 84)
			{
				c[j] = 3.3F;
			}
			if (b[j] >= 78 && b[j] <= 81)
			{
				c[j] = 3.0F;
			}
			if (b[j] >= 75 && b[j] <= 77)
			{
				c[j] = 2.7F;
			}
			if (b[j] >= 72 && b[j] <= 74)
			{
				c[j] = 2.3F;
			}
			if (b[j] >= 60 && b[j] <= 63)
			{
				c[j] = 1.0F;
			}
			if (b[j] >= 68 && b[j] <= 71)
			{
				c[j] = 2.0F;
			}
			if (b[j] >= 64 && b[j] <= 67)
			{
				c[j] = 1.5F;
			}
			if (b[j] < 60)
			{
				c[j] = 0.0F;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			p = p + a[j];
		}
		for (j = 0;j <= n - 1;j++)
		{
			q = q + a[j] * c[j];
		}
		System.out.printf("%.2f",q / p);
	}

}

