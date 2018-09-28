package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int p;
		int q;
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
	if (a >= b)
	{
		p = a;
		q = b;
	}
	else
	{
		p = b;
		q = a;
	}
	for (int i = 2;i < n;i++)
	{
	int m;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		if (m >= p)
		{
			q = p;
			p = m;
		}
		else
		{
			if (m >= q)
			{
				q = m;
			}
		}
	}
	System.out.printf("%d\n%d\n",p,q);
	return 0;
	}
}

