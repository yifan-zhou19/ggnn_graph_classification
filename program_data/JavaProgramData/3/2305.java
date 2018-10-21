package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int n;
		int k;
		int i;
		int t;
		int l;

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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		t = 0;
		while (t < n)
		{
			l = 1;
			while (l < n)
			{
				if (sz[t] + sz[l] == k)
				{
					System.out.print("yes");
					l++;
					break;
				}
				else
				{
					l++;
				}
			}

			if (sz[t] + sz[l - 1] == k)
			{
				break;
			}
			t++;
		}

		if (t == n)
		{
			System.out.print("no");
		}

	return 0;
	}

}

