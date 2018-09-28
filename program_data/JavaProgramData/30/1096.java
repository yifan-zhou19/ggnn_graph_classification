package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n < 100 && n>0)
	{
	if (n % 7 != 0 && n % 10 != 7 && n / 10 != 7)
	{
		a = a + n * n;
	n = n - 1;
	}
	else
	{
	n = n - 1;
	}
	}
	System.out.printf("%d\n",a);
	return 0;
	}

}

