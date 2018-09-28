package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int row; // h ?row l? col
		int col;
		int i;
		int j;
		int k;
		int h;
		int l;
		int count;
		int hzz;
		int lzz;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		// ??? ???i? ? i ??? lzz?? ??i????? row - i + 1 ? col - ?i - 1?
		// ?lzz?i ? ????i??? col - i + 1?
		// ?hzz?j ? ????j++??? row - j + 1?
		// ?lzz?col - i + 1??lzz-- ??? col - hzz + 1?
		// ?hzz?j? ? hzz???  row - hzz + 2 ?
		// ?????????????
		count = 0;
		h = row;
		l = col;
		hzz = 1;
		lzz = 1;
		i = 1;
		j = 1;
		while (count <= row * col)
		{
			for (lzz = j; lzz <= col - (j - 1); lzz++) //???????
			{
				System.out.print(a[i][lzz]);
				System.out.print("\n");
				count++;
				if (count == row * col)
				{
					return 0;
				}
			}
			j = lzz - 1; //?????????lzz+1
			for (hzz = i + 1; hzz <= row - i + 1; hzz++) // ?????
			{
				System.out.print(a[hzz][j]);
				System.out.print("\n");
				count++;
				if (count == row * col)
				{
					return 0;
				}
			}
			i = hzz - 1;
			for (lzz = j - 1; lzz >= col - j + 1; lzz--)
			{
				System.out.print(a[i][lzz]);
				System.out.print("\n");
				count++;
				if (count == row * col)
				{
					return 0;
				}
			}
			j = lzz + 1;
			for (hzz = i - 1; hzz >= row - i + 2; hzz--)
			{
				System.out.print(a[hzz][j]);
				System.out.print("\n");
				count++;
				if (count == row * col)
				{
					return 0;
				}
			}
			j = j + 1;
			i = hzz + 1;
		}
		return 0;
	}

}

