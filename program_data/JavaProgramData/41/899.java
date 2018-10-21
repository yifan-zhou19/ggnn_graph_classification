package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int[] a = new int[10];
		int[] b = new int[10];
		int d = 0;
		int e = 0;
		int i;

		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			for (a[2] = 1;a[2] <= 5;a[2]++)
			{
				if (a[2] == a[1])
				{
					continue;
				}
				for (a[3] = 1;a[3] <= 5;a[3]++)
				{
					if (a[3] == a[1] || a[3] == a[2])
					{
						continue;
					}
					for (a[4] = 1;a[4] <= 5;a[4]++)
					{
						if (a[4] == a[1] || a[4] == a[2] || a[4] == a[3])
						{
							continue;
						}
						for (a[5] = 1;a[5] <= 5;a[5]++)
						{
							if (a[5] == a[1] || a[5] == a[2] || a[5] == a[3] || a[5] == a[4] || a[5] == 2 || a[5] == 3)
							{
								continue;
							}
								b[1] = (a[1] == 5);
								b[2] = (a[2] == 2);
								b[3] = (a[5] == 1);
								b[4] = (a[1] != 3);
								b[5] = (a[1] == 4);
							if (b[a[1]] != 0 && b[a[2]] != 0 && b[a[3]] == 0 && b[a[4]] == 0 && b[a[5]] == 0)
							{
								d = 1;
								break;
							}
						}
						if (d == 1)
						{
							break;
						}
					}
					if (d == 1)
					{
						break;
					}
				}
				if (d == 1)
				{
					break;
				}
			}
			if (d == 1)
			{
				break;
			}
		}
		for (i = 1;i <= 5;i++)
		{
			if (a[i] == 1)
			{
				if (e == 0)
				{
					System.out.print(i);
					e = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
		}
	for (i = 1;i <= 5;i++)
	{
			if (a[i] == 2)
			{
				if (e == 0)
				{
					System.out.print(i);
					e = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
	}
		for (i = 1;i <= 5;i++)
		{
			if (a[i] == 3)
			{
				if (e == 0)
				{
					System.out.print(i);
					e = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			if (a[i] == 4)
			{
				if (e == 0)
				{
					System.out.print(i);
					e = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			if (a[i] == 5)
			{
				if (e == 0)
				{
					System.out.print(i);
					e = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(i);
				}
			}
		}


		return 0;
	}

}
