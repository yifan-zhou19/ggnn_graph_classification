package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int n;
	int i;
	int p = 0;
	int q = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 1;
	while (i <= n)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a >= p)
		{
			q = p,p = a;
		}
		if (a < p && a> q)
		{
			p = p,q = a;
		}
		if (a <= q)
		{
			p = p,q = q;
		}
		i = i + 1;
	}
	System.out.printf("%d\n%d",p,q);
		return 0;
	}
}

