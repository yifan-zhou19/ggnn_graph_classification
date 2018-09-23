package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int m;
		int k;
		int sum;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1 ; m <= n ; m++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			sum = 0;
			for (i = 0 ; i < n ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (k = 0 ; k < n - 1 ; k++)
			{

				for (i = 0 ; i < n - k ; i++)
				{
					min = 100000;
					for (j = 0 ; j < n - k ; j++)
					{
						if (*(*(a + i) + j) < min)
						{
							min = (*(a + i) + j);
						}
					}
					for (j = 0 ; j < n - k ; j++)
					{
						*(*(a + i) + j) -= min;
					}
				}

				for (i = 0 ; i < n - k ; i++)
				{
					min = 100000;
					for (j = 0 ; j < n - k ; j++)
					{
						if (*(*(a + j) + i) < min)
						{
							min = (*(a + j) + i);
						}
					}
					for (j = 0 ; j < n - k ; j++)
					{
						*(*(a + j) + i) -= min;
					}
				}
				sum += *(*(a + 1) + 1);
				for (i = 1 ; i < n ; i++)
				{
					for (j = 0 ; j < n ; j++)
					{
						*(*(a + i) + j) = *(*(a + i + 1) + j);
					}
				}
				for (i = 1 ; i < n ; i++)
				{
					for (j = 0 ; j < n ; j++)
					{
						*(*(a + j) + i) = *(*(a + j) + i + 1);
					}
				}

			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

