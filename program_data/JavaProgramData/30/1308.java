package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int m = 0;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	if ((i / 10) == 7 || (i % 10 == 7) || (i % 7 == 0))
	{
	continue;
	}
	else
	{
	m = m + i * i;
	}
	}
	System.out.printf("%d",m);
	}
}

