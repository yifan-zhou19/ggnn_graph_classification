package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1;
		int[][] num = new int[101][101];
		int i;
		int j;
		int k;
		int min = 99999;
		int sum = 0;
		int[] p = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			n1 = n;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				p = num;
			for (; n1 >= 2; n1--)
			{

				for (i = 0; i < n1; i++)
				{
					for (j = 0; j < n1; j++)
					{
						if (*(p[i] + j) < min)
						{
						   min = (p[i] + j);
						}
					}
					for (j = 0; j < n1; j++)
					{
						*(p[i] + j) -= min;
					}
					min = 99999;
				}
				min = 99999;
				for (j = 0; j < n1; j++)
				{
					for (i = 0; i < n1; i++)
					{
						if (*(p[i] + j) < min)
						{
							min = (p[i] + j);
						}
					}
					for (i = 0; i < n1; i++)
					{
						num[i][j] -= min;
					}
					min = 99999;
				}
				sum += *(p[1] + 1);
				min = 99999;
				for (i = 1; i < n1 - 1; i++)
				{
					for (j = 0; j < n1; j++)
					{
						*(p[i] + j) = *(p[i + 1] + j);
					}
				}
				for (j = 1; j < n1 - 1; j++)
				{
					for (i = 0; i < n1; i++)
					{
					*(p[i] + j) = *(p[i] + j + 1);
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

