package <missing>;

public class GlobalMembers
{
	public static int[] sz = new int[1010];
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int h = 0;
		int k = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{

			for (j = n - 1;j > i;j--)
			{
				if (sz[i] + sz[j] == k)
				{
					System.out.print("yes");
					h = 1;
					break;
				}
			}
			if (h == 1)
			{
				break;
			}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

