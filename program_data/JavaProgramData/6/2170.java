package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int[][] a = new int[100][100];
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int i = 0;i < m;i++) //???????
			{
				if (n > 1) //??????
				{
					sum += (**(a + i) + *(*(a + i) + n - 1));
				}
				else //????
				{
					sum += **(a + i);
				}
			}
			for (int i = 1;i < n - 1;i++)
			{
				if (m > 1) //????
				{
					sum += (*(a + i) + *(*(a + m - 1) + i));
				}
				else //????
				{
					sum += *(a + i);
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

