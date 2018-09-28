package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int r;
		int[] sz = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == k)
			{

				for (r = i;r < n;r++)
				{
					sz[r] = sz[r + 1];
				}
				i--;
				n--;
			}
		}



		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",sz[i]);
			}
			else
			{
			System.out.printf("%d ",sz[i]);
			}
		}

		return 0;

	}

}

