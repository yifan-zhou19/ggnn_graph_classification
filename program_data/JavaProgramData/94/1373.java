package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int[] c = new int[500];
		int[] d = new int[500];
		int N;
		int i;
		int t;
		int m;
		int h;
		int max;
		t = 0;
		h = 0;
		max = 1;
		c[0] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[t] = a[i];
				t++;
			}
		}
		for (i = 0;i <= t;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 1;i <= (max - 1) / 2;i++)
		{
			c[i] = c[i - 1] + 2;
		}
		for (i = 0;i <= (max - 1) / 2;i++)
		{
		for (m = 0;m <= t;m++)
		{
					if (c[i] == b[m])
					{
					d[h] = c[i];
					h++;
					}
		}
		}
		for (i = 0;i < h - 1;i++)
		{
			 System.out.printf("%d,",d[i]);
		}
		if (i = h - 1)
		{
			System.out.printf("%d",d[h - 1]);
		}
		return 0;
	}




}

