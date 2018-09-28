package <missing>;

public class GlobalMembers
{
	//**********************************************************************************************
	//??????????                                                                         *
	//????:10.21                                                                               *    
	//???:wayne???????????????????????????????????????? *
	//**********************************************************************************************
	public static int Main()
	{
		int n; //?b[]???????????
		int[][] a = new int[1000][61];
		int i;
		int j;
		int[] b = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b[i] == 0) //??????????????
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
			for (j = 1;j <= b[i];j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print("\n");
			for (j = b[i];j >= 1;j--) //??????????
			{
				if (a[i][j] + j * 3 <= 60)
				{
					System.out.print(60 - j * 3);
					System.out.print("\n");
					break;
				} //??????????????
				else if ((a[i][j] + (j - 1) * 3) <= 60)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					break;
				} //??????????????????????
			}
			}
		}
		return 0;
	}
}

