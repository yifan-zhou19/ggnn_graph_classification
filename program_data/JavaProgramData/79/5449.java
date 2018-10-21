package <missing>;

public class GlobalMembers
{
	public static int[] mon = new int[1000];
	public static void Main()
	{

		void fking(int a[1000],int k,int p);
		int n;
		int m;
		int j;

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
		if ((n == 0) && (m == 0))
		{
			break;
		}
		if (m == 1)
		{
			System.out.printf("%d\n",n);
		}

		else
		{
			for (j = 1;j <= n;j++)
			{
			mon[j] = j;
			}
		fking(mon, n, m);
		}

		}
	}

	public static void fking(int[] a, int k, int p)
	{
		int[] b = new int[1000];
		int i;
		if (k >= p)
		{
			for (i = 1;i <= k - p;i++)
			{
				b[i] = a[p + i];
			}
			for (i = k - p + 1;i <= k - 1;i++)
			{
				b[i] = a[i + p - k];
			}
			fking(b, k - 1, p);
		}
		else
		{
			if (k > 0 && k < p)
			{
				for (i = 1;i <= k - p % k;i++)
				{
					b[i] = a[p % k + i];
				}
				for (i = k - p % k + 1;i <= k - 1;i++)
				{
					b[i] = a[i - k + p % k];
				}
				if (k >= 2)
				{
					fking(b, k - 1, p);
				}
				else
				{
					System.out.printf("%d\n",b[1]);
				}

			}
		}
	}


}

