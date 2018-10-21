package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] x = new int[12];
		int[] y = new int[12];
		int i;
		int j;
		int l1;
		int l2;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		x[0] = m;
		y[0] = n;
		for (i = 1;x[i - 1] != 0;i++)
		{
			x[i] = x[i - 1] / 2;
		}
		l1 = i - 1;
		for (i = 1;y[i - 1] != 0;i++)
		{
			y[i] = y[i - 1] / 2;
		}
		l2 = i - 1;
		for (i = 0;i < l1;i++)
		{
			for (j = 0;j < l2;j++)
			{
				if (x[i] == y[j])
				{
					System.out.printf("%d",x[i]);
					t = 1;
					break;
				}
			}
			if (t != 0)
			{
				break;
			}
		}
		return 0;
	}

}

