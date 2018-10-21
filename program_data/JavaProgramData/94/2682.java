package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int e;
		int n;
		int m;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
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
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if ((a[i]) % 2 != 0)
			{
				b[m] = a[i];
				m++;
			}
			else
			{
				b[m] = b[m];
			}
		}
		m = m - 1;
		for (k = 1;k <= m + 1;k++)
		{
		for (i = 0;i < m + 1 - k;i++)
		{
			if (b[i] > b[i + 1])
			{
				e = b[i + 1];
				b[i + 1] = b[i];
				b[i] = e;
			}
		}
		}
		for (i = 0;i < m;i = i + 1)
		{
		System.out.printf("%d,",b[i]);
		}
	System.out.printf("%d",b[m]);
	}


}

