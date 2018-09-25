package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		while (i <= n)
		{
			int[] sz = new int[50];
			int m;
			int j;
			if (i != 1)
			{
					System.out.print("\n");
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}

			if (m == 0)
			{
				System.out.print("60");
			}
			else
			{

				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[j] = Integer.parseInt(tempVar3);
					}
				}

				sz[m] = 60;

				int count = sz[0] + 3;
				int num = sz[0];
				for (j = 1;j <= m;j++)
				{
					if (count + 3 + sz[j] - num <= 60)
					{
						count += 3 + sz[j] - num;
						 num = sz[j];
					}
					else
					{
						if (count - num + sz[j] <= 60)
						{
							num = sz[j];
							break;
						}
						else
						{
							num = num + 60 - count;

							break;
						}
					}
				}


				System.out.printf("%d",num);
			}
				i++;
		}
		return 0;
	}
}

