package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 10)
	{
	System.out.printf("%d",n);
	}
	else if (n == 10)
	{
	System.out.print("1");
	}
	else
	{
		do
		{
		a = n % 10;
	System.out.printf("%d",a);
	n = (n - a) / 10;
		} while (n >= 10);
	a = n;
	System.out.printf("%d",a);
	}
	return 0;
	}
}

