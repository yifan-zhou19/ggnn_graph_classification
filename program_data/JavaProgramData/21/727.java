package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		float[] a = new float[300];
		float jun;
		float sum;
		float max;
		float k;
		float t;
		sum = 0F;
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
		jun = sum / n;
		max = jun - a[0];
		for (i = 1;i < n;i++)
		{
			k = a[i] - jun;
			if (k < 0F)
			{
				k = 0 - k;
			}
			if (k > max)
			{
				max = k;
			}
		}
		for (i = 0;i < n;i++)
		{
			k = a[i] - jun;
			if (k < 0F)
			{
				k = 0 - k;
			}
			if (k == max)
			{
				System.out.printf("%d",(int)a[i]);
				break;
			}
		}
		m = i + 1;
		for (i = m;i < n;i++)
		{
			k = a[i] - jun;
			if (k < 0F)
			{
				k = 0 - k;
			}
			if (k == max)
			{
				System.out.printf(",%d",(int)a[i]);
			}
		}
		return 0;
	}

}

