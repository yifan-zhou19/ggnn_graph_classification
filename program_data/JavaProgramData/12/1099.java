package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int k;
		while (true)
		{
			int[] sz = new int[16];
			int add = 0;
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
			if (sz[0] == -1)
			{
			break;
			}
			for (i;i < 16;i++)
			{
				sz[i] = 0;
			}
			for (i = 0;i < 16;i++)
			{
				for (k = 0;k < 16;k++)
				{
					if (sz[k] != 0 && sz[k] == 2 * sz[i])
					{
						add = add + 1;
					}
				}
			}
			System.out.printf("%d\n",add);
		}
	}
}

