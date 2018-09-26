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
			int[][] b = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[100][100];
			int[][] a = new int[100][100];
			for (i = 0;i < 100;i++)
			{
				for (j = 0;j < 100;j++)
				{
					a[i][j] = b[i][j];
				}
			}
			//cout<<"sum="<<sum;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(b + i) + j) = ConsoleInput.readToWhiteSpace(true);
					//cout<<a[i][j]<<' ';
					if (i == 0)
					{
						sum = sum + **(*(a + i) + j);
					}
					if (i == m - 1)
					{
						sum = sum + **(*(a + i) + j);
					}
					//cout<<'*'<<sum<<'*'<<' ';
				}
			}
			for (i = 1;i < m - 1;i++)
			{
				sum += ***(a + i);
				sum += **(*(a + i) + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

