package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] sz = new int[1000];
		int i;
		int m;
		int[] sc = new int[500500];
		int l;
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
		l = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (m = 1;m < n - i;m++)
			{
				sc[l] = sz[i] + sz[m];
				l = l + 1;
			};
		}
		for (i = 0;i < l;i++)
		{
			if (k == sc[i])
			{
				System.out.print("yes");
			return 0;
			}
		}
		System.out.print("no");
		return 0;
	}
}

