package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int x;
		x = 0;
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
		for (int i = 0;i < n;i++)
		{
			for (int a = 0;a < n;a++)
			{
				if (sz[i] + sz[a] == k && i != a)
				{
					x++;
				}
			}
		}
		if (x == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
	}





}

