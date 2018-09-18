package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] a = new int[100][100];
		int j;
		int k;
		int min;
		int number = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					*(*(a + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
				m = n;
				number = 0;
		while (m != 1)
		{
			for (j = 0;j < m;j++)
			{
				min = (*(a + j) + 0);
				for (k = 1;k < m;k++)
				{
					min = (min > *(*(a + j) + k))?*(*(a + j) + k):min;
				}
				for (k = 0;k < m;k++)
				{
					*(*(a + j) + k) = *(*(a + j) + k) - min;
				}
			}
			for (j = 0;j < m;j++)
			{
				min = ((a) + j);
				for (k = 1;k < m;k++)
				{
					min = (min > *(*(a + k) + j))?*(*(a + k) + j):min;
				}
				for (k = 0;k < m;k++)
				{
					*(*(a + k) + j) = *(*(a + k) + j) - min;
				}
			}
			number = number + *(*(a + 1) + 1);
			for (j = 1;j < m;j++)
			{
				*(*(a + 0) + j) = *(*(a + 0) + j + 1);
			}
			for (j = 1;j < m;j++)
			{
				*(*(a + j) + 0) = *(*(a + j + 1) + 0);
			}
			for (j = 2;j < m;j++)
			{
				for (k = 2;k < m;k++)
				{
			*(*(a + k - 1) + j - 1) = *(*(a + k) + j);
				}
			}
				m = m - 1;
		}
		System.out.print(number);
		System.out.print("\n");
		}
		return 0;
	}
}

