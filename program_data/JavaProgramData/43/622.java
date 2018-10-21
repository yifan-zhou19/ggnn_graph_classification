package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int a;
	int b;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	if ((m % 2) == 0)
	{
	for (a = 3;a <= m / 2;a += 2)
	{
	for (i = 2;i < a;i++)
	{
	if (a % i == 0)
	{
		break;
	}
	}
	if (i < a)
	{
	continue;
	}
	else
	{
	b = m - a;
	for (i = 2;i < b;i++)
	{
	if (b % i == 0)
	{
		break;
	}
	}
	if (i < b)
	{
	continue;
	}
	else
	{
	System.out.printf("%d %d\n",a,b);
	}
	}
	}
	}
	return 0;
	}

}

