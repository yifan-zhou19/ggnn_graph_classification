package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????  **
	//*?????? 1300012946 **
	//*???2013.11.28  **
	//********************************
	public static int[][] a = new int[9][9]; //???a????????????,???b??????????????????
	public static int[][] b = new int[9][9];
	public static void breed(int n)
	{
		if (n == 0) //??????0,?????
		{
			return;
		}
		int temp;
		int p;
		int q;
		int i;
		int j;
		for (p = 0 ; p < 9 ; p++) //???b?0
		{
			for (q = 0 ; q < 9 ; q++)
			{
				b[p][q] = 0;
			}
		}
		for (p = 0 ; p < 9 ; p++)
		{
			for (q = 0 ; q < 9 ; q++)
			{
				if (a[p][q] != 0)
				{
					temp = a[p][q]; //???????????
					for (i = p - 1 ; i <= p + 1 ; i++)
					{
						for (j = q - 1 ; j <= q + 1 ; j++)
						{
							b[i][j] += temp; //??????????????
						}
					}
				}
			}
		}
		for (p = 0 ; p < 9 ; p++)
		{
			for (q = 0 ; q < 9 ; q++) //??????????
			{
				a[p][q] += b[p][q];
			}
		}
		breed(n - 1);
	}


	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = 1; //m??????????1????m?
		breed(n); //????breed,??n????
		for (i = 0 ; i < 9 ; i++) //?????,?????????
		{
			System.out.print(m * a[i][0]);
			for (j = 1 ; j < 9 ; j++)
			{
				System.out.print(" ");
				System.out.print(m * a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

