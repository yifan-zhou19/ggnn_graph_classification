package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i = 0;
		int j = 0;
		int[] x = new int[6];
		int[] b = new int[6];
		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			if (a[1] != 6)
			{
			for (a[2] = 1;a[2] <= 5;a[2]++)
			{
				if (a[2] != a[1])
				{
				for (a[3] = 1;a[3] <= 5;a[3]++)
				{
					if (a[3] != a[1] && a[3] != a[2])
					{
					for (a[4] = 1;a[4] <= 5;a[4]++)
					{
						if (a[4] != a[1] && a[4] != a[2] && a[4] != a[3] && a[4] != 4)
						{
					for (a[5] = 1;a[5] <= 5;a[5]++)
					{
						if (a[5] != a[1] && a[5] != a[2] && a[5] != a[3] && a[5] != a[4] && a[5] != 2 && a[5] != 3)
						{
						x[1] = (a[5] == 1);
						x[2] = (a[2] == 2);
						x[3] = (a[1] == 5);
						x[4] = (a[3] != 1);
						x[5] = (a[4] == 1);
		if (x[1] + x[2] + x[3] + x[4] + x[5] == 2)
		{
			for (i = 1;i <= 5;i++)
			{
				if (a[i] == 2 && x[i] == 1)
				{
					for (j = i;j <= 5;j++)
					{
						if (a[j] == 1 && x[j] == 1)
						{
							for (i = 1;i <= 4;i++)
							{
								System.out.print(a[i]);
								System.out.print(" ");
							}
							System.out.print(a[5]);
							System.out.print("\n");
						}
					}
				}
			}
		}

	for (i = 1;i <= 5;i++)
	{
				if (a[i] == 2 && x[i] == 1)
				{
					for (j = i;j >= 1;j--)
					{
						if (a[j] == 1 && x[j] == 1)
						{
							for (i = 1;i <= 4;i++)
							{
								System.out.print(a[i]);
								System.out.print(" ");
							}
							System.out.print(a[5]);
							System.out.print("\n");
						}
					}
				}
	}

						}
					}
						}
					}
					}
				}
				}
			}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}
