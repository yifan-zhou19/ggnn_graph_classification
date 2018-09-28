package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[LEN];
		int n;
		int i;
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
		}
		if (n > 1 && n < LEN)
		{
			int e;
		 for (i = 0;i < n - 1;i++)
		 {
			 if (sz[i] > sz[i + 1])
			 {
			 e = sz[i];
		  sz[i] = sz[i + 1];
		  sz[i + 1] = e;
			 }
		 }
		   int f;
		 for (i = 0;i < n - 2;i++)
		 {
			 if (sz[i] > sz[i + 1])
			 {
			 f = sz[i];
		  sz[i] = sz[i + 1];
		  sz[i + 1] = f;
			 }
		 }
		}
		  System.out.printf("%d\n%d",sz[n - 1],sz[n - 2]);
		  return 0;
	}
}

