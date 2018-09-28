package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[100][100];
		int k;
		int i;
		int x;
		int y;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (x = 0;x < m;x++)
			{
				for (y = 0;y < n;y++)
				{
					*(*(number + x) + y) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (n == 1 && m == 1)
			{
				System.out.print(number);
				System.out.print("\n");
			}
			else
			{
				for (x = 0;x < m;x++)
				{
					sum += *(*(number + x));
					sum += *(*(number + x) + n - 1);
				}
				//cout<<sum<<endl;

				for (y = 0;y < n;y++)
				{
					sum += *((number) + y);
					sum += *(*(number + m - 1) + y);
				}
				//cout<<sum<<endl;
				sum = sum - *(number) - *((number) + n - 1) - *(*(number + m - 1)) - *(*(number + m - 1) + n - 1);
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

