package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int n = 0;
		int[] cut = new int[100];
		int[][] sum = new int[100][100];
		int num = 0;
		int i = 0;
		int t = 0;
		int time1 = 0;
		int time2 = 0;
		int q = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++)
		{
			cut[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


			if (cut[i] == 0)
			{
				continue;
			}

			else
			{
				for (t = 1;t <= cut[i];t++)
				{
					sum[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				}
			}
		}

		for (i = 1;i <= n;i++)
		{
			q = cut[i];

			if (cut[i] == 0)
			{
				num = 60;
				System.out.print(num);
				System.out.print("\n");
			}

			else
			{
				for (t = 1; t <= q;t++)
				{
					time1 = sum[i][t] + 3 * (t - 1);
					time2 = time1 + 3;

					if (t == q && time2 <= 60)
					{
						num = 60 - q * 3;
						System.out.print(num);
						System.out.print("\n");
					}

					if (time1 <= 60 && time2 > 60 && time2 <= 63)
					{
						num = sum[i][t];
						System.out.print(num);
						System.out.print("\n");
						break;
					}

					if (time1 > 60)
					{
						num = 60 - 3 * (t - 1);
						System.out.print(num);
						System.out.print("\n");
						break;
					}

				}
			}

		}


		return 0;

	}

}

