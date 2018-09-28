package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k = 0;
		int e;
		int g = 0;
		int[] sz = new int[500];
		int[] js = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 1)
			{
				k++;
				js[g] = sz[i];
				g++;
			}
		}
		for (int i = 1;i < k;i++)
		{
			 for (int j = 0;j < k - i;j++)
			 {
					  if (js[j] > js[j + 1])
					  {
							 e = js[j];
							 js[j] = js[j + 1];
							 js[j + 1] = e;
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

