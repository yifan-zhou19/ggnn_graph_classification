package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int q;
		int p;
		int[] szi = new int[10000];
		int[] szj = new int[10000];
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			szi[m] = 0;
			szj[m] = 0;
		}
		p = 1;
		q = 1;
		while (p != 0 || q != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			'\n';
			szi[p]++;
			szj[q]++;
		}
		for (m = 0;m < n;m++)
		{
			if (szi[m] == 0 && szj[m] == n - 1)
			{
				sz[p] = m;
				p++;
			}
		}
		if (p == 0)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
			System.out.printf("%d",sz[0]);
		}
		return 0;
	}

}

