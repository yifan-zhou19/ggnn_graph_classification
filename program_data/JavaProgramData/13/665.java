package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int s;
		int r;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (t = 1;t <= n - 1;t++)
		{
			r = 0;
			for (s = 0;s <= t - 1;s++)
			{
				if (a[t] == a[s])
				{
					break;
				}
				else
				{
					r++;
				}
			}
			if (r == t)
			{
				System.out.printf(" %d",a[t]);
			}
		}
		return 0;
	}

}

