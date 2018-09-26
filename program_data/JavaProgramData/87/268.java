package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[6];
		int i;
		int s;
		while (true)
		{
			for (i = 0;i <= 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i] = Integer.parseInt(tempVar);
				}
			}
			if (sz[0] != 0 || sz[1] != 0 || sz[2] != 0 || sz[3] != 0 || sz[4] != 0 || sz[5] != 0)
			{
				s = 60 * 60 * (sz[3] + 12 - sz[0]) + 60 * (sz[4] - sz[1]) + sz[5] - sz[2];
				System.out.printf("%d\n",s);
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

