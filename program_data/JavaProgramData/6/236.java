package <missing>;

public class GlobalMembers
{
	// ?????? ???1000010500 
	// ?????????? 
	// 2010-12-8


	public static int Main()
	{
		int a;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] b = new int[100][100];
		int sum = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < a;k++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 0;i < m;i++)
			{
				sum += *(*(b + i)) + *(*(b + i) + n - 1); // ?
			}
			for (i = 1;i < n - 1;i++)
			{
				sum += *(b + i) + *(*(b + m - 1) + i); // ?
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}



}

