package <missing>;

public class GlobalMembers
{
	public static void maopao(int[] a, int n)
	{
		int i;
		int k;
		int t;
		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int i;
		int n;
		int c;
		int m;
		int x;
		x = 0;
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
			if (a[i] % 2 != 0)
			{
				b[x] = a[i];
				x = x + 1;

			}
		}
		c = 0;
		maopao(b, x);
		for (c = 0;c < x - 1;c++)
		{
			  System.out.printf("%d,",b[c]);
		}
		System.out.printf("%d",b[x - 1]);
		return 0;
	}
}

