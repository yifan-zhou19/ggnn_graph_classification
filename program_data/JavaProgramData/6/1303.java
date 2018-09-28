package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int m;
	int n;
	int count;
	int[][] a = new int[100][100];
	int[] p = a;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int temp = 0 ; temp < t ; temp++) //?n???
	{
		count = 0; //????
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < m; i++)
		{
			for (int j = 0 ; j < n; j++)
			{
				//cin >> a[i][j];//???? 
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 1 ; i < m - 1; i++) //?????????
		{
			count += a[i][0];
			count += a[i][n - 1];
		}
		for (int j = 0 ; j < n; j++) //?????????
		{
			count += a[0][j];
			count += a[m - 1][j];
		}
		System.out.print(count);
		System.out.print("\n");
	}
	return 0;
	}

}

