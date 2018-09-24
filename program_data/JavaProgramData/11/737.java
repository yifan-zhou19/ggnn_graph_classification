package <missing>;

public class GlobalMembers
{
	public static int run(int n)
	{
		if (n % 4 == 0 && n % 100 != 0)
		{
			return 1;
		}
		if (n % 400 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static int yue(int y,int n)
	{
		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
		{
			return 31;
		}
		if (run(y) == 1 && n == 2)
		{
			return 29;
		}
		if (run(y) == 0 && n == 2)
		{
			return 28;
		}
		return 30;
	}
	public static int days(int y,int m,int d)
	{
		int k = 0;
		for (int i = 1;i < m;i++)
		{
			k += yue(y, i);
		}
		k += d;
		return k;
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d",days(y, m, d));
		return 0;
	}
}

