package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int c;
		int d;
		int t = 0;
		int m;
		int[] a = new int[12];
		int[] b = new int[12];
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
		for (i = 1;;i++)
		{
			a[i] = a[i - 1] / 2;
			if (a[i] == 1)
			{
				c = i;
				break;
			}
		}
		for (j = 1;;j++)
		{
			b[j] = b[j - 1] / 2;
			if (b[j] == 1)
			{
				d = j;
				break;
			}
		}
		for (i = 0;i <= c;i++)
		{
			if (t == 1)
			{
				break;
			}
			for (j = 0;j <= d;j++)
			{
				if (a[i] == b[j])
				{
					m = a[i];
					t = 1;
					break;

				}
			}
		}
		System.out.printf("%d\n",m);
	   return 0;
	}
}

