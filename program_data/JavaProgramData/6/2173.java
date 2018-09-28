package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //k??????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m; //m???,n???
		int n;
		int[][] a = new int[110][110]; //????????
		for (int i = 0;i < k;i++)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m > 1 && n > 1)
			{
				for (int t1 = 0;t1 < m;t1++)
				{
					for (int t2 = 0;t2 < n;t2++)
					{
					*(*(a + t1) + t2) = ConsoleInput.readToWhiteSpace(true);
					}
				}
				for (int k1 = 0;k1 < n;k1++)
				{
					 sum = sum + *(*(a + 0) + k1); //??????
				}
				for (int k2 = 0;k2 < n;k2++)
				{
					 sum = sum + *(*(a + m - 1) + k2); //??m???
				}
				for (int k3 = 0;k3 < m;k3++)
				{
					 sum = sum + *(*(a + k3) + 0); //??1???
				}
				for (int k4 = 0;k4 < m;k4++)
				{
					 sum = sum + *(*(a + k4) + n - 1); //??n???
				}
			   sum = sum - *(*(a + 0) + 0) - *(*(a + m - 1) + n - 1) - *(*(a + 0) + n - 1) - *(*(a + m - 1) + 0); //????????????
			   System.out.print(sum);
			   System.out.print("\n");
			}
			else if (m == 1 && n == 1)
			{
				sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(sum);
				System.out.print("\n");
			} //?????
			else if (m == 1 && n > 1)
			{
				for (int p1 = 0;p1 < n;p1++)
				{
					*(*(a + 0) + p1) = ConsoleInput.readToWhiteSpace(true);
					sum = sum + *(*(a + 0) + p1);
				}
				System.out.print(sum);
				System.out.print("\n");
			} //??1?
			else if (m > 1 && n == 1)
			{
				for (int p2 = 0;p2 < m;p2++)
				{
					*(*(a + p2) + 0) = ConsoleInput.readToWhiteSpace(true);
					sum = sum + *(*(a + p2) + 0);
				}
				System.out.print(sum);
				System.out.print("\n");
			} //??1?
		}
		return 0;
	}
}

