package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j = 0;
		int k;
		int m;
		int[] c = new int[300];
		float p;
		float d = 0.0F;
		float[] b = new float[300];
		float t = 0F;
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
			d = d + (float)a[i];
		}
		p = d / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= p)
			{
			b[i] = a[i] - p;
			}
			else
			{
				b[i] = p - a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= t)
			{
				t = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t == b[i])
			{
					c[j] = i;
					j = j + 1;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (k = 0;k < j - i - 1;k++)
			{
				if (a[c[k]] > a[c[k + 1]])
				{
					m = a[c[k]];
					a[c[k]] = a[c[k + 1]];
					a[c[k + 1]] = m;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[c[i]]);
			}
			else
			{
				System.out.printf(",%d",a[c[i]]);
			}
		}
	}
}

