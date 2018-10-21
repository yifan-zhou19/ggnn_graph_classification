package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[16];
		int[] result = new int[100];
		int i;
		int j;
		int k;
		int n = 0;
		int row = 0;
		while (true)
		{
			for (i = 1;i < 16;i++)
			{
				sz[i] = 0;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[0] = Integer.parseInt(tempVar);
			}
			if (sz[0] == -1)
			{
				break;
			}
			else
			{
				k = 1;
				for (i = 1;i < 16;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						sz[i] = Integer.parseInt(tempVar2);
					}
						if (sz[i] == 0)
						{
							break;
						}
						else
						{
							k++;
						}
				}
				n = 0;
				for (i = 1;i < k;i++)
				{
					for (j = 0;j < i;j++)
					{
						if (sz[i] == sz[j] * 2 || sz[j] == sz[i] * 2)
						{
							n++;
						}
					}
				}
				result[row] = n;
				row++;
			}
		}
		for (i = 0;i < row;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}

}

