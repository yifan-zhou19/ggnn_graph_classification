package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int as;
		int bs;
		int pj;
		int[] a = new int[200];
		int[] b = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		as = 0,bs = 0,pj = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] == b[i])
			{
				pj = pj + 1;
			}
			if (a[i] == 0 && b[i] == 1)
			{
				as = as + 1;
			}
			if (a[i] == 1 && b[i] == 2)
			{
				as = as + 1;
			}
			if (a[i] == 2 && b[i] == 0)
			{
				as = as + 1;
			}
			if (b[i] == 0 && a[i] == 1)
			{
				bs = bs + 1;
			}
			if (b[i] == 1 && a[i] == 2)
			{
				bs = bs + 1;
			}
			if (b[i] == 2 && a[i] == 0)
			{
				bs = bs + 1;
			}
		}
		if (as > bs)
		{
			System.out.print("A");
		}
		if (as < bs)
		{
			System.out.print("B");
		}
		if (bs == as)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

