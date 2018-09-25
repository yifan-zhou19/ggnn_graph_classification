package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] a = new int[15];
		int l;
		int p = 0;
		int t;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
		if (a[0] == -1)
		{
			break;
		}
		else
		{
		p = 0;
			for (k = 1;k <= 15;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[k] = Integer.parseInt(tempVar2);
				}
				if (a[k] == 0)
				{
					break;
				}
			}
				for (t = 0;t <= k;t++)
				{
				for (l = 0;l <= k;l++)
				{
					if (a[l] == a[t] * 2)
					{
						p = p + 1;
					}
				}
				}
				p = p - 1;
				System.out.printf("%d\n",p);
		}
		}
	return 0;
	}
}

