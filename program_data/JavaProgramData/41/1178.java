package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int[] c = new int[6];
		int[] b = new int[6];
		int i;
		for (a[1] = 1;a[1] < 6;a[1]++)
		{
		for (a[2] = 1;a[2] < 6;a[2]++)
		{
		for (a[3] = 1;a[3] < 6;a[3]++)
		{
		for (a[4] = 1;a[4] < 6;a[4]++)
		{
		for (a[5] = 1;a[5] < 6;a[5]++)
		{

				if (a[1] != a[2] && a[1] != a[3] && a[1] != a[4] && a[1] != a[5] && a[2] != a[3] && a[2] != a[4] && a[2] != a[5] && a[3] != a[4] && a[3] != a[5] && a[4] != a[5] && a[5] != 2 && a[5] != 3)
				{
					for (i = 1;i < 6;i++)
					{
						c[a[i]] = i;
					}
						b[1] = (a[5] == 1);
						b[2] = (a[2] == 2);
						b[3] = (a[1] == 5);
						b[4] = (a[3] != 1);
						b[5] = (a[4] == 1);
					if (b[c[1]] + b[c[2]] == 2 && b[c[3]] + b[c[4]] + b[c[5]] == 0)
					{
						System.out.print(a[1]);
						for (i = 2;i < 6;i++)
						{
							System.out.print(' ');
							System.out.print(a[i]);
						}

						System.out.print("\n");
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
