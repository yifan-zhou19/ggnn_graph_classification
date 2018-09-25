package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] d = new int[25];
		int[] f = new int[25];
		int max = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			f[i] = 1;
		}

		while (true)
		{
			int tmp = 0;
			int x = 0;
			int y = 0;

			int ci;
			for (ci = 0;ci < k;ci++)
			{
				if (f[ci] == 1)
				{
					y++;
					if (x == 0)
					{
						tmp = d[ci];
						x++;
					}
					else
					{
						if (d[ci] <= tmp)
						{
							tmp = d[ci];
							x++;
						}
						else
						{
							break;
						}
					}
				}
			}

			if (x == y)
			{
				if (x > max)
				{
					max = x;
				}
			}

			int cnt;
			for (cnt = 0;cnt < k;cnt++)
			{
				if (f[cnt] != 0)
				{
					break;
				}
			}
			if (cnt == k)
			{
				break;
			}

			f[k - 1]--;
			for (int i = k - 1;i > 0;i--)
			{
				if (f[i] == -1)
				{
					f[i] = 1;
					f[i - 1]--;
				}
			}

		}

		System.out.printf("%d",max);

			return 0;
	}
}

