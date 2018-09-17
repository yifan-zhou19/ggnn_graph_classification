package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y);
		int x;
		int y;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		l = f(x, y);
		System.out.printf("%d",l);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		return 0;
	}
	public static int f(int x,int y)
	{
		int a;
		if (x == 1 || y == 1)
		{
			a = 1;
		}
		else if (x % 2 == 0 && y % 2 == 1 && x + 1 == y)
		{
			a = x / 2;
		}
		else if (x == y)
		{
			a = x;
		}
		else if (x > y)
		{
			a = f(x / 2, y);
		}
		else
		{
			a = f(x, y / 2);
		}
		return a;
	}

}

