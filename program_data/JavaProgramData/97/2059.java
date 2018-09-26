package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.out.printf("%d\n",n / 100);
	n = n - n / 100 * 100;
	if (n >= 50)
	{
	System.out.printf("%d\n",n / 50);
	n = n - n / 50 * 50;
	}
	else
	{
	System.out.print("0\n");
	}
	if (n >= 20)
	{
	System.out.printf("%d\n",n / 20);
	n = n - n / 20 * 20;
	}
	else
	{
	System.out.print("0\n");
	}
	if (n >= 10)
	{
	System.out.printf("%d\n",n / 10);
	n = n - n / 10 * 10;
	}
	else
	{
	System.out.print("0\n");
	}
	if (n >= 5)
	{
	System.out.printf("%d\n",n / 5);
	n = n - n / 5 * 5;
	}
	else
	{
	System.out.print("0\n");
	}
	System.out.printf("%d\n",n);
	return 0;
	}
}

