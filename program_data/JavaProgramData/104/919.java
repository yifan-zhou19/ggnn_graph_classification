package <missing>;

public class GlobalMembers
{
	public static int x(int a, int b)
	{
		if (a > b)
		{
			a = a / 2;
		return x(a, b);
		}
		if (a < b)
		{
			b = b / 2;
		return x(a, b);
		}
		if (a = b)
		{
		return a;
		}
	}
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",x(a, b));
	}
}

