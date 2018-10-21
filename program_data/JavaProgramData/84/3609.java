package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (b > a)
	{
	c = a;
	a = b;
	b = c;
	}
	for (i = 1;i <= n - 2;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	if (c > a)
	{
		b = a;
	a = c;
	}
	else if (c > b)
	{
	b = c;
	}
	}
	System.out.printf("%d\n%d\n",a,b);
	return 0;
	}

}

