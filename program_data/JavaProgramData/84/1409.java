package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] u = new int[100];
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			u[i] = Integer.parseInt(tempVar2);
		}
	}
	int s = 0;
	int m = 0;
	for (i = 1;i <= n;i++)
	{
	while (s < u[i])
	{
		s = u[i];
	}
	}
	for (i = 1;i <= n;i++)
	{
	while (m < u[i] && u[i] < s)
	{
		m = u[i];
	}
	}
	System.out.printf("%d\n%d\n",s,m);
	return 0;
	}
}

