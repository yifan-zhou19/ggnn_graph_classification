package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[400];
		int k;
		int[] c = new int[400];
		int l;
		float m;
		float j = 0F;
		float[] b = new float[400];
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
			j = j + a[i];
		}
		j = j / (float)n;
		//printf("%.2f",j);
		for (i = 0;i < n;i++)
		{
			if ((a[i] - j) >= 0)
			{
				b[i] = (a[i] - j);
			}
			else
			{
				b[i] = (j - a[i]);
			}
		}
		for (i = 1,m = b[0];i < n;i++)
		{
			if (m < b[i])
			{
				m = b[i];
			}
		}
		for (i = 0,k = 0;i < n;i++)
		{
			if (b[i] == m)
			{
				c[k++] = a[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			for (l = 0;l < k - i - 1;l++)
			{
				if (c[l] > c[l + 1])
				{
					n = c[l];
					c[l] = c[l + 1];
					c[l + 1] = n;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",c[i]);
			}
			else
			{
				System.out.printf(",%d",c[i]);
			}
		}
	}
}

