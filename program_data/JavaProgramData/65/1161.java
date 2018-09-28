package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	c = 0;
	d = 0;
	for (i = 1;i <= n;i++)
	{
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
	if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
	{
	c++;
	}
	else if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
	{
	d++;
	}
	else if (a == b)
	{
		c = c;
		d = d;
	}
	}
	if (c > d)
	{
	System.out.print("A");
	}
	else if (c < d)
	{
	System.out.print("B");
	}
	else if (c = d)
	{
	System.out.print("Tie");
	}
	return 0;
	}


}

