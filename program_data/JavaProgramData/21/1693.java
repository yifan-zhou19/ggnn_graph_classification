package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int[] c = new int[300];
		int j;
		int p = 1;
		int t;
		float ave;
		float x = 0F;
		float[] b = new float[300];
		float m;
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
		x = x + a[i];
		b[i] = 0F;
		c[i] = 0;
		}
		ave = x / n;
		for (i = 0;i < n;i++)
		{
			if (ave >= a[i])
			{
			b[i] = ave - a[i];
			}
			else
			{
				b[i] = a[i] - ave;
			}
			if (i > 0)
			{
				if (b[i] > m)
				{
				m = b[i];
				for (j = 0;j < p;j++)
				{
					c[j] = 0;
				}
				c[0] = a[i];
				p = 1;
				}
				else
				{
				if (b[i] == m)
				{
					c[p] = a[i];
					p = p + 1;
				}
				}
			}
			else
			{
				m = b[0];
				c[0] = a[0];
			}

		}
		for (j = 0;j < p;j++)
		{
			for (i = 0;i < p - 1 - j;i++)
			{
				if (c[i] > c[i + 1])
				{
					t = c[i];
					c[i] = c[i + 1];
					c[i + 1] = t;
				}
			}
		}
				System.out.printf("%d",c[0]);
				for (i = 1;i < p;i++)
				{
		System.out.printf(",%d",c[i]);
				}
	}
}

