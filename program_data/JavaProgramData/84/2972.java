package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int c;
	int n;
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}

	while (n != 2)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	if (a >= b)
	{
	if (a >= c)
	{
	if (b >= c)
	{
	a = a;
	}
	else
	{
		b = c;
	}
	}
	else
	{
		b = a;
	a = c;
	}
	}
	else
	{
	if (a >= c)
	{
		c = b;
		b = a;
		a = c;
	}
	else
	{
	if (b >= c)
	{
		a = b;
		b = c;
	}
	else
	{
	a = c;
	}
	}
	}

	n = n - 1;
	}
	System.out.printf("%d\n",a);
	System.out.printf("%d\n",b);
	}
}

