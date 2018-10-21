package <missing>;

public class GlobalMembers
{
	public static int[][] arr = new int[100][100];
	public static int row;
	public static int col;
	public static void bianli(int y,int x) //??x,y?????????
	{
		for (;y <= row != 0 && x>0;y++, x--)
		{
			System.out.print((*(arr + y) + x));
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				*(*(arr + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 1;i <= col;i++) //?????????
		{
			bianli(1, i);
		}
		for (int i = 2;i <= row;i++) //?????
		{
			bianli(i, col);
		}
		return 0;
	}
}

