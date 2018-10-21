package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] a = new float[300];
		float[] b = new float[300];
		int[] c = new int[300];
		float sum = 0F;
		float max;
		int i;
		int j;
		int n;
		int m = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			sum = sum + a[i];
		}
		sum = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i] - sum;
			if (b[i] < 0F)
			{
				b[i] = 0 - b[i];
			}
		}
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				c[m] = (int)a[i];
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (c[i] > c[j])
				{
					k = c[j];
					c[j] = c[i];
					c[i] = k;
				}
			}
		}
			for (i = 0;i < m - 1;i++)
			{
				System.out.printf("%d,",c[i]);
			}
			System.out.printf("%d",c[m - 1]);
	}
}

