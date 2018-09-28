package <missing>;

public class GlobalMembers
{
	//******************************************
	//?????????
	//??????
	//?????2010.11.05
	//????????????
	//******************************************
	public static int Main()
	{
		//??5?5???????????????????????
		int[][] a = new int[5][5];
		int min;
		int k;
		int m;
		int g = 0;
		int num;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5;j++)
			{
				k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = k;
			}
		} //for??????????
		for (int n = 0; n < 5; n++)
		{
			int max = 0;
			for (int j = 0; j < 5; j++)
			{
				if (a[n][j] > max)
				{
					max = a[n][j];
					num = j;
				}
			} //????????
			min = max;
			for (m = 0; m < 5;m++)
			{
				if (a[m][num] < min)
				{
					break;
				}
			} //???????????
			if (m == 5)
			{
				System.out.print(n + 1);
				System.out.print(" ");
				System.out.print(num + 1);
				System.out.print(" ");
				System.out.print(min);
				System.out.print("\n");
				g++;
			} //????????????????????
		}
		if (g == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}







}

