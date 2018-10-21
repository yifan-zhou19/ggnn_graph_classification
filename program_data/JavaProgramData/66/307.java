package <missing>;

public class GlobalMembers
{
	public static int y;
	public static int m;
	public static int d;
	public static int sum;
	public static int judy(int y)
	{
		if (y % 4 == 0 && y % 100)
		{
			return 1;
		}
		else if (y % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int judm(int m)
	{
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		{
			return 3;
		}
		else if (m == 2)
		{
			return judy(y);
		}
		else
		{
			return 2;
		}
	}
	public static void g(int a)
	{
		if (a == 0)
		{
			System.out.print("Sun.\n");
		}
		if (a == 1)
		{
			System.out.print("Mon.\n");
		}
		if (a == 2)
		{
			System.out.print("Tue.\n");
		}
		if (a == 3)
		{
			System.out.print("Wed.\n");
		}
		if (a == 4)
		{
			System.out.print("Thu.\n");
		}
		if (a == 5)
		{
			System.out.print("Fri.\n");
		}
		if (a == 6)
		{
			System.out.print("Sat.\n");
		}
	}
	public static void Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		sum = 0;
		t = y % 400;
		for (i = 1;i < t;i++)
		{
			sum += 1 + judy(i);
		}
		if (t == 0)
		{
			sum = -2;
		}
		for (i = 1;i < m;i++)
		{
			sum += judm(i);
		}
		sum += d;
		sum %= 7;
		g(sum);
	}
}

