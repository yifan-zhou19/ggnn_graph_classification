package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int c = 0;
		int j;
		int temp2;
		float b;
		float temp1;
		float[] f = new float[300];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			c = c + a[i];
		}
		b = (float)c / (float)n;
		for (i = 0;i < n;i++)
		{
			if ((float)a[i] - b >= 0F)
			{
				f[i] = (float)a[i] - b;
			}
			else
			{
				f[i] = b - (float)a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (f[j] < f[j + 1])
				{
					temp1 = f[j];
					f[j] = f[j + 1];
					f[j + 1] = temp1;
					temp2 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp2;
				}
			}
		}
		i = 0;
		while (f[i] == f[i + 1])
		{
			i = i + 1;
		}
		if (i == 0)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			for (j = 0;j < i;j++)
			{
				System.out.printf("%d,",a[j]);
			}
			System.out.printf("%d",a[i]);
		}
	}
}

