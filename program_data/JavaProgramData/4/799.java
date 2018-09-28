package <missing>;

public class GlobalMembers
{
	//??(6-4) ?????????? ??? 20121208

	public static int row;
	public static int col;
	public static int[][] Mat = new int[111][111];

	public static void Out(int i,int j) //????????
	{
		System.out.print((*(Mat + i) + j));
		System.out.print("\n");
		if (i == row - 1 || j == 0)
		{
			return; //?????
		}
		else
		{
			Out(i + 1, j - 1);
		}
	}

	public static int Main()
	{
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//??
		for (int i = 0;i < row;i++)
		{
		for (int j = 0;j < col;j++)
		{
			*(*(Mat + i) + j) = ConsoleInput.readToWhiteSpace(true);
		}
		}

		for (int i = 0;i < col;i++)
		{
			Out(0, i);
		}

		for (int i = 1;i < row;i++)
		{
			Out(i, col - 1);
		}
	}

}

