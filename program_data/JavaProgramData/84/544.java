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
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a < b)
	{
	c = a;
	a = b;
	b = c;

	}
	n = n - 2;
	for (e = 1;e <= n;e++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	if (a < d)
	{
		b = a;
	  a = d;

	}
	else if (b < d)
	{
		b = d;
	}

	}
	System.out.printf("%d\n%d",a,b);


	}
}

