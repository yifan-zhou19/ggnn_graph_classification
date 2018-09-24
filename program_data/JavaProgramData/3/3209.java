package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int i;
		int n;
		int m;
		int a;
		int j;
		int b;
		int c;
		int d;
		int e;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
	b = 0;
	   for (i = 0; i < n; i++)
	   {
		   for (k = 0; k < n; k++)
		   {
			   a = sz[k] + sz[i];
				if (a == m)
				{
					 b = b + 1;
				}
		   }
	   }
	  if (b > 0)
	  {
	  System.out.print("yes");
	  }
	  else if (b == 0)
	  {
		  System.out.print("no");
	  }
		return 0;
	}
}

