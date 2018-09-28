package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int[] sz = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 0;i < N;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 sz[i] = Integer.parseInt(tempVar2);
	 }
	}
	i = 0;
	int j = 0;
	while (i < N)
	{
	if (sz[i] % 2 != 0)
	{
	sz[j] = sz[i];
	j++;
	}
	i++;
	}
	int LEN = j;
	int e;
	int k;
	for (k = 1;k <= LEN;k++)
	{
	int j;
	for (j = 0;j < LEN - 1;j++)
	{
	if (sz[j] > sz[j + 1])
	{
	e = sz[j + 1];
	sz[j + 1] = sz[j];
	sz[j] = e;
	}
	}
	}
	int m = 0;
	while (m < LEN - 1)
	{
	System.out.printf("%d,",sz[m]);
	m++;
	}
	System.out.printf("%d",sz[LEN - 1]);
	return 0;

	}

}

