package <missing>;

public class GlobalMembers
{
	public static int a(int n)
	{
	int i;
	int j;
	int m;
	int q = 0;
	if (n % 2 == 0 && n != 2)
	{
		q = 1;
	}
	m = Math.sqrt(n);
	for (i = 3;i <= m;i += 2)
	{
	if (n % i == 0)
	{
		q = 1;
	}
	}
	return (q);
	}

	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i += 2)
	{
	for (j = 2;j < n;j++)
	{
	if (a(j) == 0 && a(i - j) == 0)
	{
		System.out.printf("%d=%d+%d\n",i,j,i - j);
	break;
	}
	}
	}
	}


}

