package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		float sum = 0F;
		float t;
		float n;
		float[] a = new float[300];
		float aver;
		float max;
		float[] b = new float[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			sum = sum + a[i];
		}
		aver = sum / n;
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > aver)
			{
				b[i] = a[i] - aver;
			}
			else
			{
				b[i] = aver - a[i];
			}
		}
		max = b[0];
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] >= max)
			{
				max = b[i];
				k = i;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (b[i] == max)
			{
				System.out.printf("%.0f,",a[i]);
			}
		}
		System.out.printf("%.0f",a[k]);
	}

}

