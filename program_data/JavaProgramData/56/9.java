package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i = 5;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 0)
	{
	System.out.printf("%d",n);
	return 0;
	}
	while (n != 0)
	{
	System.out.printf("%d",n % 10);
	n = n / 10;
	}
	return 0;
	}

}

