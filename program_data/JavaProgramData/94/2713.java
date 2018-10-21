package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int d;
		int m;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		t = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			d = a[i] % 2;
			if (d == 1)
			{
				t = t + 1;
			}
		}
		int[] b = new int[t];
		m = 0;
		for (i = 0;i < n;i++)
		{
			d = a[i] % 2;
			if (d == 1)
			{
			  b[m] = a[i];
			  m = m + 1;
			}
		}
		for (m = 0;m < t;m++)
		{
			for (j = t - 1;j > m;j--)
			{
				if (b[j] < b[j - 1])
				{
					k = b[j];
					b[j] = b[j - 1];
					b[j - 1] = k;
				}
			}
		}
		for (m = 0;m < (t - 1);m++)
		{
			System.out.printf("%d,",b[m]);
		}
		System.out.printf("%d",b[t - 1]);
		return 0;
	}


}

