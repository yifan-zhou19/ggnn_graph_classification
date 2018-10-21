package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[400];
		int[] c = new int[400];
		int n;
		int i;
		int j;
		int m;
		int temp;
		int[] d = new int[400];
		int k;
		float[] b = new float[400];
		float t;
		float max;
		float s = 0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			s = s + a[i];
		}
		t = s / n;
		for (i = 1;i <= n;i++)
		{
			if (a[i] >= t)
			{
				b[i] = a[i] - t;
			}
			else
			{
				b[i] = t - a[i];
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
		m = 0;
			for (i = 1;i <= n;i++)
			{
				if (b[i] >= max)
				{
					c[m] = a[i];
				}
				m++;
			}
			for (j = 0;j < m - 1;j++)
			{
				for (i = 0;i < m - 1 - j;i++)
				{
					if (c[i] > c[i + 1])
					{
						temp = c[i];
						c[i] = c[i + 1];
						c[i + 1] = temp;
					}
				}
			}
					k = 0;
				for (i = 0;i < m;i++)
				{
					if (c[i] > 0)
					{
					d[k] = c[i];
					k++;
					}
				}
					System.out.printf("%d",d[0]);
					for (i = 1;i < k;i++)
					{
						System.out.printf(",%d",d[i]);
					}
	}






}

