package <missing>;

public class GlobalMembers
{
	public static int LanJieShu(int x, int y, int[] c)
	{
		int j;
		int t;
		if (x == y - 1)
		{
			return 1;
		}
		t = 0;
		for (j = x + 1; j < y; j++)
		{
			if ((c[j] <= c[x]) && (LanJieShu(j, y, c) > t))
			{
				t = LanJieShu(j, y, c);
			}
		}
		return (t + 1);
	}
	public static void Main()
	{
		int n;
		int i;
		int u;
		int[] a = new int[26];
		int[] b = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			b[i] = LanJieShu(i, n, a);
		}
		u = 0;
		for (i = 0; i < n; i++)
		{
			if (b[i] >= u)
			{
				u = b[i];
			}
		}
		System.out.printf("%d\n", u);
	}
}

