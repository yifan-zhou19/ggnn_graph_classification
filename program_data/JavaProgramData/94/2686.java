package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int i;
	int k;
	int e;
	int p;
	k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	int[] a = new int[500];
	int[] b = new int[500];
	for (i = 0;i < N;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	if (a[i] % 2 != 0)
	{
	b[k] = a[i];
	k++;
	}
	}
	for (i = 0;i < k;i++)
	{
	for (p = 0;p < k - i;p++)
	{
	if (b[p] > b[p + 1])
	{
	e = b[p];
	b[p] = b[p + 1];
	b[p + 1] = e;
	}
	}
	}
	for (i = 1;i < k;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[k]);
	return 0;
	}



}

