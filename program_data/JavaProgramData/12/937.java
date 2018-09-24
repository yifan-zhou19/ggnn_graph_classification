package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int[] sz = new int[17];
		int n = 0;
		for (i = 0;i < 17;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i] = Integer.parseInt(tempVar);
			}
			if (sz[i] == -1)
			{
				break;
			}
			else
			{
				if (i > 0)
				{
					if (sz[i] > 0)
					{
					for (j = 0;j < i;j++)
					{
						if (2 * sz[j] == sz[i] || 2 * sz[i] == sz[j])
						{
							n++;
						}
					}
					}
					else
					{
						System.out.printf("%d\n",n);
						n = 0;
						i = 0;
						j = 0;
						for (k = 0;k < 16;k++)
						{
							sz[k] = -2;
						}
					}
				}
			}
		}
	}
}

