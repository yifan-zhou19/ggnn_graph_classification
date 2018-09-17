package <missing>;

public class GlobalMembers
{
	public static int f(int p)
	{
		if (p == 1)
		{
			p = -1;
		}
		if (p % 2 == 0)
		{
			p = 0;
		}
		if (p % 2 == 1)
		{
			p = 1;
		}
		return (p);
	}

	public static void Main()
	{
		int x;
		int y;
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		for (i = 0; ;i++)
		{
			if (f(a[i]) == -1)
			{
				k = i;
				break;
			}
			if (f(a[i]) == 0)
			{
				a[i + 1] = a[i] / 2;
			}
			if (f(a[i]) == 1)
			{
				a[i + 1] = (a[i] - 1) / 2;
			}
		}
		for (i = 0; ;i++)
		{
			if (f(b[i]) == -1)
			{
				j = i;
				break;
			}
			if (f(b[i]) == 0)
			{
				b[i + 1] = b[i] / 2;
			}
			if (f(b[i]) == 1)
			{
				b[i + 1] = (b[i] - 1) / 2;
			}
		}
		if (k < j)
		{
			n = k;
		}
		else
		{
			n = j;
		}
		for (i = 0;i <= n;i++)
		{
			if (a[k - i] != b[j - i])
			{
				System.out.printf("%d\n",a[k - i + 1]);
				break;
			}

		}
		if (i == n + 1)
		{
			System.out.printf("%d\n",a[k - n]);
		}

	}

}

