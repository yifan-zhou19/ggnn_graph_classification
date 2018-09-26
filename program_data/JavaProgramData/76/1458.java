package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		int j;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] sz = new int[n];
		int[] sa = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sa[i] = Integer.parseInt(tempVar3);
		}
		}
		p = sz[0];
		q = sa[0];
		for (i = 0;i < n;i++)
		{
			if (sz[i] < p)
			{
			p = sz[i];
			}
			if (sa[i] > q)
			{
			q = sa[i];
			}
		}
		float s;
		for (s = p;s < q + 0.5;s = s + 0.5)
		{
			d = 0;
			for (j = 0;j < n;j++)
			{
				if (s < sz[j] || s> sa[j])
				{
				d++;
				}
			}
			if (d == n)
			{
				System.out.print("no");
			return 0;
			}

		}
		System.out.printf("%d %d",p,q);
		return 0;


	}


}

