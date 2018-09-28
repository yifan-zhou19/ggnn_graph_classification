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
	a = (n - n % 100) / 100;
	b = ((n % 100) - (n % 100) % 50) / 50;
	c = (((n % 100) % 50) - ((n % 100) % 50) % 20) / 20;
	d = (((n % 100) % 50) % 20 - (((n % 100) % 50) % 20) % 10) / 10;
	e = ((((n % 100) % 50) % 20) % 10 - ((((n % 100) % 50) % 20) % 10) % 5) / 5;
	f = n % 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);

	return 0;
	}
}

