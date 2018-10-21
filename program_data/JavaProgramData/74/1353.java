package <missing>;

public class GlobalMembers
{
	public static int panduan(int t)
	{
		int q;
		int c = 0;
		int z;
		int po;
		int[] b = new int[20000];
		po = t;
		for (q = 0;t != 0;q++)
		{
		b[q] = t % 10;
		t = t / 10;
		z = q;
		}
		for (q = 0;q <= z;q++)
		{
			c = 10 * c + b[q];
		}
		if (c == po)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int j;
		int i;
		int r;
		int shuzi = 0;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		for (i = 0;i <= n - m;i++)
		{
			a[i] = m + i;
		}
		for (j = 0;j <= n - m;j++)
		{
			for (i = 2;i < a[j];i++)
			{
				if (a[j] % i == 0)
				{
					a[j] = 0;
					break;
				}
			}
		}
		for (i = 0;i <= n - m;i++)
		{
			if (a[i] != 0)
			{
				if (panduan(a[i]) == 0)
				{
					a[i] = 0;
				}
			}
		}

		for (i = 0;i <= n - m;i++)
		{
			if (a[i] != 0)
			{
				shuzi++;
			}
		}
		if (shuzi == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i <= n - m;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%d",a[i]);
					r = i;
					break;
				}
			}
			for (i = r + 1;i <= n - m;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}


		return 0;
	}








}

