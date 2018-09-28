package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int m;
		int n;
		int t;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] b = new int[500];
		int[] a = new int[500];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		n = 0;
		for (i = 0;i < N;i++)
		{
			if (b[i] % 2 == 1)
			{
				n++;
			}
		}
		k = 0;
		for (i = 0;i < N;i++)
		{
			if (b[i] % 2 == 1)
			{
				a[k] = b[i];
				k++;
			}
		}
		for (m = 0;m < n;m++)
		{
			for (i = m;i < n;i++)
			{
				if (a[m] > a[i])
				{
					t = a[m];
					a[m] = a[i];
					a[i] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

