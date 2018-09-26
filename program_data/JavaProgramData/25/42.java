package <missing>;

public class GlobalMembers
{
	//********************************
	//* ??????2?N??         *
	//* ??????                 *
	//* ???2010-12-16             *
	//* ?????2?N??           *
	//********************************



	public static void product(int[] res, int N)
	{
		int i;
		int j;

		for (i = 1; i <= N; i++)
		{
			for (j = 0; j < 199; j++)
			{
				res[j] = res[j] * 2;
			}
			for (j = 0; j < 199; j++)
			{
				if (res[j] >= 10)
				{
					res[j + 1] += res[j] / 10;
					res[j] = res[j] % 10;
				}
			}

		}
		for (i = 199; i >= 0; i--)
		{
			if (res[i] != 0)
			{
				for (j = i; j >= 0; j--)
				{
					System.out.print(res[j]);
				}
				break;
			}
		}
		return;
	}

	public static int Main()
	{
		int[] res = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int N;

		for (int i = 1; i < 200; i++)
		{
			res[i] = 0;
		}
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (N == 0)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else
		{
			product(res, N);
		}

		return 0;
	}


}

