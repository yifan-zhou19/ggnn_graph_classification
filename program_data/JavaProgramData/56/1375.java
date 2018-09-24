package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n > 0)
	{
	a = n % 10;
	n = n / 10;
	i++;
	System.out.printf("%d",a);
	}
	return 0;
	}
}

