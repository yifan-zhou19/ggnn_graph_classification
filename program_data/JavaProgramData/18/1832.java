package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int n)
	{
			int[] minx = new int[100]; //minx is the minum of the row, miny is the minum of the column
			int[] miny = new int[100];
			int num;

			for (int l = 0; l < 100; l++)
			{
					minx[l] = INT_MAX;
					miny[l] = INT_MAX;
			}

			for (int i = 0; i < n; i++)
			{
					for (int j = 0; j < n; j++)
					{
							if (a[i][j] < minx[i])
							{
								minx[i] = a[i][j];
							}
					}
			}

			for (int i = 0; i < n; i++)
			{
					for (int j = 0; j < n; j++)
					{
							a[i][j] -= minx[i];
					}
			}

			for (int i = 0; i < n; i++)
			{
					for (int j = 0; j < n; j++)
					{
							if (a[i][j] < miny[j])
							{
								miny[j] = a[i][j];
							}
					}
			}

			for (int i = 0; i < n; i++)
			{
					for (int j = 0; j < n; j++)
					{
							a[i][j] -= miny[j];
					}
			}
			num = a[1][1];
			return num;
	}

	public static int Main()
	{
			int n;
			int k = 0;
			int[][] a = new int[100][100];
			int sum = 0;
			int m = 0; //count the number of cut the matrix

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while (k < n)
			{
					sum = 0;
				  m = 0;
					for (int i = 0; i < n; i++)
					{
						for (int j = 0; j < n; j++)
						{
								a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
					}

					while (m < n - 1)
					{
						sum += change(a, n - m);

						for (int i = 0; i < n - m; i++) //cut the matrix's colomn
						{
								for (int j = 2; j < n - m; j++)
								{
										a[i][j - 1] = a[i][j];
								}
						}

						for (int j = 0; j < n - m; j++) //cut the matrix's row
						{
								for (int i = 2; i < n - m; i++)
								{
										a[i - 1][j] = a[i][j];
								}
						}
						m++;
					}

					System.out.print(sum);
					System.out.print("\n");

				k++;
			}

			return 0;
	}

}

