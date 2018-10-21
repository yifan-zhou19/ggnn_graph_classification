package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		int[] js = new int[n];
		int j;
		j = 0;
		for (i = 0;i < n;i++)
		{
			if ((sz[i]) % 2 == 1)
			{
				js[j] = sz[i];
				j++;
			}
		}
		int k = j;
		int a;
		int b;
		for (j = 1;j <= k;j++)
		{
			a = 0;
			for (i = 0;i <= k - j;i++)
			{
			  if (js[i] > js[a])
			  {
			  a = i;
			  }
			  if (a != k - j)
			  {
				  b = js[a];
				  js[a] = js[k - j];
				  js[k - j] = b;
			  }
			}
		}
		for (j = 0;j < k - 1;j++)
		{
			System.out.printf("%d,",js[j]);
		}
		System.out.printf("%d",js[k - 1]);
		return 0;
	}


}

