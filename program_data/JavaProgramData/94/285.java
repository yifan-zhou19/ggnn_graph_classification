package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int[] sz = new int[100];
		int n;
		int e;
		int z;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 0;l < n;l++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[l] = Integer.parseInt(tempVar2);
		   }
		  if (sz[l] % 2 == 0)
		  {
			   sz[l] = 0;
		  }
		}

		for (s = 1;s <= n;s++)
		{
		  for (i = 0; i < n - s; i++)
		  {
			  if (sz[i] > sz[i + 1])
			  {
						e = sz[i + 1];
						sz[i + 1] = sz[i];
						sz[i] = e;
			  }
		  }
		}
		 for (z = 0;z < n - 1;z++)
		 {
			 if (sz[z] != 0)
			 {
			 System.out.printf("%d,",sz[z]);
			 }
		 }
		 System.out.printf("%d",sz[n - 1]);
		 return 0;
	}
}

