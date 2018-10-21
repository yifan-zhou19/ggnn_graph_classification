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
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = n % 100;
	b = a % 50;
	c = b % 20;
	d = c % 10;
	e = d % 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",n / 100,a / 50,b / 20,c / 10,d / 5,e);

	return 0;
	}

}

