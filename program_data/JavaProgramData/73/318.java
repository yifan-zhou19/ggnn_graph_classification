package <missing>;

public class GlobalMembers
{
	//*******************************************************************
	//????
	public static int Main() //???
	{
		int[][] a = new int[6][6]; //??
		int i;
		int j;
		int k;
		int t = 0;
		for (i = 0;i < 5;i++) //??
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++) //??????
		{
			for (j = 0;j < 5;j++)
			{
					t = 0; //???
					for (k = 0;k < 5;k++) //????
					{
						if (a[i][j] > a[i][k])
						{
							t++;
						}
						if (a[i][j] < a[k][j])
						{
							t++;
						}
					}
					if (t == 8) //??
					{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(a[i][j]);
						j = 5;
						i = 5; //????
					}
					else if (i == 4 && j == 4) //???
					{
						System.out.print("not found");
					}
			}
		}
			return 0; //?????
	}
}

