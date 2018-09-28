package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int d;
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m; //???
		for (d = 1;d <= n;d++) //????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,100 * (Integer.SIZE / Byte.SIZE)); //???
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (a[i][j] == 0)
					{
						continue;
					}
					b[i][j] += a[i][j] * 2;
					b[i + 1][j] += a[i][j];
					b[i - 1][j] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i - 1][j - 1] += a[i][j];
				} //??????9??????
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,100 * (Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j] = b[i][j]; //?b??a?????????
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		} //??
		return 0;
	}
}

