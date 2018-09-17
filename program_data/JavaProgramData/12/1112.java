package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[16];
		int duishu = 0;
		int zushu;
		int i;
		for (zushu = 0;1;zushu++)
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
			}
			if (sz[0] == -1)
			{
				break;
			}
			for (i = 0;sz[i] != 0;i++)
			{
				int j;
				for (j = 0;sz[j] != 0;j++)
				{
					if (sz[i] == 2 * sz[j])
					{
						duishu++;
					}
				}
			}
			System.out.printf("%d\n", duishu);
			duishu = 0;
			for (i = 0;i < 16;i++)
			{
				sz[i] = 0;
			}
		}
		return 0;
	}


}

