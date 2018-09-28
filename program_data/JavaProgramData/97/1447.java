package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = n / 100;
	b = (n - n / 100 * 100) / 50;
	c = (n - (a * 100 + b * 50)) / 20;
	d = (n - (a * 100 + b * 50 + c * 20)) / 10;
	e = (n - n / 10 * 10) / 5;
	f = (n - n / 5 * 5);
	System.out.printf("%d\n",a);
	System.out.printf("%d\n",b);
	System.out.printf("%d\n",c);
	System.out.printf("%d\n",d);
	System.out.printf("%d\n",e);
	System.out.printf("%d\n",f);

	return 0;
	}
}

