package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (int a = 1;a < n;a++)
		{
			for (int i = 0;i < n && i != (n - a);i++)
			{
				if (((sz[i]) + (sz[n - a])) == k)
				{
					System.out.print("yes");
					return 0;
				}
			else if (a == n - 1 && ((sz[i]) + (sz[n - a])) != k)
			{
			 System.out.print("no");
			 return 0;
			}
			}
		}
	}




}

