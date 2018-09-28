package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;;i++)
	{
	if (i * 100 <= n != 0 && i * 100 + 100> n)
	{
		break;
	}
	}
	System.out.printf("%d\n",i);
	n = n - i * 100;
	for (i = 0;;i++)
	{
	if (i * 50 <= n != 0 && i * 50 + 50> n)
	{
		break;
	}
	}
	System.out.printf("%d\n",i);
	n = n - 50 * i;
	for (i = 0;;i++)
	{
	if (i * 20 <= n != 0 && i * 20 + 20> n)
	{
		break;
	}
	}
	System.out.printf("%d\n",i);
	n = n - i * 20;
	for (i = 0;;i++)
	{
	if (i * 10 <= n != 0 && i * 10 + 10> n)
	{
		break;
	}
	}
	System.out.printf("%d\n",i);
	n = n - 10 * i;
	for (i = 0;;i++)
	{
	if (i * 5 <= n != 0 && i * 5 + 5> n)
	{
		break;
	}
	}
	System.out.printf("%d\n",i);
	n = n - i * 5;
	for (i = 0;;i++)
	{
	if (i <= n != 0 && i + 1> n)
	{
		break;
	}
	}
	System.out.printf("%d",i);
	return 0;
	}
}

