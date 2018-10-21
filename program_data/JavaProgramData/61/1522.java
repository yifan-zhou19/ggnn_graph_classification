package <missing>;

public class GlobalMembers
{
	public static int pb(int m)
	{

		int[] sz = new int[100000];
		sz[1] = 1;
		sz[2] = 1;
		for (int i = 3;i <= m;i++)
		{
		sz[i] = sz[i - 1] + sz[i - 2];
		}
	return sz[m];
	}
	public static int Main()
	{
	int i;
	int a;
	int n;
	int k;
	int[] s = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	s[i] = pb(n);
	}


	for (i = 0;i < k;i++)
	{
	System.out.printf("%d\n",s[i]);
	}
	return 0;
	}
}

