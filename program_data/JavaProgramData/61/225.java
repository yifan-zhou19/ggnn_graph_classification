package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int x;
		int num;
		int i;
		int[] a = new int[10000];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			a[i] = f(b);
		}
		for (i = 1;i <= num;i++)
		{
			System.out.printf("%d\n", a[i]);
		}
		return 0;
	}
	public static int f(int x)
	{
		if (x == 1 || x == 2)
		{
			return 1;
		}
		else
		{
			int c;
			c = f(x - 1) + f(x - 2);
			return c;
		}
	}
}

