package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int i;
		int[] b = new int[500];
		int j = 0;
		int m;
		int e;
		int n;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 == 1)
			{
				e = a[i];
				b[j] = e;
				j++;
			}
		}
		n = j;
		for (int k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					m = b[i];
					b[i] = b[i + 1];
					b[i + 1] = m;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < b[n - 1])
			{
			System.out.printf("%d,",b[i]);
			}
			else
			{
				System.out.printf("%d",b[i]);
			}
		}
		return 0;
	}
}

