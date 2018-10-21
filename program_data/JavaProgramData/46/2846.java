package <missing>;

public class GlobalMembers
{
	public static int rp;
	public static int re;
	public static int lp;
	public static int le;
	public static int[][] a = new int[300][300];
	public static int print(int rp,int re,int lp,int le,int r,int l)
	{
		int i;
		int j;
		if (rp > re || lp > le)
		{
			return 0;
		}
		if (l == lp && r == rp)
		{
			for (i = rp,j = lp;j <= le;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			print(rp + 1, re, lp, le, rp + 1, le);
			return 0;
		}
		if (l == le && r == rp)
		{
			for (i = rp,j = le;i <= re;i++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			print(rp, re, lp, le-1, re, le-1);
			return 0;
		}
		if (l == le && r == re)
		{
			for (i = re,j = le;j >= lp;j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			print(rp, re-1, lp, le, re-1, lp);
			return 0;
		}
		if (l == lp && r == re)
		{
			for (i = re,j = lp;i >= rp;i--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			print(rp, re, lp + 1, le, rp, lp + 1);
			return 0;
		}
	}
	public static int Main()
	{

		int r;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 1;i <= r;i++)
		{
			for (j = 1;j <= l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		rp = 1;
		lp = 1;
		re = r;
		le = l;
		print(rp, re, lp, le, 1, 1);
		return 0;
	}
}

