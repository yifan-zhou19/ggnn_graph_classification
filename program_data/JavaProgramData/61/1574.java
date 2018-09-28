package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	int i;
	int[] sz = new int[1000];
	int result;
	sz[0] = 1;
	sz[1] = 1;
	for (i = 2;i <= n;i++)
	{
		sz[i] = sz[i - 1] + sz[i - 2];
	}
	result = sz[n - 1];
	return result;
	}
	public static int Main()
	{
	int n;
	int j;
	int a;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",f(a));
	}



	return 0;
	}
}

