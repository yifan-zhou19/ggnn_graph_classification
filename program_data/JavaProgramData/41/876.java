package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int[] b = new int[6];
		int[] c = new int[6];
		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			for (a[2] = 1;a[2] <= 5;a[2]++)
			{
				if (a[1] == a[2])
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
						a[5] = 15 - a[1] - a[2] - a[3] - a[4];
						if ((a[4] == a[1]) || (a[4] == a[2]) || (a[4] == a[3]) || (a[2] == 5) || (a[3] == 5))
						{
							continue;
						}
						c[1] = (a[1] == 5);
						c[2] = (a[2] == 2);
						c[3] = (a[5] == 1);
						c[4] = (a[1] != 3);
						c[5] = (a[1] == 4);
						b[a[1]] = 1;
						b[a[2]] = 2;
						b[a[3]] = 3;
						b[a[4]] = 4;
						b[a[5]] = 5;
						if ((c[a[1]] == 1) && (c[a[2]] == 1) && (c[a[3]] == 0) && (c[a[4]] == 0) && (c[a[5]] == 0))
						{
							System.out.print(b[1]);
							System.out.print(" ");
							System.out.print(b[2]);
							System.out.print(" ");
							System.out.print(b[3]);
							System.out.print(" ");
							System.out.print(b[4]);
							System.out.print(" ");
							System.out.print(b[5]);
						}
					}
				}
			}
		}

		return 0;
	}
}
