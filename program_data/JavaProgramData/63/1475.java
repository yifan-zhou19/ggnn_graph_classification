package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1200012827 **
	//*???2012.11.6  **
	//********************************
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] number1 = new int[m][n];
		int i;
		int j;
		for (i = 0;i <= m - 1;i++) //??m?n?????????
		{
			for (j = 0;j <= n - 1;j++)
			{
				int a;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				number1[i][j] = a;
			}
		}
		int p;
		int q;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] number2 = new int[p][q];

		for (i = 0;i <= p - 1;i++)
		{
			for (j = 0;j <= q - 1;j++) //??p?q?????????
			{
				int a;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				number2[i][j] = a;
			}
		}
		int[][] c = new int[m][q];
		int k;
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= q - 1;j++)
			{
				c[i][j] = 0;
				for (k = 0;k <= n - 1;k++)
				{
					c[i][j] += number1[i][k] * number2[k][j]; //??????????
				}
			}
		}

		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= q - 2;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			if (j == q - 1)
			{
					   System.out.print(c[i][j]);
					   System.out.print('\n');
			}
		}

		return 0;
	}
}

