package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		int k;
		int n;
		int[] sz = new int[1000];
		int[] s = new int[1000];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
			s[m] = sz[i];
			m++;
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				break;
			}
			for (m = n - 1;m >= i + 1;m--)
			{
				if (s[m] + sz[i] == k)
				{
				System.out.print("yes");
				break;
				}
			}
				if (s[m] + sz[i] == k)
				{
					break;
				}
		}
			if (i == n - 1)
			{
				System.out.print("no");
			}
		return 0;
	}


}

