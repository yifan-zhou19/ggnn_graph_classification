package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	b = 3;
	c = 5;
	d = 7;
	if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
	{
	System.out.printf("%d %d %d\n",b,c,d);
	}
	else if (a % 3 == 0 && a % 5 == 0)
	{
	System.out.printf("%d %d\n",b,c);
	}
	else if (a % 3 == 0 && a % 7 == 0)
	{
	System.out.printf("%d %d\n",b,d);
	}
	else if (a % 7 == 0 && a % 5 == 0)
	{
	System.out.printf("%d %d\n",c,d);
	}
	else if (a % 3 == 0)
	{
	System.out.printf("%d\n",b);
	}
	else if (a % 5 == 0)
	{
	System.out.printf("%d\n",c);
	}
	else if (a % 7 == 0)
	{
	System.out.printf("%d\n",d);
	}
	else
	{
	System.out.print("n\n");
	}
	return 0;
	}
}

