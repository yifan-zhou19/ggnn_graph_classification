package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (count < n)
		{
			int[][] input = new int[100][100];
			int sum = 0;
			int[] p = new int[100];
			p = input;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}

			for (int i = 0;i < n - 1;i++)
			{
				for (int j = 0;j < n - i;j++)
				{
					int min = 100000;
					for (int k = 0;k < n - i;k++)
					{
						if (*(p[j] + k) < min)
						{
							min = (p[j] + k);
						}
					}
					for (int k = 0;k < n - i;k++)
					{
						*(p[j] + k) -= min;
					}
				}
				for (int j = 0;j < n - i;j++)
				{
					int min = 100000;
					for (int k = 0;k < n - i;k++)
					{
						if (*(p[k] + j) < min)
						{
							min = (p[k] + j);
						}
					}
					for (int k = 0;k < n - i;k++)
					{
						*(p[k] + j) -= min;
					}
				}
				sum += *(p[1] + 1);
				for (int j = 0;j < n - i;j++)
				{
					for (int k = 1;k < n - i - 1;k++)
					{
						*(p[j] + k) = *(p[j] + k + 1);
					}
				}
				for (int j = 0;j < n - i;j++)
				{
					for (int k = 1;k < n - i - 1;k++)
					{
						*(p[k] + j) = *(p[k + 1] + j);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			count++;
		}

		return 0;
	}
}

