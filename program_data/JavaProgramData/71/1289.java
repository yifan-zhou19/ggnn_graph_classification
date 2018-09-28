package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int y;
	int a;
	int b;
	int j;
	int p;
	int f;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b = Integer.parseInt(tempVar4);
	}
	if (a > b)
	{
		e = a;
		a = b;
		b = e;
	}
	if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
	{
	p = 0;
	f = 0;
	for (j = a;j < b;j++)
	{
	if (j == 1)
	{
		p = p + 31;
	}
	if (j == 2)
	{
		p = p + 29;
	}
	if (j == 3)
	{
		p = p + 31;
	}
	if (j == 4)
	{
		p = p + 30;
	}
	if (j == 5)
	{
		p = p + 31;
	}
	if (j == 6)
	{
		p = p + 30;
	}
	if (j == 7)
	{
		p = p + 31;
	}
	if (j == 8)
	{
		p = p + 31;
	}
	if (j == 9)
	{
		p = p + 30;
	}
	if (j == 10)
	{
		p = p + 31;
	}
	if (j == 11)
	{
		p = p + 30;
	}
	}
	if (p % 7 == 0)
	{
		System.out.print("YES\n");
		f = 1;
	}
	}

	else
	{
	p = 0;
	f = 0;
	for (j = a;j < b;j++)
	{
	if (j == 1)
	{
		p = p + 31;
	}
	if (j == 2)
	{
		p = p + 28;
	}
	if (j == 3)
	{
		p = p + 31;
	}
	if (j == 4)
	{
		p = p + 30;
	}
	if (j == 5)
	{
		p = p + 31;
	}
	if (j == 6)
	{
		p = p + 30;
	}
	if (j == 7)
	{
		p = p + 31;
	}
	if (j == 8)
	{
		p = p + 31;
	}
	if (j == 9)
	{
		p = p + 30;
	}
	if (j == 10)
	{
		p = p + 31;
	}
	if (j == 11)
	{
		p = p + 30;
	}
	}
	if (p % 7 == 0)
	{
		System.out.print("YES\n");
		f = 1;
	}
	}

	if (f == 0)
	{
		System.out.print("NO\n");
	}
	}
	return 0;
	}
}

