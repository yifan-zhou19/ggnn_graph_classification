package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	b = a / 2;
	if (a == 6)
	{
		System.out.print("3 3");
	return 0;
	}
	for (c = 3;c <= b;c++)
	{
		for (e = 0,d = 2;d < c;d++)
		{
		if (c % d == 0)
		{
	e = 1;
		}
		}
	if (e == 0)
	{
		f = a - c;
	for (e = 0,d = 2;d < f;d++)
	{
		if (f % d == 0)
		{
	e = 1;
		}
	}
	if (e == 0)
	{
	System.out.printf("%d %d\n",c,f);
	}
	}
	}
	System.in.read();
	System.in.read();
	}
}

