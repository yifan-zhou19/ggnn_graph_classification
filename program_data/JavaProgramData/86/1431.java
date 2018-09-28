package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[10];
		int i;
		int j;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (j = 1;j <= m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Integer.parseInt(tempVar3);
					}
				}
				if (a[m] + 3 * m <= 60)
				{
					System.out.printf("%d\n",60 - 3 * m);
				}
				else
				{
					for (j = 1;j <= m;j++)
					{
						if (a[j] + 3 * j > 60)
						{
							if (a[j] + 3 * j <= 63)
							{
								System.out.printf("%d\n",a[j]);
								break;
							}
							else
							{
								System.out.printf("%d\n",63 - 3 * j);
								break;
							}
						}
					}

				}
			}
		}
		return 0;
	}

}

