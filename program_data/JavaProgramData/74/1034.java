package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int y = 0;
		int p;
		p = x;
		while (x != 0)
		{
			y = y * 10 + x % 10;
			x = x / 10;
		}
		if (p == y)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int g(int x)
	{
		int k;
		int i;
		k = Math.sqrt(x);
		for (i = 2;i <= k;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == k + 1)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[300];
		int r = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (f(i) == 1 && g(i) == 1)
			{
				r++;
				a[r] = i;
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
			else
			{
				System.out.printf("%d",a[1]);
				for (i = 2;i <= r;i++)
				{
					System.out.printf(",%d",a[i]);
				}
			}
	}
}

