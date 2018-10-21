package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int a;
	int b;
	int c;
	int d;
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
	b = a;
	d = a;
	for (i = 1;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		if (a > b)
		{
			b = a;
		}
		else
		{
			if (a > d)
			{
				d = a;
			}
		}
	}

	System.out.printf("%d\n%d",b,d);
	return 0;
	}
}

