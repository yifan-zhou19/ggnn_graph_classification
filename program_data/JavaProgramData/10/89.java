package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static void Main()
	{
		int[] b = new int[26];
		int k;
		int f = new int(int x,int y,int a[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d\n",f(k, k, b) - 1);
	}
	public static int f(int x, int y, int[] a)
	{
		if (y == 0)
		{
			return (1);
		}
		int s = 0;
		if (y >= 1)
		{
			for (i = 0;i < y;i++)
			{
				if (a[i] >= a[y] != 0 && f(x, i, a) >= s)
				{
					s = f(x, i, a);
				}
			}
		}
		if (i == y)
		{
			return (s + 1);
		}
	}
}

