package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int i;
		int q = 0;
		int k;
		int e;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[i] = a[i];
				q++;
			}
			else
			{
				b[i] = 0;
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		}
		for (i = n - q;i < n;i++)
		{
			if (i < n - 1)
			{
			System.out.printf("%d,",b[i]);
			}
			else if (i == n - 1)
			{
				System.out.printf("%d",b[i]);
			}
		}
		return 0;
	}

}

