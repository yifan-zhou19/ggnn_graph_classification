package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] sz = new int[99];
	int n;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0 ; i < n ; i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar2);
	}
	}
	for (int c = 0; c < n - 1; c++)
	{
				if (sz[c] > sz[c + 1])
				{
						e = sz[c + 1];
						sz[c + 1] = sz[c];
						sz[c] = e;
				}
	}
	int b;
	for (int a = 0;a < n - 2; a++)
	{
				if (sz[a] > sz[a + 1])
				{
						b = sz[a + 1];
						sz[a + 1] = sz[a];
						sz[a] = b;
				}
	}
	System.out.printf("%d\n",sz[n - 1]);
	System.out.printf("%d\n",sz[n - 2]);
	}
}

