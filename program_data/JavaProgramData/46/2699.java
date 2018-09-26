package <missing>;

public class GlobalMembers
{
	public static int row;
	public static int col;
	public static int[][] array = new int[MAXN][MAXN];
	public static int[][] sign = new int[MAXN][MAXN];

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(array,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sign,0,(Integer.SIZE / Byte.SIZE));
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int num = 0;
		int sxy = 0;
		int cxy = 0;
		int mrow = 0;
		int mcol = 0;
		; //0==x,1==y;0==left->right/down;1==right/up
		while (num < row * col)
		{
			if (sxy == 0)
			{
				while (mcol < col && mcol >= 0)
				{
					if (sign[mrow][mcol] == 0)
					{
						System.out.print(array[mrow][mcol]);
						System.out.print("\n");
						num++;
					}
					sign[mrow][mcol] = 1;
					if (cxy == 0)
					{
						if (mcol + 1 < col && sign[mrow][mcol + 1] == 0)
						{
							mcol++;
						}
						else
						{
							break;
						}
					}
					else
					{
						if (mcol - 1 >= 0 && sign[mrow][mcol - 1] == 0)
						{
							mcol--;
						}
						else
						{
							break;
						}
					}
				}
				sxy = 1;
			}
			else
			{
				while (mrow < row && mrow >= 0)
				{
					if (sign[mrow][mcol] == 0)
					{
						System.out.print(array[mrow][mcol]);
						System.out.print("\n");
						num++;
					}
					sign[mrow][mcol] = 1;
					if (cxy == 0)
					{
						if (mrow + 1 < row && sign[mrow + 1][mcol] == 0)
						{
							mrow++;
						}
						else
						{
							break;
						}
					}
					else
					{
						if (mrow - 1 >= 0 && sign[mrow - 1][mcol] == 0)
						{
							mrow--;
						}
						else
						{
							break;
						}
					}
				}
				sxy = 0;
				cxy = (cxy) != 0 ? 0 : 1;
			}
		}
	}
}

