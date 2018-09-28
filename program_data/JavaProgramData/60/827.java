package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int r;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= n - 2;i++)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
					else
					{
						if (j != i - 1)
						{
							continue;
						}
						else
						{
							for (r = 2;r < i + 2;r++)
							{
								if ((i + 2) % r == 0)
								{
									break;
								}
								else
								{
									if (r != i + 1)
									{
										continue;
									}
									else
									{
										a = i + 2;
										System.out.printf("%d %d\n",i,a);
									}
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

