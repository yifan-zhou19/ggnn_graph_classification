package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int digui = new int(int p,int q);
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	int a;
	int sum = 1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	for (j = 2;j < a;j++)
	{
		if (j * j > a)
		{
	break;
		}
	else if (a % j == 0)
	{
	sum = sum + digui(j, a / j);
	}
	}
	System.out.printf("%d\n",sum);
	}
	}
	public static int digui(int p,int q)
	{
	int z = 1;
	int d;
	if (p == q)
	{
	z = 1;
	}
	else if (p > q)
	{
	z = 0;
	}
	else
	{
	for (d = p;d < q;d++)
	{
		if (d * d > q)
		{
	break;
		}
	else if (q % d == 0)
	{
	z = z + digui(d, q / d);
	}
	}
	}
	return (z);
	}
}

