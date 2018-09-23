package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[100][100];
		int n;
		int min;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int a = 0;a < n;a++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int k = n;k > 1;k--)
			{
				for (int i = 0;i < k;i++)
				{
					min = *(p + i);
					for (int j = 1;j < k;j++)
					{
						if (*(*(p + i) + j) < min)
						{
							min = (*(p + i) + j);
						}
					}
					for (int j = 0;j < k;j++)
					{
						*(*(p + i) + j) = *(*(p + i) + j) - min;
					}
				}
				for (int j = 0;j < k;j++)
				{
					min = (p + j);
					for (int i = 1;i < k;i++)
					{
						if (*(*(p + i) + j) < min)
						{
							min = (*(p + i) + j);
						}
					}
					for (int i = 0;i < k;i++)
					{
						*(*(p + i) + j) = *(*(p + i) + j) - min;
					}
				}
				sum = sum + *(*(p + 1) + 1);
				for (int i = 1;i < k;i++)
				{
					for (int j = 0;j < k;j++)
					{
						*(*(p + i) + j) = *(*(p + i + 1) + j);
					}
				}
				for (int j = 1;j < k;j++)
				{
					for (int i = 0;i < k;i++)
					{
						*(*(p + i) + j) = *(*(p + i) + j + 1);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

