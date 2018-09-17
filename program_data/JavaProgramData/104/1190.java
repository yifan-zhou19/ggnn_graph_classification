package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j;
		int x;
		int y;
		int t;
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
		if (x == y)
		{
			System.out.printf("%d",x);
		}
		else
		{
		if (x > y)
		{
			t = x;
			x = y;
			y = t;
		}
		for (i = 0;;i++)
		{
			a[i] = x;
			x = x / 2;
			if (a[i] == 0)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			b[i] = y;
			y = y / 2;
			if (b[i] == 0)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
				if (b[j] == 0)
				{
					break;
				}
			}
			if (a[i] == b[j])
			{
				break;
			}
		}
		System.out.printf("%d",a[i]);
		}
		return 0;
	}


}

