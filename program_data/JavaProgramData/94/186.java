package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	int[] sz = new int[N];
	int i;
	for (i = 0;i < N;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
	}
	int[] js = new int[500];
	int j = 0;
	int sum = 0;
	for (i = 0;i < N;i++)
	{
		if (sz[i] % 2 != 0)
		{
		 js[j] = sz[i];
		 j++;
		 sum++;
		}
	}
	int k;
	int e;
	for (k = 1;k < sum;k++)
	{
	  for (j = 0;j <= sum - k;j++)
	  {
		 if (js[j] > js[j + 1])
		 {
		  e = js[j];
		  js[j] = js[j + 1];
		  js[j + 1] = e;
		 }
	  }
	}
	for (j = 0;j < sum;j++)
	{
	if (j != sum - 1)
	{
	System.out.printf("%d,",js[j]);
	}
	else
	{
	System.out.printf("%d",js[j]);
	}
	}
	return 0;
	}
}

