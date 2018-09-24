package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int[] a = new int[6];
		int[][] b = new int[6][6];
		int x = 1;
		int j;

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

							if (a[5] == 2 || a[5] == 3)
							{

								continue;
							}

							if (a[1] == 1 || a[1] == 2)

							{

								if (a[5] != 1)
								{

								continue;
								}

							}

							if (a[2] == 1 || a[2] == 2)

							{

								if (a[2] != 2)
								{

								continue;
								}

							}

							if (a[3] == 1 || a[3] == 2)

							{

								if (a[1] != 5)
								{

								continue;
								}

							}

							if (a[4] == 1 || a[4] == 2)

							{

								if (a[3] == 1)
								{

								continue;
								}

							}

							if (a[5] == 1 || a[5] == 2)

							{

								if (a[4] != 1)
								{

								continue;
								}

							}

							if (a[1] == a[2] || a[1] == a[3] || a[1] == a[4] || a[1] == a[5] || a[2] == a[3] || a[2] == a[4] || a[2] == a[5] || a[3] == a[4] || a[3] == a[5] || a[4] == a[5] || a[1] != 5 || a[2] != 2 || a[3] != 1 || a[4] != 3 || a[5] != 4)
							{

								continue;
							}

							System.out.print(a[1]);
							System.out.print(" ");
							System.out.print(a[2]);
							System.out.print(" ");
							System.out.print(a[3]);
							System.out.print(" ");
							System.out.print(a[4]);
							System.out.print(" ");
							System.out.print(a[5]);

						}

					}

				}

			}

		}

		return 0;

	}
}
