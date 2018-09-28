package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int max;
		int b;
		int c;
		int m = 0;
		for (i = 0;i < 5;i++)
		{
						for (j = 0;j < 5;j++)
						{
										String tempVar = ConsoleInput.scanfRead();
										if (tempVar != null)
										{
											a[i][j] = Integer.parseInt(tempVar);
										}
						}

		}

		 for (i = 0;i < 5;i++)
		 {
						max = 0;
						for (j = 0;j < 5;j++)
						{
										if (max < a[i][j])
										{
													   max = a[i][j];
													   b = i;
													   c = j;
										}
						}
						if (max <= a[0][c] != 0 && max <= a[1][c] != 0 && max <= a[2][c] != 0 && max <= a[3][c] != 0 && max <= a[4][c])
						{
						m = 1;
						break;
						}

		 }
		if (m != 0)
		{
		System.out.printf("%d %d %d",b + 1,c + 1,a[b][c]);
		}
		else
		{
		System.out.print("not found");
		}
		return 0;
	}
}

