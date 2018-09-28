package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{ //?????
		int x1; //????
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int k;
		int num = 0;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++) //???????????????
		{
			for (j = 0;j < x2;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++) //???????????????
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < x1;i++) //????
		{
			for (j = 0;j < y2;j++)
			{
				for (k = 0;k < x2;k++)
				{
				c[i][j] = c[i][j] + a[i][k] * b[k][j]; //??????????
				}
			}
		}
		for (i = 0;i < x1;i++) //????
		{
			for (j = 0;j < y2;j++)
			{
				System.out.print(c[i][j]);
				num++; //??????num??
				if (num % y2 == 0)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		return 0; //?????????????????????
	} //?????

}

