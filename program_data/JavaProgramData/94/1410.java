package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int N;
	j = 0;
	int[] sz = new int[10000];
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
	}
	for (i = 0;i < N;i++)
	{
	   if (sz[i] % 2 != 0)
	   {
	sz[j] = sz[i];
	j++;
	   }
	}
	int maxIndex;
	int e;
	for (k = 1;k <= j;k++)
	{
	  maxIndex = 0;
	for (int i = 0;i <= j - k;i++)
	{
	  if (sz[i] > sz[maxIndex])
	  {
		 maxIndex = i;
	  }
	}
	if (maxIndex != j - k)
	{
	   e = sz[maxIndex];
	   sz[maxIndex] = sz[j - k];
	   sz[j - k] = e;
	}
	}
	System.out.printf("%d", sz[0]);
	for (i = 1;i < j;i++)
	{
	  System.out.printf(",%d",sz[i]);
	}
	return 0;
	}


}

