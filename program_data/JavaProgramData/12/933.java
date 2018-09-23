package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int t = 0;
		int i;
		int j;
		int x;
		int[] sz = new int[16];
		for (;;)
		{
			for (i = 0;i < 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i] = Integer.parseInt(tempVar);
				}
				if (sz[i] == 0 || sz[0] == -1)
				{
					break;
				}
				n = n + 1;
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (sz[i] - 2 * sz[j] == 0)
					{
					t = t + 1;
					}
					else
					{
						;
					}
				}
			}
			if (sz[0] == -1)
			{
				break;
			}
			System.out.printf("%d\n",t);
			t = 0;
			n = 0;
		}
		return 0;
	}
}

