package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int p;
	int i;
	int j;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 3;j <= n / 2;j += 2)
	{
	a = 0;
	for (i = 3;i <= (int)Math.sqrt(j);i += 2)
	{
	if (j % i == 0)
	{
		a = 1;
		break;
	}
	}
	for (i = 3;i <= (int)Math.sqrt(n - j);i += 2)
	{
	if ((n - j) % i == 0)
	{
		a = 1;
		break;
	}
	}
	if (a == 0)
	{
	System.out.printf("%d %d\n",j,n - j);
	}
	}
	}
}

