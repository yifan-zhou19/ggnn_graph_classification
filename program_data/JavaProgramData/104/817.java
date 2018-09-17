package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//



	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int n;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		for (i = 1;i <= 100000;++i)
		{
			a[i] = x / 2;
			x = x / 2;
			if (a[i] == 0)
			{
				break;
			}
		}
		n = i - 1;
		for (i = 1;i <= 100000;++i)
		{
			b[i] = y / 2;
			y = y / 2;
			if (b[i] == 0)
			{
				break;
			}
		}
		m = i - 1;
		for (i = 0;i <= n;++i)
		{
			for (j = 0;j <= m;++j)
			{
				if (a[i] == b[j])
				{
					break;
				}
			}
			if (a[i] == b[j])
			{
				break;
			}
		}
		System.out.printf("%d\n",a[i]);
		return 0;
	}

}

