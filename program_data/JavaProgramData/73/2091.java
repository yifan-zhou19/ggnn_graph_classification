package <missing>;

public class GlobalMembers
{
	//**************************************
	//?????????
	//??????
	//?????2011.10.29 19:58
	//**************************************
	public static int Main()
	{
		int[][] number = new int[5][5]; //?????
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
						for (j = 0;j < 5;j++)
						{
							number[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
		}
		int maxnumber;
		int l;
		int[][] max1 = new int[5][5]; //max1?max2??????????
		int[][] max2 = new int[5][5];
		for (i = 0;i < 5;i++) //???????????
		{
						maxnumber = number[i][0];
						max1[i][0] = 1;
						l = 0;
						for (j = 1;j < 5;j++)
						{
										if (maxnumber < number[i][j])
										{
											maxnumber = number[i][j];
										max1[i][j] = 1;
										max1[i][l] = 0;
										l = j;
										}
						}
		}
		for (i = 0;i < 5;i++) //??????????
		{
						maxnumber = number[0][i];
						max2[0][i] = 1;
						l = 0;
						for (j = 1;j < 5;j++)
						{
										if (maxnumber > number[j][i])
										{
											maxnumber = number[j][i];
										max2[j][i] = 1;
										max2[l][i] = 0;
										l = j;
										}
						}
		}
		int judge = 0; //judge??????????
		for (i = 0;i < 5;i++) //????????
		{
						for (j = 0;j < 5;j++)
						{
										if (max1[i][j] != 0 && max2[i][j] != 0)
										{
											System.out.print(i + 1);
											System.out.print(" ");
											System.out.print(j + 1);
											System.out.print(" ");
											System.out.print(number[i][j]);
										judge = 1;
										}
						}
		}
		if (judge == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

