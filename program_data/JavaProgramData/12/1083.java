package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int count = 0;
		int[] sz = new int[16];
		for (i = 0;i < 16;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz[i] = Integer.parseInt(tempVar);
		}
		if (sz[i] == 0)
		{
			for (k = 0;k < i - 1;k++)
			{
			for (j = k + 1;j < i;j++)
			{
						  if (sz[k] == 2 * sz[j] || sz[k] * 2 == sz[j])
						  {
				count++;
						  }
			}
			}
			System.out.printf("%d\n",count);
			count = 0;
			i = -1;
		}

		if (sz[i] == -1)
		{
			break;
		}
		}
		return 0;
	}


}

