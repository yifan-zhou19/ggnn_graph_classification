package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int n = 0;
		int i;
		int j;
		int[][] a = new int[100 + 10][100 + 10];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		int buttom = row;
		int right = col;
		int left = 0;
		int top = 0;
		for (;;)
		{
			while (j <= right - 1)
			{
				n++;
				System.out.print(a[i][j++]);
				System.out.print("\n");
			}
			if (n == col * row)
			{
				break;
			}
			j--;
			i++;
			top++;
			while (i <= buttom - 1)
			{
				n++;
				System.out.print(a[i++][j]);
				System.out.print("\n");
			}
			if (n == col * row)
			{
				break;
			}
			i--;
			j--;
			right--;
			while (j >= left)
			{
				n++;
				System.out.print(a[i][j--]);
				System.out.print("\n");
			}
			if (n == col * row)
			{
				break;
			}
			j++;
			i--;
			buttom--;
			while (i >= top)
			{
				n++;
				System.out.print(a[i--][j]);
				System.out.print("\n");
			}
			if (n == col * row)
			{
				break;
			}
			i++;
			j++;
			left++;
		}
		return 0;
	}
}

