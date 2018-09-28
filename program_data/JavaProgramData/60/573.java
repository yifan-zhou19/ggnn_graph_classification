package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int y;
		int s = 0;
		for (y = 1;y <= x;y++)
		{
			if (x % y == 0)
			{
				s += 1;
			}
		}
		if (s == 2)
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
		int s;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 2;i <= n;i++)
		{
			if (f(i) == 1)
			{
				a[k] = i;
				k++;
			}
		}
		s = 0;
		for (i = 0;i <= k - 2;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				s += 1;
			}
		}
		if (s == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

