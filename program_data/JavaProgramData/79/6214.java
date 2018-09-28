package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[max];
		int n;
		int m;
		int i;
		int x;
		int y;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				a[i] = i + 1;
			}
			x = 0;
			for (i = 0;i < n;i++)
			{
				y = 0;
				while (y < m)
				{
					while (a[x] == 0)
					{
						x = (x + 1) % n;
					}
					y++;
					x = (x + 1) % n;
				}
				x--;
				if (x < 0)
				{
					x = n - 1;
				}
				if (i == n - 1)
				{
					System.out.printf("%d\n",a[x]);
				}
				a[x] = 0;
			}
		}
		return 0;
	}
}

