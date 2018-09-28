package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k; i++)
		{
			int m;
			int n;
			int s;
			int t;
			int sum = 0;
			int[][] matrix = new int[100][100];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (s = 0; s < m; s++) //????
			{
				for (t = 0; t < n; t++)
				{
					*(*(matrix + s) + t) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (s = 0; s < n; s++) //??????
			{
				sum += *(*(matrix + 0) + s) + *(*(matrix + m - 1) + s);
			}
			for (s = 1; s < m - 1; s++) //??????
			{
				sum += *(*(matrix + s) + 0) + *(*(matrix + s) + n - 1);
			}
			if (m == 1 || n == 1) //???????????
			{
				sum /= 2;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

