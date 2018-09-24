package <missing>;

public class GlobalMembers
{
	public static int e = 1;
	public static int cs(int i,int n,int m)
	{
	if (e == n + 1)
	{
		e = 1;
		return (1);
	}
	else if ((i % n == m) && i > n)
	{
		e++;
		return (cs(i / n * (n - 1), n, m));
	}
	else
	{
		e = 1;
		return (0);
	}
	}

	public static void Main()
	{
	int n;
	int m;
	int sum = 0;
	int i;
	int e = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 1;;i++)
	{
		e = i;
		if (cs(i, n, m) == 1)
		{
			System.out.printf("%d",e);
			break;
		}
		i = e;
	}

	}

}

