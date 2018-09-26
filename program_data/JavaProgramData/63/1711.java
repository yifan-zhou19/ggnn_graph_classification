package <missing>;

public class GlobalMembers
{
	//******************************
	//*???????             **
	//*?????? 1300013007    **
	//*???2013.11.1            **
	//******************************
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int[][] a = new int[110][110];
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		int i = 0; //??????
		int j = 0;
		int m = 0;
		int n = 0;
		int p = 0;
		int q = 0;
		int l = 0;
		int k = 0;
		int h = 0;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0; m < x2; m++)
		{
			for (n = 0; n < y2; n++)
			{
				b[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (p = 0; p < x1; p++)
		{
			for (q = 0; q < y2; q++)
			{
				for (l = 0; l < y1; l++)
				{
					c[p][q] += a[p][l] * b[l][q]; //??c[p][q]
				}
			}
		}

		//???????????x1h?y2?
		for (k = 0; k < x1; k++)
		{
			for (h = 0; h < y2; h++)
			{
				System.out.print(c[k][h]);
				if (h != y2 - 1)
				{
					System.out.print(' ');
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

