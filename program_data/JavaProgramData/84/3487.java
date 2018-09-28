package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[101];
		int zd = 0;
		int zdbh;
		int cd = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > zd)
			{
				zd = a[i];
				zdbh = i;
			}
		}
		System.out.printf("%d\n", zd);
		a[zdbh] = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > cd)
			{
				cd = a[i];
			}
		}
		System.out.printf("%d", cd);
		return 0;
	}



}

