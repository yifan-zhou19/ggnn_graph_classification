package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//??????????
	//??????
	//***********************************************************************
	public static int[][] array = new int[100][100];
	public static void out1(int row, int col)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p; //????
		for (int i = 0; i < row; i++) //?????
		{
			p = array[i];
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1; j < col; j++)
			{
				*++p = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0; i < col; i++) //????????????????????
		{
			p = array[0][i]; //?????
			System.out.print(p);
			System.out.print("\n");
			for (int j = 1; j <= i; j++)
			{
				p = p + 99;
				System.out.print(p);
				System.out.print("\n");
			}
		}
		for (int i = 1; i < row - col; i++)
		{
			p = array[i];
			p = p + col - 1;
			System.out.print(p);
			System.out.print("\n");
			for (int j = 1; j < col; j++)
			{
				p = p + 99;
				System.out.print(p);
				System.out.print("\n");
			}
		}
		for (int i = row - col; i < row; i++)
		{
			p = array[i];
			p = p + col - 1;
			System.out.print(p);
			System.out.print("\n");
			for (int j = 1; j < row - i; j++)
			{
				p = p + 99;
				System.out.print(p);
				System.out.print("\n");
			}
		}
	}
	public static void out2(int row, int col)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (int i = 0; i < row; i++)
		{
			p = array[i];
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1; j < col; j++)
			{
				*++p = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0; i < row; i++)
		{
			p = array[0][i];
			System.out.print(p);
			System.out.print("\n");
			for (int j = 1; j <= i; j++)
			{
				p = p + 99;
				System.out.print(p);
				System.out.print("\n");
			}
		}
		for (int i = row; i < col; i++)
		{
			p = array[0];
			p = p + i;
			System.out.print(p);
			System.out.print("\n");
			for (int j = 1; j < row; j++)
			{
				p = p + 99;
				System.out.print(p);
				System.out.print("\n");
			}
		}
		for (int i = 1; i < row ; i++)
		{
			p = array[i];
			p = p + col - 1;
			System.out.print(p);
			System.out.print("\n");
			for (int j = 1; j < row - i; j++)
			{
				p = p + 99;
				System.out.print(p);
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (row > col)
		{
			out1(row, col);
		}
		else
		{
			out2(row, col);
		}
		return 0;
	}
}

