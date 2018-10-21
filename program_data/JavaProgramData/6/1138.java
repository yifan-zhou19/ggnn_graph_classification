package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t != 0)
		{
			t--;
			int m;
			int n;
			int i;
			int j;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[100][100];
			//cout<<"sum="<<sum;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					//cout<<a[i][j]<<' ';
					if (i == 0)
					{
						sum = sum + a[i][j];
					}
					if (i == m - 1)
					{
						sum = sum + a[i][j];
					}
					//cout<<'*'<<sum<<'*'<<' ';
				}
			}
			for (i = 1;i < m - 1;i++)
			{
				sum += a[i][0];
				sum += a[i][n - 1];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

