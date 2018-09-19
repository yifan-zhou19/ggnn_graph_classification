package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q = 0;
		int r = 0;
		int l = 0;
		int ll = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int s;
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			if (p == 0)
			{
				q++;
				if (ll == 0)
				{
					l = 1;
				}
			}
			if (p == 0 && l == 1)
			{
				r++;
			}
			if (l == 1 && p != 0)
			{
				l = 2;
				ll = 1;
			}
		}
		if (r > n)
		{
			r = n;
		}
		s = (q - 2 * r) * (r - 2) / 2;

		System.out.printf("%d\n",s);
		return 0;
	}

}

