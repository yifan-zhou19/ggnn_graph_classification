package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[1000];
		int K;
		int m;
		int[] d = new int[1000];
		int s = 0;
		int t;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			K = Integer.parseInt(tempVar2);
		}
		int e;
		int i;
			for (i = 0;i < n;i++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
			}
		for (int k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
			  if (sz[i] > sz[i + 1])
			  {
				e = sz[i + 1];
				sz[i + 1] = sz[i];
				sz[i] = e;
			  }

			}

		}
		  for (i = 0;i < n;i++)
		  {
				o = i;
				d[o] = sz[i];
		  }
		  for (i = 0;i < n;i++)
		  {
			  m = K - sz[i];
			  t = 0;
			 for (o = 0;o < n;o++)
			 {
				 if (o != i && m == d[o])
				 {
					 t++;
				 }
			 }
			 if (t > 0)
			 {
				 s++;
			 }
		  }
		 if (s > 0)
		 {
			 System.out.print("yes");
		 }
			else
			{
				System.out.print("no");
			}
	return 0;
	}


}

