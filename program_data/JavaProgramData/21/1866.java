package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[300];
		float[] b = new float[300];
		int i;
		int n;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[n - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n - 1;i++)
		{
			sum = sum + a[i];
		}
		float m;
		m = sum / n;
		for (i = 0;i <= n;i++)
		{
			b[i] = a[i] - m;
			if (b[i] < 0F)
			{
				b[i] = m - a[i];
			}
		}
		float max = 0F;
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		int h = 0;
		int[] c = new int[300];
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] == max)
			{
				c[h] = a[i];
				h++;
			}
		}
		int j;
		int t;
		for (i = 0;i <= h - 2;i++)
		{
			for (j = 0;j <= h - 2;j++)
			{
				if (c[j] >= c[j + 1])
				{
					t = c[j + 1];
					c[j + 1] = c[j];
					c[j] = t;
				}
			}
		}
		for (i = 0;i <= h - 2;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d\n",c[h - 1]);
		return 0;
	}
}

