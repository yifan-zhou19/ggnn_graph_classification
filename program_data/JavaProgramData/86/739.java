package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				int[] p;
				int j;
				p = new int[m];
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = m - 1;j >= 0;j--)
				{
					if ((p[j] + 3 * (j + 1)) > 63)
					{
						continue;
					}
					else if ((p[j] + 3 * (j + 1)) < 60)
					{
						System.out.printf("%d\n",60 - 3 * (j + 1));
						break;
					}
					else
					{
						System.out.printf("%d\n",p[j]);
						break;
					}

				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(p);
			}

		}




		return 0;
	}


}

