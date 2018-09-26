package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int j;
		int a;
		int b;
		int c;
		int k = 0;
		int[][] num = new int[100][100];
		h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;k < h * l;i++)
		{
			for (j = i;(j < l - i) && (k < h * l);j++)
			{
				System.out.print(num[i][j]);
				System.out.print("\n");
				k++;
			}
			for (j = i + 1;(j < h - i) && (k < h * l);j++)
			{
				System.out.print(num[j][l - 1 - i]);
				System.out.print("\n");
				k++;
			}
			for (j = l - 2 - i;(j >= i) && (k < h * l);j--)
			{
				System.out.print(num[h - 1 - i][j]);
				System.out.print("\n");
				k++;
			}
			for (j = h - 2 - i;(j > i) && (k < h * l);j--)
			{
				System.out.print(num[j][i]);
				System.out.print("\n");
				k++;
			}
		}
		return 0;
	}

}

