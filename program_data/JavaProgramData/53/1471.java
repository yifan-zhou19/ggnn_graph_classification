package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[400];
		int i;
		int k;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
			 int t = 0;
			 for (k = 0;k < i;k++)
			 {
				  if (sz[k] == sz[i])
				  {
					   t = 1;
				  }
				  if (t == 1)
				  {
						  continue;
				  }
			 }
			 if (t == 1)
			 {
					 continue;
			 }
			 else
			 {
				 System.out.printf(",%d",sz[i]);
			 }
		}
		return 0;
	}


}

