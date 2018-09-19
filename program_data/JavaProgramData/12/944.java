package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int x;
		int[] sz = new int[16];
		while (true)
		{
			x = 0;
			for (i = 0;i < 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i] = Integer.parseInt(tempVar);
				}
				if (sz[i] == 0 || sz[i] == -1)
				{
					break;
				}
			}
			if (sz[i] == -1)
			{
				break;
			}
			for (m = 0;m <= i - 2;m++)
			{
				for (n = m + 1;n <= i - 1;n++)
				{
					if (sz[m] == 2 * sz[n] || sz[n] == 2 * sz[m])
					{
						x++;
					}
				}
			}
			System.out.printf("%d\n",x);
		}
		return 0;
	}

}

