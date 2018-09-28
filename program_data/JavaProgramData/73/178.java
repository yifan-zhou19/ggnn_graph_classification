package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????**
	//*?????? **
	//*???2012.11.05**
	//********************************

	public static int Main()
	{
		int[][] a = new int[5][5]; //??5*5??a?flag????????
		int flag = 0;
		for (int i = 0; i < 5; i++) //??????????
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][3] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //???????
		for (int r = 0; r < 5; r++)
		{
			int k = 0; //??k???????????
			for (int j = 1; j < 5; j++) //???????????
			{
				if (a[r][k] < a[r][j])
				{
					k = j;
				}
			} //???????????k
			if (a[r][k] < a[(r + 4) % 5][k] && a[r][k] < a[(r + 1) % 5][k] && a[r][k] < a[(r + 2) % 5][k] && a[r][k] < a[(r + 3) % 5][k]) //????????????????5
			{
				flag = 1; //????????
				System.out.print(r + 1);
				System.out.print(" ");
				System.out.print(k + 1);
				System.out.print(" ");
				System.out.print(a[r][k]);
				System.out.print("\n");
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}

}

