package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int p;
		int total;
		int[][] a = new int[110][110];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 1;p <= k;p++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total = 0;
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
					if ((i == 1) || (i == m))
					{
						total = total + *(*(a + i) + j);
					}
					//??????????????
				}
			}
		   for (i = 2;i < m;i++)
		   {
			   total = total + *(*(a + i) + 1) + *(*(a + i) + n); //?????????????
		   }
		   System.out.print(total);
		   System.out.print("\n");
		}

		return 0;
	}
}

