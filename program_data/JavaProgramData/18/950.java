package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int num;
		(int)(*p)[200];
		int t;
		int temp;
		int[][] a = new int[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		num = 0;
		p = a;
		for (t = 1; t <= n; t++)
		{
			sum = 0;
			num = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (num < n - 1)
			{
			for (i = 0; i < n - num; i++)
			{
				temp = 1000;
				for (j = 0; j < n - num; j++)
				{
					if (*(*(p + i) + j) < temp)
					{
						temp = (*(p + i) + j);
					}
				}
				for (j = 0; j < n - num; j++)
				{
					*(*(p + i) + j) = *(*(p + i) + j) - temp;
				}
			}
			for (j = 0; j < n - num; j++)
			{
				temp = 1000;
				for (i = 0; i < n - num; i++)
				{
					if (*(*(p + i) + j) < temp)
					{
						temp = (*(p + i) + j);
					}
				}
				for (i = 0; i < n - num; i++)
				{
					*(*(p + i) + j) = *(*(p + i) + j) - temp;
				}
			}
			sum = sum + *(*(p + 1) + 1);
			for (i = 2; i < n - num; i++)
			{
				for (j = 0; j < n - num; j++)
				{
					*(*(p + i - 1) + j) = *(*(p + i) + j);
				}
			}
			for (j = 2; j < n - num; j++)
			{
				for (i = 0; i < n - num; i++)
				{
					*(*(p + i) + j - 1) = *(*(p + i) + j);
				}
			}
			num++;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

