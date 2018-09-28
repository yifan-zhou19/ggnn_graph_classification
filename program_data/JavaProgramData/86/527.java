package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] sz = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.printf("%d\n",60);
			}
			else
			{
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = m - 1;i >= 0;i--)
			{
				if (sz[i] + 3 * i > 60)
				{
					continue;
				}
				else
				{
					if (sz[i] + 3 * i < 57)
					{
					 System.out.printf("%d\n",57 - 3 * i);
					break;
					}
					else
					{
						System.out.printf("%d\n",sz[i]);
					   break;
					}
				}
			}
			}
			n--;
		}
			return 0;
	}

}

