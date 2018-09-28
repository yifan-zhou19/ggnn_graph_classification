package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
		return 1;
	}
	if (n == 2)
	{
		return 1;
	}
	else
	{
		return F(n - 1) + F(n - 2);
	}
	}
	public static int Main()
	{
	int n;
	int z;
	int i;
	int[] sz = new int[1000];
	int result;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		z = Integer.parseInt(tempVar);
	}

	for (i = 0;i < z;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar2);
	}
	}

	for (i = 0;i < z;i++)
	{
	n = sz[i];
	result = F(n);
	System.out.printf("%d\n",result);
	}

	return 0;
	}

}

