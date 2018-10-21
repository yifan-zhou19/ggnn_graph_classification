package <missing>;

public class GlobalMembers
{
	public static int[] k = new int[99999];

	public static int[] x = new int[99999];
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int j;
		int r;
		int t;
		int m = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			k[a - 1] = b + c;
			x[i] = a;
		}
		for (j = n - 1;j >= 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (k[r] >= k[r + 1])
				{
					t = k[r + 1];
					k[r + 1] = k[r];
					k[r] = t;
					t = x[r + 1];
					x[r + 1] = x[r];
					x[r] = t;
				}

			}
			m++;
			if (m > 3)
			{
				break;
			}
		}

			System.out.printf("%d %d\n%d %d\n%d %d\n",x[n - 1],k[n - 1],x[n - 2],k[n - 2],x[n - 3],k[n - 3]);
			return 0;
	}
}

