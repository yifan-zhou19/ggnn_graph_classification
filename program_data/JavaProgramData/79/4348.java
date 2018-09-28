package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int s = 0;
	int n;
	int m;
	for (j = 1;j <= 9;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 1; i <= n; i++)
	{
	s = (s + m) % i;
	}

	System.out.printf("%d\n", s + 1);
	}

	return 0;
	}
}

