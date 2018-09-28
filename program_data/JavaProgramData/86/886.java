package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//*  ????1000012846_6.cpp *********************************
	//*  ????? ***********************************************
	//*  ?????2010?11? *************************************
	//*  ????????? ***************************************
	//*************************************************************
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[][] a = new int[100][20];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		//??????i,j??????n;??a,b,c,d
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++) //???????????
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0 ; j < b[i] ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			//???????????????????????c[];??????d[];       
			d[i] = b[i];
			c[i] = a[i][b[i] - 1];
			for (j = 0 ; j < b[i] ; j++)
			{
				if (a[i][j] + j * 3 > 60)
				{
					c[i] = a[i][j - 1];
					d[i] = j;
					break;
				}
			}
		}
		for (i = 0 ; i < n ; i++) //?3?????
		{
			if (b[i] == 0) //??????????
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else if (c[i] + d[i] * j > 60) //??????????????????????
			{
				System.out.print(c[i]);
				System.out.print("\n");
			}
			else //?????????????????????60???
			{
				System.out.print(60 - d[i] * 3);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

