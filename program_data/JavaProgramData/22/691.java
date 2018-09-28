package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
	char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	b = 0;
	c = 0;
	for (; ;)
	{
	d = System.in.read();
	if (d != ',')
	{
	break;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	if (b > a)
	{
		c = a;
	a = b;
	}
	if (b < a && b> c)
	{
	c = b;
	}
	}
	if (c == 0)
	{
	System.out.print("No");
	}
	else
	{
	System.out.printf("%d",c);
	}
		return 0;
	}

}

