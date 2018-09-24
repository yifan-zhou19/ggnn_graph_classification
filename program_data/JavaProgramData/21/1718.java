package <missing>;

public class GlobalMembers
{
	public static void sort(float[] c, int k)
	{
		int i;
		int j;
		float t;
		for (i = 1;i <= k;i++)
		{
			int m = i;
			for (j = i + 1;j <= k;j++)
			{
				if (c[j] < c[i])
				{
					m = j;
				}
			}
			if (m != i)
			{
				t = c[m];
				c[m] = c[i];
				c[i] = t;
			}
		}
	}


	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		float[] a = new float[301];
		float sum = 0F;
		float av;
		float[] b = new float[301];
		float[] c = new float[301];
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
			sum += a[i];
		}
		av = sum / n;
		for (i = 1;i <= n;i++)
		{
			if (a[i] >= av)
			{
				b[i] = a[i] - av;
			}
			else
			{
				b[i] = av - a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			int res = 1;
			int j;
			for (j = 1;j <= n;j++)
			{
				if (b[j] > b[i])
				{
					res = 0;
					break;
				}
			}
			if (res != 0)
			{
				k++;
				c[k] = a[i];
			}
		}
		sort(c, k);
		System.out.printf("%.0f",c[1]);
		for (i = 2;i <= k;i++)
		{
			System.out.printf(",%.0f",c[i]);
		}
	}

}

