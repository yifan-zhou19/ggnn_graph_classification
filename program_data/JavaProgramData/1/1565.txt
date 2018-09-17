package <missing>;

public class GlobalMembers
{
	public static int num(int b, int min)
	{
		int a;
		int c;

		for (a = min;a < b;a++)
		{
			if ((b % a == 0) && (b / a >= a))
			{
				if (num(b / a, a) == 1)
				{
					x++;
				}
			}
			if (a == m - 1)
			{
				return x;
			}
		}
		return 1;
	}
	public static int x = 1;
	public static int m;
	public static int Main()
	{
		int a;
		int n;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			m = b;
			b = num(b, 2);
			System.out.printf("%d\n",b);
			x = 1;
		}
		return 0;
	}
}

