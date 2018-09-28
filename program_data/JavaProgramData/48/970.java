//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static void function()
	{
		int[][] rem = new int[10][10];
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				rem[i][j] = 0;
			}
		}

		for (int i = 2;i <= 8;i++)
		{
			for (int j = 2;j <= 8;j++)
			{
				if (a[i][j] != 0)
				{
					rem[i][j] = rem[i][j] + a[i][j] * 2;
					rem[i - 1][j - 1] += a[i][j];
					rem[i - 1][j] += a[i][j];
					rem[i - 1][j + 1] += a[i][j];
					rem[i][j - 1] += a[i][j];
					rem[i][j + 1] += a[i][j];
					rem[i + 1][j - 1] += a[i][j];
					rem[i + 1][j] += a[i][j];
					rem[i + 1][j + 1] += a[i][j];
					a[i][j] = 0;
				}
			}
		}

		for (int i = 2;i <= 8;i++)
		{
			if (a[1][i] != 0)
			{
				rem[1][i] += a[1][i] * 2;
				int x = a[1][i] * 8 / 5;
				rem[1][i + 1] += x;
				rem[1][i - 1] += x;
				rem[2][i + 1] += x;
				rem[2][i - 1] += x;
				rem[2][i] += x;
				a[1][i] = 0;
			}
			if (a[9][i] != 0)
			{
				rem[9][i] += a[9][i] * 2;
				int x = a[9][i] * 8 / 5;
				rem[9][i + 1] += x;
				rem[9][i - 1] += x;
				rem[8][i + 1] += x;
				rem[8][i - 1] += x;
				rem[8][i] += x;
				a[9][i] = 0;
			}
			if (a[i][1] != 0)
			{
				rem[i][1] += a[i][1] * 2;
				int x = a[i][1] * 8 / 5;
				rem[i + 1][1] += x;
				rem[i - 1][1] += x;
				rem[i + 1][2] += x;
				rem[i - 1][2] += x;
				rem[i][2] += x;
				a[i][1] = 0;
			}
			if (a[i][9] != 0)
			{
				rem[i][9] += a[i][9] * 2;
				int x = a[i][9] * 8 / 5;
				rem[i + 1][9] += x;
				rem[i - 1][9] += x;
				rem[i + 1][8] += x;
				rem[i - 1][8] += x;
				rem[i][8] += x;
				a[i][1] = 0;
			}
		}

		if (a[1][1] != 0)
		{
			rem[1][1] = a[1][1] * 2;
			int x = a[1][1] * 8 / 3;
			rem[1][2] += x;
			rem[2][1] += x;
			rem[2][2] += x;
			a[1][1] = 0;
		}
		if (a[1][9] != 0)
		{
			rem[1][9] = a[1][9] * 2;
			int x = a[1][9] * 8 / 3;
			rem[1][8] += x;
			rem[2][8] += x;
			rem[2][9] += x;
			a[1][9] = 0;
		}
		if (a[9][1] != 0)
		{
			rem[9][1] = a[9][1] * 2;
			int x = a[9][1] * 8 / 3;
			rem[9][2] += x;
			rem[8][1] += x;
			rem[8][2] += x;
			a[1][1] = 0;
		}
		if (a[9][9] != 0)
		{
			rem[9][9] = a[9][9] * 2;
			int x = a[9][9] * 8 / 3;
			rem[9][8] += x;
			rem[8][8] += x;
			rem[8][9] += x;
			a[9][9] = 0;
		}


	   for (int i = 1;i <= 9;i++)
	   {
			for (int j = 1;j <= 9;j++)
			{
				a[i][j] = a[i][j] + rem[i][j];
			}
	   }

	   /*for(int i=1;i<=9;i++){
			for(int j=1;j<=8;j++)
				cout<<a[i][j]<<" ";
			cout<<a[i][9];
			cout<<endl;
		}*/
	}
	public static int Main()
	{
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j <= 9;j++)
			{
				a[i][j] = 0;
			}
		}
		int n;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;

		for (int i = 1;i <= d;i++)
		{
			function();
		}


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


