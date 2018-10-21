package <missing>;

public class GlobalMembers
{
	//******************************************************************************************
	//????????????????                                                         *
	//????wayne                                                                            *
	//?????10.27                                                                          *
	//******************************************************************************************
	public static int Main()
	{
		int[][] a = new int[101][101]; //??????
		int[][] b = new int[101][101];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int c;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++) //????????????
		{
			for (j = 1;j <= y1;j++) //????????????
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		System.out.print("\n");
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x2;i++) //????????????
		{
			for (j = 1;j <= y2;j++) //????????????
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		System.out.print("\n");
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				c = 0;
				for (k = 1;k <= x2;k++)
				{
					c = c + a[i][k] * b[k][j]; //?????????????i??j????
				}
				if (j < y2)
				{
					System.out.print(c);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

