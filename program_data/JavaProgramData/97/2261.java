package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	b = a / 100;
	System.out.printf("%d\n",b);
	a = a - a / 100 * 100;
	b = a / 50;
	System.out.printf("%d\n",(b));
	a = a - a / 50 * 50;
	b = a / 20;
	System.out.printf("%d\n",b);
	a = a - a / 20 * 20;
	b = a / 10;
	System.out.printf("%d\n",b);
	a = a - a / 10 * 10;
	b = a / 5;
	System.out.printf("%d\n",b);
	a = a - a / 5 * 5;
	System.out.printf("%d\n",a);
	return 0;
	}
}

