package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????  **
	//*?????? 1300012946 **
	//*???2013.11.1  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int p;
		int q = 0;
		int count = 0;
		for (i = 0 ; i < 5 ; i++)
		{
			for (j = 0 ; j < 5 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i < 5 ; i++)
		{
			for (j = 0 ; j < 5 ; j++)
			{
				for (p = 0 ; p < 5 ; p++)
				{
					if (a[i][j] > a[i][p])
					{
						count++;
					}
				}
				for (p = 0 ; p < 5 ; p++)
				{
					if (a[i][j] < a[p][j])
					{
						count++;
					}
				}
				if (count == 8)
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					q++;
				}
				count = 0;
			}
		}
			if (q == 0)
			{
				System.out.print("not found");
			}
			return 0;
	}

}

