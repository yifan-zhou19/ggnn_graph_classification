package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int w = 0;
		int k;
		float[] b = new float[40];
		float[] c = new float[40];
		float[] d = new float[40];
		float e;
		char[][] a = new char[40][7];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			if (strcmp(a[i],"male") == 0)
			{
				c[j] = b[i];
				j++;
			}
			if (strcmp(a[i],"female") == 0)
			{
				d[w] = b[i];
				w++;
			}
		}
	for (k = 1;k <= j;k++)
	{
		for (i = 0;i < j - k;i++)
		{
			if (c[i] > c[i + 1])
			{
				e = c[i + 1];
				c[i + 1] = c[i];
				c[i] = e;
			}
		}
	}

	for (k = 1;k <= w;k++)
	{
		for (i = 0;i < w - k;i++)
		{
			if (d[i] < d[i + 1])
			{
				e = d[i + 1];
				d[i + 1] = d[i];
				d[i] = e;
			}
		}
	}
	System.out.printf("%.2f",c[0]);
	for (i = 1;i < j;i++)
	{
		System.out.printf(" %.2f",c[i]);
	}
	for (i = 0;i < w;i++)
	{
		System.out.printf(" %.2f",d[i]);
	}
	return 0;
	}
}

