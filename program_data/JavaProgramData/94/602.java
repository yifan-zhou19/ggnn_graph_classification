package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int i;
		int n;
		int m;
		int max;
		int e;
		int[] js = new int[500];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 1)
			{
				js[j] = sz[i];
				j++;
			}
		}
		max = 0;
		for (m = 1;m <= j;m++)
		{
		  for (i = 0;i <= (j - m);i++)
		  {
			  if (js[i] > js[max])
			  {
				  max = i;
			  }
		  }
			  e = js[j - m];
			  js[j - m] = js[max];
			  js[max] = e;
			   if (max == j - m)
			   {
						max = j - m - 1;
			   }
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",js[i]);
		}
		if (i == j - 1)
		{
			System.out.printf("%d",js[i]);
		}
		return 0;
	}

}

