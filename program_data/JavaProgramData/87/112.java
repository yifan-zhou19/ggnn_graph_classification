package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int s;
	int m;
	int n;
	int r;
	int i;
	int j;
	int[] x = new int[6];
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
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		e = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		f = Integer.parseInt(tempVar6);
	}
	for (j = 0;x[0] != 0;j++)
	{
	for (i = 0;i < 6;i++)
	{
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			x[i] = Integer.parseInt(tempVar7);
		}
	}
	s = d + 12 - a - 1;
	m = 60 - b - 1 + e;
	n = 60 - c + f;
	r = s * 3600 + m * 60 + n;
	System.out.printf("%d\n",r);
	a = x[0];
	b = x[1];
	c = x[2];
	d = x[3];
	e = x[4];
	f = x[5];
	}
	return 0;
	}
}

