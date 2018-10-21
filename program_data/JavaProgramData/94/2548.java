package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[N];
		for (i = 0;i < N;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		}
		int[] js = new int[N];
		for (i = 0,j = 0;i < N;i++)
		{
			if (sz[i] % 2 != 0)
			{
				js[j] = sz[i];
				j++;
			}
		}
	  for (int k = 1;k <= j;k++)
	  {
		  int e;
	for (int m = 0;m < j - k;m++)
	{
			  if (js[m] > js[m + 1])
			  {
						e = js[m + 1];
						js[m + 1] = js[m];
					   js[m] = e;
			  }
	}
	  }
			  for (i = 0;i < j - 1;i++)
			  {
			   System.out.printf("%d,",js[i]);
			  }
			   System.out.printf("%d",js[j - 1]);
		return 0;
	}





}

