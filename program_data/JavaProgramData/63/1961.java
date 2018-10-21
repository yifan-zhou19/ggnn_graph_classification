package <missing>;

public class GlobalMembers
{
	//******************************
	//???:3.cpp
	//??: ??? 1300012754
	//??:2013.11.1
	//??:????
	//******************************
	public static int Main()
	{
		int x1; //????????x1,y1;????????x2,y2;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[110][110];
		int[][] b = new int[110][110]; //???????
		int[][] c = new int[110][110]; //???????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE)); //???????

		int i; //????
		int j;

		//???????????????????????????????????????
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++) //??????????????x1,y2??????
			{
				//????C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ..... + A[i][q]*B[q][j]?????????
				for (int k = 1; k <= y1; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		//??????
		for (i = 1; i <= x1; i++)
		{
			System.out.print(c[i][1]);
			for (j = 2; j <= y2; j++) //????????????????
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

