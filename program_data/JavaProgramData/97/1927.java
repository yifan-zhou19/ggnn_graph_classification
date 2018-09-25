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
	int i1;
	int i2;
	int i3;
	int i4;
	int i5;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i1 = n % 100;
	a = (n - i1) / 100;

	n = n - 100 * a;
	i2 = n % 50;
	b = (n - i2) / 50;

	n = n - 50 * b;
	i3 = n % 20;
	c = (n - i3) / 20;

	n = n - 20 * c;
	i4 = n % 10;
	d = (n - i4) / 10;

	n = n - 10 * d;
	i5 = n % 5;
	e = (n - i5) / 5;

	n = n - 5 * e;
	f = n;
	System.out.printf("%d\n",a);
	System.out.printf("%d\n",b);
	System.out.printf("%d\n",c);
	System.out.printf("%d\n",d);
	System.out.printf("%d\n",e);
	System.out.printf("%d\n",f);


	return 0;
	}
}

