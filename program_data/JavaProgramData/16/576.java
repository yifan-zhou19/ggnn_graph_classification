package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
	char b;
	char c;
	char d;
	char e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	b = (int)(a / 1000);
	c = (int)((a - 1000 * b) / 100);
	d = (int)(a / 10) - c * 10 - 100 * b;
	e = a - 10 * d - 100 * c - 1000 * b;
	if (b != 0)
	{
	System.out.printf("%d%d%d%d",e,d,c,b);
	}
	if (b == 0 && c != 0)
	{
	System.out.printf("%d%d%d",e,d,c);
	}
	if (a > 9 && a < 100)
	{
	System.out.printf("%d%d",e,d);
	}
	if (a < 10)
	{
	System.out.printf("%d",e);
	}
	}

}

