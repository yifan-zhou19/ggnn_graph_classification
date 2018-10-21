package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[101][101];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(number + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		//cout<<number[0][0]<<endl;
		int k;
		for (i = 0;i < row + col - 1;i++)
		{
			j = 0;
			/*while(i-j>=0)
			{
				if(j>=row||i-j>=col)
					continue;
				cout<<*(*(number+j)+i-j)<<endl;
				j++;
			}*/
			for (j = 0;i - j >= 0;j++)
			{
				if (j >= row != 0 || i - j >= col)
				{
					continue;
				}
				System.out.print((*(number + j) + i - j));
				System.out.print("\n");

			}
		}
		return 0;
	}

}

