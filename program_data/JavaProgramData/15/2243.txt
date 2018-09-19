package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[1002][1002];
		int flag = 0;
		int er;
		int ec;
		int sr;
		int sc;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}


		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (*(*(a + i) + j) == 0)
				{
					sr = i;
					sc = j;
					flag = 1;
					break;
				}

			}
			if (flag != 0)
			{
				break;
			}
		}

		flag = 0;


		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= 1;j--)
			{
				if (*(*(a + i) + j) == 0)
				{
					er = i;
					ec = j;
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
				break;
			}
		}

		System.out.print((er - sr - 1) * (ec - sc - 1));
		return 0;
	}






}

