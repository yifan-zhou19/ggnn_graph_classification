package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int k;
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[100];
		k = 0;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		t = m;
		if ((m == 0) && (n == 0))
		{
			break;
		}
		else
		{
		   for (i = 0;i < n;i++)
		   {
			a[i] = i + 1;
		   }
			while (n > 1)
			{
			while (m > n)
			{
				m = m - n;
			}
			for (i = m;i < n;i++)
			{
			 b[i - m] = a[i];
			}
			for (i = 0;i < m - 1;i++)
			{
			 b[n - m + i] = a[i];
			}
			for (i = m;i < n;i++)
			{
			 a[i - m] = b[i - m];
			}
			for (i = 0;i < m - 1;i++)
			{
			 a[n - m + i] = b[n - m + i];
			}
			n = n - 1;
			m = t;
			}
			c[k] = a[0];
			k = k + 1;
		}
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%d\n",c[i]);
		}
	return 0;
	}


}

