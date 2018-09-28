package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
	int i;
	int d = 1;
	int e = 1;
	int g = 2;
	if (a == 1 || a == 2)
	{
	return 1;
	}
	else if (a == 3)
	{
	return 2;
	}
	else
	{
	for (i = 4;i <= a;i++)
	{
	d = e;
	e = g;
	g = d + e;
	}
	return g;
	}
	}
	public static int Main()
	{
	int n;
	int a;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d\n",(f(a)));
	}
	return 0;
	}
}

