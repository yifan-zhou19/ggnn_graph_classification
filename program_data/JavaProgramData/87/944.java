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
	double y;
	double z;
	for (int i = 1;a != 0 || b != 0 || c != 0 || d != 0 || e != 0 || f != 0;i++)
	{
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

	y = 60 * 60 * a + 60 * b + c;
	z = 60 * 60 * (d + 12) + 60 * e + f;
	s = z - y;
	if (a != 0 || b != 0 || c != 0 || d != 0 || e != 0 || f != 0)
	{
	System.out.printf("%d\n",s);
	}
	}
	return 0;
	}
}

