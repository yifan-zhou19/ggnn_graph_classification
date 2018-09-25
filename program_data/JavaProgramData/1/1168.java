package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static int y;
	public static int a(int x, int i)
	{
		k = 0;
		b(x, i);
		return k;
	}
	public static void b(int x, int i)
	{
		for (i = i;i <= x;i++)
		{
			if (x % i == 0)
			{
				b(x / i, i);
			}
		}
		if (x == 1)
		{
			k = k + 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int x;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			y = x;
			System.out.printf("%d\n",a(x, 2));
		}
		return 0;
	}
}

