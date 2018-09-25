package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int[] sz = new int[16];
		int[] erbei = new int[16];
		int sum = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i] = Integer.parseInt(tempVar);
			}
			if (0 == sz[i])
			{
				for (j = 0;j < i;j++)
				{
					erbei[k] = 2 * sz[j];
					k++;
				}
				for (k = 0;k < i;k++)
				{
					for (j = 0;j < i;j++)
					{
						if (erbei[k] == sz[j])
						{
							sum++;
						}
					}
				}
				System.out.printf("%d\n",sum);
				sum = 0;
				i = -1;
				k = 0;
			}
			if (-1 == sz[i])
			{
				break;
			}
		}
		return 0;
	}
}

