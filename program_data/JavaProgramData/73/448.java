package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       **
	//*?????? 1100012920              **
	//*???2011.10.19                     **
	//****************************************
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int m = 0;
		int n = 0;
		int flag = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 4; j++)
			{
				if (a[i][j + 1] > a[i][m])
				{
					m = j + 1;
				}
			}
			for (k = 0; k < 5; k++)
			{
				if (a[k][m] < a[i][m])
				{
					break;
				}
				else
				{
					n = 1;
				}
			}
			if (k == 5)
			{
				flag = 1;
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(m + 1);
				System.out.print(" ");
				System.out.print(a[i][m]);
				System.out.print("\n");
			}
			m = 0;

		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

