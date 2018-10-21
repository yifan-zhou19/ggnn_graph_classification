package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int l;
	int e;
	int[] x = new int[1000];
	int[] y = new int[1000];
	int N;
	i = 0;
	j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (i = 0; i < N; i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x[i] = Integer.parseInt(tempVar2);
	 }
	}
	for (i = 0;i < N;i++)
	{
	if (x[i] % 2 == 1)
	{
	y[j] = x[i];
	j = j + 1;
	}
	}
	k = j;
	j = 0;
	l = 1;
	for (l = 1;l <= k;l++)
	{
	for (j = 0;j < k - l;j++)
	{
	if (y[j] > y[j + 1])
	{
	e = y[j + 1];
	y[j + 1] = y[j];
	y[j] = e;
	}
	}
	}
	for (j = 0;j < k - 1;j++)
	{
	System.out.printf("%d,",y[j]);
	}
	System.out.printf("%d",y[k - 1]);
	return 0;
	}


}

