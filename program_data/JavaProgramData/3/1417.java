package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int n;
		int i;
		int k;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			e = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < n - 1;k++)
		{
			if (k == n - 2)
			{
				  System.out.print("no");
				  break;
			}
		   for (i = k + 1;i < n;i++)
		   {
			   d = sz[k] + sz[i];
			   if (d == e)
			   {
			System.out.print("yes");
			break;
			   }
		   }
			   if (d == e)
			   {
			break;
			   }
		}
			  return 0;
	}

}

