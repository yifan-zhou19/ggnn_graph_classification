package <missing>;

public class GlobalMembers
{
	public static int cmp(Object p1, Object p2)
	{
		return *((int)p2) - (int)p1;
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int la;
		int ra;
		int lb;
		int rb;
		int i;
		int n;
		int ans;
		while (scanf("%d", n), n)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);

			ans = 0;
			lb = la = 0;
			ra = rb = n - 1;
			while (la <= ra)
			{
				if (a[la] > b[lb])
				{
					ans = ans + 200,la++,lb++;
				}
				else if (a[ra] > b[rb])
				{
					ans += 200,ra--,rb--;
				}
				else
				{
					if (a[ra] < b[lb])
					{
						ans -= 200;
					}
					ra--,lb++;
				}
			}
			System.out.printf("%d\n",ans);
		}
	}
}

