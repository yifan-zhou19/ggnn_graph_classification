package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	b = (b > c)?b:c;
	c = (b < c)?b:c;
	i = 3;
	while (i <= a)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	if (d > b)
	{
	c = b;
	b = d;
	}
	if ((d < b) && (d> c))
	{
	c = d;
	}
	i++;
	}
	System.out.printf("%d\n",b);
	System.out.printf("%d",c);
	return 0;
	}

}

