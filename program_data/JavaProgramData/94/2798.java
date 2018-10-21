package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int[] sz = new int[500];
	int[] sz2 = new int[500];
	int a = 0;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < N;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar2);
	}
	if (sz[i] % 2 != 0)
	{
	sz2[a] = sz[i];
	a += 1;
	}
	}
	for (int p = 0;p < a;p++)
	{
	for (int q = 0;q < p;q++)
	{
	if (sz2[q] > sz2[p])
	{
	b = sz2[q];
	sz2[q] = sz2[p];
	sz2[p] = b;
	}
	}
	}
	for (int c = 0;c < a - 1;c++)
	{
	System.out.printf("%d,",sz2[c]);
	}
	System.out.printf("%d",sz2[a - 1]);
	return 0;
	}
}

