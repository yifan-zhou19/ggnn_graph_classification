package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] num = new int[110][110];
			(int)(*p)[110];
			int sum = 0;
			int i;
			int j;
			p = num;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			p = num;
			for (j = 0;j < n;j++)
			{
				sum = sum + *(*p + j);
			}
			for (i = 1;i < m;i++)
			{
				sum = sum + *(*(p + i) + n - 1);
			}
			for (j = 0;j < n - 1;j++)
			{
				sum = sum + *(*(p + m - 1) + j);
			}
			for (i = 1;i < m - 1;i++)
			{
				sum = sum + *(*(p + i) + 0);
			}
			System.out.print(sum);
			System.out.print("\n");
			k--;
		}
			return 0;
	}




}

