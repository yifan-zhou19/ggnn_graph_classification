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
		int g;
		int h;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 10)
	{
	System.out.printf("%d",n);
	}
	else if (n < 100)
	{
		a = n % 10;
		b = n / 10;
	System.out.printf("%d%d",a,b);
	}
	else if (n < 1000)
	{
		c = n % 10,e = n / 100;
		d = (n / 10) % 10;
	System.out.printf("%d%d%d",c,d,e);
	}
	else if (n < 10000)
	{
		f = n % 10;
		g = (n % 100) / 10;
		h = (n / 100) % 10;
		i = n / 1000;
	System.out.printf("%d%d%d%d",f,g,h,i);
	}
	return 0;
	}
}

