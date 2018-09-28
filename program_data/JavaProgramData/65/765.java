package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p = 0,q = 0;
	for (i = 0;i < n;i++)
	{
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
	if (a - b == 1)
	{
	q = q + 1;
	}
	if (a - b == 2)
	{
	p = p + 1;
	}
	if (b - a == 1)
	{
		p = p + 1;
	}
	if (b - a == 2)
	{
		q = q + 1;
	}
	}
	if (p > q)
	{
	System.out.print("A");
	}
	if (q > p)
	{
	System.out.print("B");
	}
	if (p == q)
	{
	System.out.print("Tie");
	}
	return 0;
	}
}

