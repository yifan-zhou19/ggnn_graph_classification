package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hangshu;
		int lieshu;
		int[][] array = new int[101][101];
		int i;
		int j;
		hangshu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lieshu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < hangshu; i++)
		{
			for (j = 0; j < lieshu; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int count = 0;
		int total = hangshu * lieshu;
		lieshu--;
		hangshu--;
		for (i = 0; i <= hangshu; i++)
		{
			for (j = i; j <= lieshu - i; j++)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				count++;
			}
			if (count == total)
			{
				break;
			}
			for (j = i + 1; j <= hangshu - i; j++)
			{
				System.out.print(array[j][lieshu - i]);
				System.out.print("\n");
				count++;
			}
			if (count == total)
			{
				break;
			}
			for (j = lieshu - i - 1; j >= i; j--)
			{
				System.out.print(array[hangshu - i][j]);
				System.out.print("\n");
				count++;
			}
			if (count == total)
			{
				break;
			}
			for (j = hangshu - i - 1; j >= i + 1; j--)
			{
				System.out.print(array[j][i]);
				System.out.print("\n");
				count++;
			}
			if (count == total)
			{
				break;
			}
		}
		return 0;
	}
}

