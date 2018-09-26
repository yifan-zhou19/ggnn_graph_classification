package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		int b;
	b = Math.sqrt(a);
	if (a % 2 == 0)
	{
	return 0;
	}
	for (i = 3;i <= Math.sqrt(a);i += 2)
	{
		if (a % i == 0)
		{
	return 0;
		}
	}
	return 1;
	}
	public static int Main()
	{
		int n;
		int j;
		int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 6;j <= n;j += 2)
	{
		for (k = 3;k <= j;k++)
		{
	if (f(k) == 1 && f(j - k) == 1)
	{
		System.out.printf("%d=%d+%d\n",j,k,j - k);
	break;
	}
		}
	}
	return 0;
	}
}

