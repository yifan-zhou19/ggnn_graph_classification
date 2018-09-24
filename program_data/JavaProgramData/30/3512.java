package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int m;
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1,m = 0;i <= n;i++)
	{
	a = i % 7;
	b = i % 10;
	c = i / 10;
	if (a != 0 && b != 7 && c != 7)
	{
	m = m + i * i;
	}
	}
	System.out.printf("%d",m);
	return 0;
	}
}

