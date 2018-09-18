package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[300];
		int[] c = new int[300];
		int t;
		float x;
		float[] b = new float[300];
		float s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0,x = 0F;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[m] = Integer.parseInt(tempVar2);
			}
			x = x + a[m];
		}
		x = x / n;
		for (m = 0,s = 0F;m < n;m++)
		{
			b[m] = x - a[m];
			if (s < 0F)
			{
				s = -s;
			}
			if ((b[m] > 0F && b[m] > s) || (b[m] < 0F && b[m] < -s))
			{
				s = b[m];
			}
		}
		if (s < 0F)
		{
			s = -s;
		}
		for (m = 0,t = 0;m < n;m++)
		{
			if (b[m] == s || b[m] == -s)
			{
			c[t] = a[m];
			t++;
			}
		}
			c[t] = 'a';
		for (m = 0;c[m + 1] != 'a';m++)
		{
			for (t = m + 1;c[t] != 'a';t++)
			{
			if (c[m] > c[t])
			{
				n = c[m];
				c[m] = c[t];
				c[t] = n;
			}
			}
		}
		for (m = 0;c[m + 1] != 'a';m++)
		{
			System.out.printf("%d,",c[m]);
		}
		System.out.printf("%d",c[m]);
		return 0;
	}
}

