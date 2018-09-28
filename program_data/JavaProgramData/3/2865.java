package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int a;
		int b;
		int c;
		int[] sz = new int[1000];
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (int a = 0;a < n;a++)
		{
			for (i = 0;i < n;i++)
			{
				b = sz[a] + sz[i];
				  if (sz[a] + sz[i] == k)
				  {
				c++;
				  }
				  else
				  {
					  continue;
				  }
			}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		   if (c > 0)
		   {
			System.out.print("yes");
		   }
		return 0;
	}


}

