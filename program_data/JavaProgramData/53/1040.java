package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int m;
		int[] sz = new int[300];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}

			if (i == 0)
			{

				System.out.printf("%d",sz[i]);
			}
			else
			{
				m = 0;
				for (int k = 0;k < i;k++)
				{
					if (sz[i] == sz[k])
					{
						m = 1;
					}
				}
				if (m == 0)
				{
					System.out.printf(",%d",sz[i]);
				}
			}
		}

		return 0;
	}


}

