package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int a;
		int sum;
		int d;
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
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 sz[i] = Integer.parseInt(tempVar3);
						 }
		}
		for (i = 0;i < n - 1;i++)
		{
						   a = i + 1;
						   for (a;a < n;a++)
						   {
										  sum = sz[i] + sz[a];
										  if (sum == k)
										  {
													 d = 1;
										  }
						   }
		}
		if (d == 1)
		{
				 System.out.print("yes");
		}
		else
		{
			  System.out.print("no");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
		return 0;
	}
}

