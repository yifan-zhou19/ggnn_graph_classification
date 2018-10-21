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
	int g;
	int h;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	b = a / 100;
	c = a % 100;
	d = c / 50;
	c = c % 50;
	e = c / 20;
	c = c % 20;
	f = c / 10;
	c = c % 10;
	g = c / 5;
	c = c % 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,d,e,f,g,c);
	return 0;
	}
}

