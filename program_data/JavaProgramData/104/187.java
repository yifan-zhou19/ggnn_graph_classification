package <missing>;

public class GlobalMembers
{
	public static int result(int x,int y)
	{
		int t = 0;
		if (x == y)
		{
			t = x;
		}
		else if (x > y)
		{
			t = result(x / 2, y);
		}
		else if (x < y)
		{
			t = result(x, y / 2);
		}
		return t;
	}
	public static void Main()
	{
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",result(m, n));

	}
}

