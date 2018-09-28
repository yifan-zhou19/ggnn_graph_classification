package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int a;
	int b;
	int c;
	int d;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	a = x / 10000,b = x / 1000 - a * 10,c = x / 100 - a * 100 - b * 10,d = x / 10 - a * 1000 - b * 100 - c * 10,e = x - a * 10000 - b * 1000 - c * 100 - d * 10;
	if (a != 0)
	{
		System.out.printf("%d%d%d%d%d",e,d,c,b,a);
	}
	if (a == 0 && b != 0)
	{
		System.out.printf("%d%d%d%d",e,d,c,b);
	}
	if (b == 0 && c != 0)
	{
		System.out.printf("%d%d%d",e,d,c);
	}
	if (c == 0 && b != 0)
	{
		System.out.printf("%d%d",e,d);
	}
	if (b == 0 && a != 0)
	{
		System.out.printf("%d",e);
	}
	}
}

