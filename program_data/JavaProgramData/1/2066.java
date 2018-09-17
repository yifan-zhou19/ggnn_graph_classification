package <missing>;

public class GlobalMembers
{
	public static int count;
	public static void f(int x,int y)
	{
		int i = 0;
		if (x >= y)
		{
		for (i = y;i <= x;i++)
		{
			if (i == x)
			{
				count++;
			}
			if (x % i == 0)
			{
				f(x / i, i);
			}
		}
		}
	}
	public static int Main()
	{
		int t;
		int n;
		int i;
		int x;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			count = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			f(x, 2);
			System.out.printf("%d\n",count);
		}
	}
}

