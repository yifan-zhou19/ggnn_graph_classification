package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	int e;
	int i;
	int m;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int a;
	int b;
	int c;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a < b)
	{
	t = a;
	b = a;
	a = t;
	}
	for (i = 0;i < n - 2;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	if (c > a)
	{

	e = b;
	b = a;
	a = c;
	m = c;
	}
	else
	{
	if (a > c && c > b)
	{
	m = b;
	b = c;
	c = m;
	}
	}
	}
	System.out.printf("%d\n%d\n",a,b);

	}

}

