package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int x;
		int y;
		int[] sz = new int[300];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
				sz[i] = 0;
			}
			x = n;
			y = 1;
			for (int t = 0;t < n;t = (t + 1) % n)
			{
				if (sz[t] != 0)
				{
					continue;
				}
				if (y++==m)
				{
					sz[t] = 1;
					x--;
					y = 1;
				}
				if (x == 0)
				{
					System.out.printf("%d\n",t + 1);
					break;
				}
			}
		}
		return 0;
	}

}

