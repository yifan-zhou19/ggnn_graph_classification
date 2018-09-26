package <missing>;

public class GlobalMembers
{
	public static int allocable(int n,int m,int k)
	{
	if (m % n == k)
	{
		return 1;
	}
	else
	{
	return 0;
	}
	}


	public static void Main()
	{
	int n;
	int k;
	int m;
	int i;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}


	m = 1;
	while (true)
	{
	m++;
	int tmp = m;
	for (i = 0;i < n;i++)
	{
	if (allocable(n, tmp, k) != 0)
	{
		   tmp = (tmp - k) * (n - 1) / n;
	}
	else
	{
	break;
	}

	}

	if (i == n)
	{
		break;
	}

	}

	System.out.printf("%d",m);

	}
}

