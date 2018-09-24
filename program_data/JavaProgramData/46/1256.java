package <missing>;

public class GlobalMembers
{
		///#define s 100
	public static int Main()
	{
		int row;
		int col;
		int[][] ew = new int[100][100];
		int a;
		int b;
		int p;
		int q;
		int i;
		int j;
		int e;
		int f;
		int m;
		int n;
		int min = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		e = row / 2;
		f = col / 2;
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ew[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row % 2 == 0 && col % 2 == 0)
		{
			if (e > f)
			{
				min = f;
			}
			if (e <= f)
			{
				min = e;
			}
		}
		if (row % 2 == 1 && col % 2 == 1)
		{
			if (e+1 > f + 1)
			{
				min = f + 1;
			}
			if (e+1 <= f + 1)
			{
				min = e+1;
			}
		}


		if (row % 2 == 1 && col % 2 == 0)
		{
			if (e+1 > f)
			{
				min = f;
			}
			if (e+1 <= f)
			{
				min = e+1;
			}
		}
		if (row % 2 == 0 && col % 2 == 1)
		{
			if (e > f + 1)
			{
				min = f + 1;
			}
			if (e <= f + 1)
			{
				min = e;
			}
		}
		if ((row % 2 == 0 && col % 2 == 0) || ((row % 2 == 1 && col % 2 == 0) && (e+1 > f)) || ((row % 2 == 0 && col % 2 == 1) && (f + 1 > e)))
		{



			for (i = 0;i <= min - 1;i++)
			{
				for (a = i;a <= col - i - 2;a++)
				{
					System.out.printf("%d\n",ew[i][a]);
				}
				for (b = i;b <= row - i - 2;b++)
				{
					System.out.printf("%d\n",ew[b][col - 1 - i]);
				}
				for (p = col - i - 1;p >= i + 1;p--)
				{
					System.out.printf("%d\n",ew[row - i - 1][p]);
				}
				for (q = row - 1 - i;q >= i + 1;q--)
				{
					System.out.printf("%d\n",ew[q][i]);
				}

			}
		}

		if (((col % 2 == 1) && (row % 2 == 0) && (f + 1 <= e)) || ((col % 2 == 1) && (row % 2 == 1) && (f + 1 <= e+1)))
		{


			for (i = 0;i <= min - 2;i++)
			{
				for (a = i;a <= col - i - 2;a++)
				{
					System.out.printf("%d\n",ew[i][a]);
				}
				for (b = i;b <= row - i - 2;b++)
				{
					System.out.printf("%d\n",ew[b][col - 1 - i]);
				}
				for (p = col - i - 1;p >= i + 1;p--)
				{
					System.out.printf("%d\n",ew[row - i - 1][p]);
				}
				for (q = row - 1 - i;q >= i + 1;q--)
				{
					System.out.printf("%d\n",ew[q][i]);
				}

			}


			for (m = min - 1;m <= row - min;m++)
			{
				System.out.printf("%d\n",ew[m][f]);
			}
		}

		if (((row % 2 == 1) && (col % 2 == 0) && (e+1 <= f)) || ((row % 2 == 1) && (col % 2 == 1) && (e+1 < f + 1)))
		{
			for (i = 0;i <= min - 2;i++)
			{
				for (a = i;a <= col - i - 2;a++)
				{
					System.out.printf("%d\n",ew[i][a]);
				}
				for (b = i;b <= row - i - 2;b++)
				{
					System.out.printf("%d\n",ew[b][col - 1 - i]);
				}
				for (p = col - i - 1;p >= i + 1;p--)
				{
					System.out.printf("%d\n",ew[row - i - 1][p]);
				}
				for (q = row - 1 - i;q >= i + 1;q--)
				{
					System.out.printf("%d\n",ew[q][i]);
				}

			}
			for (n = min - 1;n <= col - min;n++)
			{
				System.out.printf("%d\n",ew[e][n]);
			}
		}



					return 0;
	}


}

