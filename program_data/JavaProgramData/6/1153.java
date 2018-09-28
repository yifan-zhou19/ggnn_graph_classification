package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int j;
		int sum;
		int[][] a = new int[101][101];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;t > 0;t--)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0; //????
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (i = 0;i < m;i++)
			{
				sum += *(*(a + i)); //???
			}
			for (i = 0;i < m;i++)
			{
				sum += *(*(a + i) + n - 1); //????
			}
			for (j = 1;j < n - 1;j++)
			{
				sum += *((a) + j); //???
			}
			for (j = 1;j < n - 1;j++)
			{
				sum += *(*(a + m - 1) + j); //????
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

