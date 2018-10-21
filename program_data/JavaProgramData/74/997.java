package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int h;
		for (h = 2;h <= Math.sqrt(x);h++)
		{
			if (x % h == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int huiwen(int x)
	{
		int y = 0;
		int z = x;
		while (x != 0)
		{
			y = y * 10 + x % 10;
			x = x / 10;
		}
		if (z == y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int k = 0;
		int[] a = new int[1000];
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
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				k++;
				a[k] = i;
			}
		}
		if (k != 0)
		{
		for (i = 1;i < k;i++)
		{
			System.out.printf("%ld,",a[i]);
		}
		System.out.printf("%ld\n",a[k]);
		}
		else
		{
			System.out.print("no");
		}
	}
}

