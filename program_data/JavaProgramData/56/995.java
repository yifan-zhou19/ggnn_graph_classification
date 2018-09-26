package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n >= 10000)
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int k;
	a = n / 10000;
	b = (n - a * 10000) / 1000;
	c = (n - a * 10000 - b * 1000) / 100;
	d = (n - a * 10000 - b * 1000 - c * 100) / 10;
	e = n - a * 10000 - b * 1000 - c * 100 - d * 10;
	k = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
	System.out.printf("%d",k);
	}
	else if (n < 10000 && n >= 1000)
	{
	int a;
	int b;
	int c;
	int d;
	int k;
	a = n / 1000;
	b = (n - a * 1000) / 100;
	c = (n - a * 1000 - b * 100) / 10;
	d = n - a * 1000 - b * 100 - c * 10;
	k = d * 1000 + c * 100 + b * 10 + a;
	System.out.printf("%d",k);
	}
	else if (n >= 100)
	{
	int a;
	int b;
	int c;
	int k;
	a = n / 100;
	b = (n - a * 100) / 10;
	c = n - a * 100 - b * 10;
	k = c * 100 + b * 10 + a;
	System.out.printf("%d",k);
	}
	else if (n >= 10)
	{
	int a;
	int b;
	int k;
	a = n / 10;
	b = n - a * 10;
	k = b * 10 + a;
	System.out.printf("%d",k);
	}
	else
	{
		System.out.printf("%d",n);
	}
	return 0;
	}

}

