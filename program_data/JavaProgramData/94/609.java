package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int k = 0;
		int i;
		int j;
		int m;
		int[] sz = new int[500];
		int[] js = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N - 1;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar2);
		   }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[N - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < N;i++)
		{
		   if (sz[i] % 2 != 0)
		   {
			   js[k] = sz[i];
			   k++;
		   }
		}
		for (j = 0;j < k;j++)
		{
		   for (i = 0;i < k - j - 1;i++)
		   {
			   if (js[i] > js[i + 1])
			   {
				  m = js[i];
				  js[i] = js[i + 1];
				  js[i + 1] = m;
			   }
		   }
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",js[i]);
		}
		System.out.printf("%d",js[k - 1]);
		return 0;
	}
}

