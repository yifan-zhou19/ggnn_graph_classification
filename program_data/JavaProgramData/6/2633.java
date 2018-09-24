package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (m > 1 && n > 1)
			{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				sum += *((a) + j);
				sum += *(*(a + m - 1) + j);
			}
			for (i = 0;i < m;i++)
			{
				sum += *(*(a + i));
				sum += *(*(a + i) + n - 1);
			}
			sum = sum - *(a) - *(*(a + m - 1) + n - 1) - *((a) + n - 1) - *(*(a + m - 1));
			System.out.print(sum);
			System.out.print("\n");
			}
		else if (m == 1 && n == 1)
		{
			sum = 0;
			sum =  a;
			System.out.print(sum);
			System.out.print("\n");
		}
		else if (m == 1 && n > 1)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				sum += *((a) + j);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		else if (n == 1 && m > 1)
		{
			sum = 0;
			for (i = 0;i < m;i++)
			{
				sum += *(*(a + i));
			}
			System.out.print(sum);
			System.out.print("\n");
		}
			k--;
		}
	}
}

