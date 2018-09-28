package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int t;
		int i;
		int[] b = new int[500];
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
	for (i = 0;i < N;i++)
	{
	if (a[i] % 2 == 1)
	{
	b[i] = a[i];
	}
	else
	{
		b[i] = 0;
	}
	}
	for (i = 0;i < N;i++)
	{
	for (p = 0;p < N - i;p++)
	{
	if (b[p] > b[p + 1])
	{
	t = b[p + 1];
	b[p + 1] = b[p];
	b[p] = t;
	}
	}
	}
	for (i = 0;i < N;i++)
	{
	if (b[i] > 0)
	{
	System.out.printf("%d,",b[i]);
	}
	}
	System.out.printf("%d",b[N]);
	return 0;
	}
}

