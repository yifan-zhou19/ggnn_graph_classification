package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[L][L];
		int n;
		int i;
		int j;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			int lenth;
			int min;
			int sum;
			lenth = n - 1;
			sum = 0;
			while (lenth >= 1)
			{
				for (i = 0; i <= lenth; i++)
				{
					//??
					min = 2147483647;
					for (j = 0; j <= lenth; j++)
					{
						if (array[i][j] < min)
						{
							min = array[i][j];
						}
					}
					for (j = 0; j <= lenth; j++)
					{
						array[i][j] = array[i][j] - min;
					}
				}
				for (j = 0; j <= lenth; j++)
				{
					//??
					min = 2147483647;
					for (i = 0; i <= lenth; i++)
					{
						if (array[i][j] < min)
						{
							min = array[i][j];
						}
					}
					for (i = 0; i <= lenth; i++)
					{
						array[i][j] = array[i][j] - min;
					}
				}
				sum = sum + array[1][1];
				//??
				for (i = 0; i <= lenth; i++)
				{
					for (j = 1; j < lenth; j++)
					{
						array[i][j] = array[i][j + 1];
					}
				}
				for (j = 0; j <= lenth; j++)
				{
					for (i = 1; i < lenth; i++)
					{
						array[i][j] = array[i + 1][j];
					}
				}
				lenth = lenth - 1;
			}
			System.out.print(sum);
			if (k < n)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}



}

