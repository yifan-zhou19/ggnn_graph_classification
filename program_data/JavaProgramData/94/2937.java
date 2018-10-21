package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int b = 0;
	int[] sz = new int[n];
	int[] js = new int[b];

	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	if (sz[i] % 2 == 1)
	{
	js[b] = sz[i];
	b++;
	}
	}
	int e;
	for (int k = 1;k <= b;k++)
	{
	for (int i = 0;i < b - k;i++)
	{
	if (js[i] > js[i + 1])
	{
	e = js[i + 1];
	js[i + 1] = js[i];
	js[i] = e;
	}
	}
	}
	for (int i = 0;i < b - 1;i++)
	{
	System.out.printf("%d,",js[i]);
	}
	System.out.printf("%d",js[b - 1]);
	return 0;
	}
}

