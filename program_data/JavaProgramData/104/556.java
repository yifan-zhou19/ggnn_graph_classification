package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int n1 = 0;
		int n2 = 0;
		int[] a = new int[11];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int m;
		m = x;
		while (m != 0)
		{
			a[n1] = m;
			n1++;
			if (m % 2 == 0)
			{
				m = m / 2;
			}
			else
			{
				m = (m - 1) / 2;
			}

		}
		m = y;
		while (m != 0)
		{
			for (i = 0;i <= n1 - 1;i++)
			{
				if (a[i] == m)
				{
					System.out.printf("%d",m);
				return 0;
				}
			}
			if (m % 2 == 0)
			{
				m = m / 2;
			}
			else
			{
				m = (m - 1) / 2;
			}

		}
		return 0;
	}

}

