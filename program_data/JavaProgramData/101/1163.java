package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int i;
		int j;
		int[] a = new int[4];
		int[] words = new int[4];

		char[] b = {'0', 'A', 'B', 'C'};

		for (a[1] = 1;a[1] <= 3;a[1]++)

		{

			for (a[2] = 1;a[2] <= 3;a[2]++)

			{

				a[3] = 6 - a[1] - a[2];

				words[1] = (a[2] > a[1]) + (a[1] == a[3]);

				words[2] = (a[1] > a[2]) + (a[1] > a[3]);

				words[3] = (a[3] > a[2]) + (a[1] < a[2]);

				if (a[1] == a[2] || a[1] == a[3] || a[2] == a[3])
				{

					continue;
				}

				if ((a[1] + words[1] != 3) || (a[2] + words[2] != 3) || (a[3] + words[3] != 3))
				{

					continue;
				}

				for (i = 1;i <= 3;i++)

				{

					for (j = 0;j <= 3;j++)

					{

						if (a[j] == i)
						{

							System.out.print(b[j]);
						}

					}

				}

			}

		}


				return 0;
	}
}
