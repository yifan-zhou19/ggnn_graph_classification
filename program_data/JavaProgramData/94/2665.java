package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] sz = new int[500];
	int[] js = new int[500];
	int a = 0;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar2);
	}
	if (sz[i] % 2 != 0)
	{
	js[a] = sz[i];
	a++;
	}
	}
		int e;
		int k;
		int x;
		for (int k = 1 ; k <= a ; k++)
		{
		for (int x = 0; x < a - k; x++)
		{
				if (js[x] > js[x + 1])
				{
				e = js[x + 1];
				js[x + 1] = js[x];
				js[x] = e;
				}
		}
		}
	for (m = 0;m < a - 1;m++)
	{
	System.out.printf("%d,",js[m]);
	}
	System.out.printf("%d",js[a - 1]);
	return 0;
	}
}

