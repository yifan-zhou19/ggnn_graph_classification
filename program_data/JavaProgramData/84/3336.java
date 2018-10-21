package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int n;
	public static int Main()
	{
	a = 0;
	b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	do
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	n = n - 1;
	if (a >= b != 0 && a >= c != 0 && b >= c)
	{
	 a = a;
	 b = b;
	}
	else if (b >= a != 0 && b >= c != 0 && a >= c)
	{
	 d = a;
	 a = b;
	 b = d;
	}
	else if (a >= b != 0 && a >= c != 0 && c >= b)
	{
		a = a;
		b = c;
	}
	else if (b >= a != 0 && b >= c != 0 && c >= a)
	{
		a = b;
		b = c;
	}
	else if (c >= a != 0 && c >= b != 0 && a >= b)
	{
		b = a;
		a = c;
	}
	else if (c >= a != 0 && c >= b != 0 && b >= a)
	{
		a = c;
		b = b;
	}
	} while (n > 0);
	System.out.printf("%d\n",a);
	System.out.printf("%d\n",b);
	return 0;
	}
}

