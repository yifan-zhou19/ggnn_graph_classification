package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//*???7-4.cpp                                                         
	//*???????                                                     
	//*??????                                                          
	//*???2013?11?10?                                                   
	//************************************************************************
	public static int Main()
	{
		int[][] a = new int[7][7];
		int i;
		int j;
		int k;
		int flag;
		int max;
		int maxj;

		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = a[i][0]; //??????????????
			maxj = 0; //???????
			flag = 1; //??????
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j]; //??????????????
					maxj = j;
				}
			}
			for (k = 0; k < 5; k++) //????????????
			{
				if (a[k][maxj] < max)
				{
					flag = 0; //????????????????
					break;
				}
			}
			if (flag != 0) //???????????????????
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(maxj + 1);
				System.out.print(" ");
				System.out.print(a[i][maxj]);
				System.out.print("\n");
				break;
			}
		}
		if (flag == 0) //???????????????????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

